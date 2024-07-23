package dio.web.api.handler;

public class ResponseError {
    private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 500;
    private String error;

    //getters e setters

    public ResponseError(String error) {
        this.error = error;
    }

    public ResponseError(int statusCode, String error) {
        this.statusCode = statusCode;
        this.error = error;
    }

    public ResponseError(String status, int statusCode, String error) {
        this.status = status;
        this.statusCode = statusCode;
        this.error = error;
    }

    public ResponseError(Date timestamp, String status, int statusCode, String error) {
        this.timestamp = timestamp;
        this.status = status;
        this.statusCode = statusCode;
        this.error = error;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "{" +
            " timestamp='" + getTimestamp() + "'" +
            ", status='" + getStatus() + "'" +
            ", statusCode='" + getStatusCode() + "'" +
            ", error='" + getError() + "'" +
            "}";
    }


}
