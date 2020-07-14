package cloud.utils;
import cloud.exception.GeneralException;
import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static cloud.utils.TimeUtil.DATE_FOMATE_yyyyMMddHHmmssS;

/**
 * @program: feng-cloud-template
 * @description: 生成id
 * @author: feng
 * @create: 2020-07-14 23:50
 **/
@Slf4j
public class IdUtil {

    private static int seq = 0;

    private static final int MAX = 99999;

    /**
     * 时间格式生成序列
     * @return String
     */
    public static synchronized String generateSequenceNo() {
        try {

            Date date = new Date();
            String dateStr = TimeUtil.dateFormat(date,DATE_FOMATE_yyyyMMddHHmmssS);
            String idStr = dateStr+seq;

            if (seq == MAX) {
                seq = 0;
            } else {
                seq++;
            }
            return idStr;
        }catch (Exception e){
            log.info("id 生成异常",e);
        }
        return null;
    }
}