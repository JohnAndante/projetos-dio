# Exception Handlers

O tratamento de exceção, na ciência da computação, é o mecanismo responsável pelo tratamento da ocorrência de condições que alteram o fluxo normal da execução de programas de computadores.

Nossas aplicações precisam ser resilientes a possíveis comportamentos inesperados baseados na proposta de negócio, e falando de recursos HTTPs, realizamos implementações que centralizam e gerenciam esse tipo de tramamento de exceções.

## Exception Handler

Um manipulador de exceção é o código que estipula o que um programa fará quando um evento anômalo interromper o fluxo normal das instruções desse programa.

### Solução 1: Nível do **Controller** - *@ExceptionHandler*

A primeira solução funciona no nível do *@Controller*, onde cada método trata uma exceção de forma declarativa com a anotação *@ExceptionHandler*.

```java

public class MeuController {
    //...
    @ExceptionHandler({ MinhaExcecao.class })
    public void meuMetodo() {
        //...
    }
}

```

### Solução 2: o *ResponseStatusExceptionResolver*

Sua principal responsabilidade é usar a anotação *@ResponseStatus* disponível em exceções personalizadas e mapear essas exceções para códigos de status HTTP.

```java

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNotFoundException extends RuntimeException {
    public RecursoNotFoundException(String message) {
        super(message);
        //...
    }
}

```

## RestControllerAdvice

O Spring 3.2 traz suporte para um *@ExceptionHandler* global com a anotação *@ControllerAdvice*.
A anotação *@ControllerAdvice* nos permite consolidar nossos múltiplos *@ExceptionHandlers* espalhados de antes em um único componente global de tratamento de erros.

* Isso nos dá controle total sobre o corpo da resposta, bem como o código de status.
* Ele fornece o mapeamento de várias exceções ao mesmo método, para serem tratadas em conjunto.
* Ele faz bom uso da resposta RESTful *Response Entity* mais recente.

### Customizando nossas mensagens

Primeiro de tudo: uma resposta HTTP, mesmo sendo um *Erro*, pode ser considerada um *Objeto* que será convertido para JSON expondo então informações relacionadas a exceção disparada.

```java

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 500;
    private String error;

    // getters e setters
}

```

* **timestamp**: data e hora em que o erro ocorreu.
* **status**: status da resposta de acordo com o domínio de negócio, ou seja, de acordo com o que foi implementado.
* **statusCode**: código de status HTTP de acordo com o erro.
* **error**: mensagem de erro que será retornada ao cliente.

### Definindo uma exceção de negócio

Algumas das nossas exceções estão relacionadas ao seu domínio ou negócio da nossa aplicação.

```java
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

```

A classe `BusinessException`possui três construtores, onde o primeiro recebe uma mensagem de erro, o segundo recebe uma mensagem e uma causa, e o terceiro recebe uma mensagem e um array de parâmetros.

```java
public static void main(String[] args) {
    Integer id = 123;
    String tabela = "Livro";

    throw new BusinessException("Registro não encontrado para o ID {0} na tabela {1}", id, tabela);
}

```

### Configurado o Exception Handler

A classe abaixo captará todas as exceções de negócio `BusinessException`para então tratar e retornar mensagens mais declarativas ao cliente.

```java
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
        responseError.setStatusCode(status.value());
        responseError.setError(error);
        return responseError;
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) {
        ResponseError error = responseError(HttpStatus.BAD_REQUEST, e.getMessage());
        return handleExceptionInternal(e, error, headers(), HttpStatus.BAD_REQUEST, request);
    }


}



