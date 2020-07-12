package cloud.result;

public enum ResultCode {
    SUCCESS("0000", true,"操作成功"),
    FAILED("9999", false,"操作失败");

    private String code;
    private String message;
    private Boolean isSuccess;

    private ResultCode(String code, Boolean isSuccess, String message) {
        this.code = code;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }
}
