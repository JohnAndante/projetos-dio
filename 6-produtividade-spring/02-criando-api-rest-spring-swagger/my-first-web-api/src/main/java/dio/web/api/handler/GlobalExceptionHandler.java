import javax.annotation.Resource;
import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Resource
    private MessageSource messageSource;
    private HttpHeaders headers() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    private ResponseError responseError(HttpStatus status, String error) {
        ResponseError responseError = new ResponseError();
        responseError.setStatus("error");
        responseError.setError(error);
        responseError.setStatusCode(status.value());
        return responseError;
    }

    @ExceptionHandler(Exception.class)
    private ResponseEntity<Object> handleGeneral(Exception e,  WebRequest request) {
        if (e.getClass().isAssignableFrom(UndeclaredThrowableException.class)) {
            Throwable undeclaredThrowable = ((UndeclaredThrowableException) e).getUndeclaredThrowable();
            return handleGeneral((Exception) undeclaredThrowable, request);
        } else {
            ResponseError error = responseError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
            return handleExceptionInternal(e, error, headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) {
        ResponseError error = responseError(HttpStatus.BAD_REQUEST, e.getMessage());
        return handleExceptionInternal(e, error, headers(), HttpStatus.BAD_REQUEST, request);
    }


}
