package cloud.exception;

/**
 * @description: 通用定制异常统一继承类
 * @author: feng
 * @create: 2020-07-13
 **/
public class GeneralException extends RuntimeException {

    public GeneralException(String msg) {
        super(msg);
    }

    public GeneralException( String msg,  Throwable cause) {
        super(msg, cause);
    }

    public GeneralException( Throwable cause) {
        super(cause);
    }
}
