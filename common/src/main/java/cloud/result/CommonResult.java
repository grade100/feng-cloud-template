package cloud.result;

import lombok.Data;

/**
 * @program: feng-cloud-template
 * @description: 统一返回bean
 * @author: feng
 * @create: 2020-07-13 04:28
 **/
@Data
public class CommonResult <T> {
    private String code;
    private String message;
    private Boolean isSuccess;
    private T data;

    protected CommonResult() {
    }

    public CommonResult(String code, Boolean isSuccess, String message, T data) {
        this.code = code;
        this.message = message;
        this.isSuccess = isSuccess;
        this.data = data;
    }

    public CommonResult(String code, Boolean isSuccess, String message) {
        this.code = code;
        this.isSuccess = isSuccess;
        this.message = message;
    }

    /**
     * 成功返回结果
     */
    public static <T> CommonResult<T> success() {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getSuccess(), ResultCode.SUCCESS.getMessage());
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getSuccess(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param message 获取的数据
     */
    public static <T> CommonResult<T> success(String message) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getSuccess(), message);
    }

    /**
     * 成功返回结果
     *
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> success(String code, String message) {
        return new CommonResult<T>(code, ResultCode.SUCCESS.getSuccess(), message);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getSuccess(), message, data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> success(String code, String message, T data) {
        return new CommonResult<T>(code, ResultCode.SUCCESS.getSuccess(), message, data);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getSuccess(), ResultCode.FAILED.getMessage());
    }

    /**
     * 失败返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> failed(T data) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getSuccess(), ResultCode.FAILED.getMessage(), data);
    }

    /**
     * 失败返回结果
     *
     * @param message 获取的数据
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getSuccess(), message);
    }

    /**
     * 失败返回结果
     *
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> failed(String code, String message) {
        return new CommonResult<T>(code, ResultCode.FAILED.getSuccess(), message);
    }

    /**
     * 失败返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> failed(T data, String message) {
        return new CommonResult<T>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getSuccess(), message, data);
    }

    /**
     * 失败返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> failed(String code, String message, T data) {
        return new CommonResult<T>(code, ResultCode.FAILED.getSuccess(), message, data);
    }
}
