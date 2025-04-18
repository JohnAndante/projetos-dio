package dio.web.api.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message, Object... params) {
        super(MessageFormat.format(message, params));
    }
}
