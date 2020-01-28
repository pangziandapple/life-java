package apple.pangzi.common.view.model;

public class ApiResult {

    private Integer code;

    private String message;

    public static ApiResult success() {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(0);
        return apiResult;
    }

    public static ApiResult error(String message) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(-1);
        apiResult.setMessage(message);
        return apiResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
