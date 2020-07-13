package cloud.exception;

import com.sun.istack.internal.Nullable;
/**
 * @description: 通用定制异常统一继承类
 * @author: feng
 * @create: 2020-07-13
 **/
public class GeneralException extends RuntimeException {

    public GeneralException(String msg) {
        super(msg);
    }

    public GeneralException(@Nullable String msg, @Nullable Throwable cause) {
        super(msg, cause);
    }

    public GeneralException(@Nullable Throwable cause) {
        super(cause);
    }
}
