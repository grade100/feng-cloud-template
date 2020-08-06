package cloud.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

import static cloud.utils.TimeUtil.DATE_FOMATE_yyyyMMddHHmmssS;

/**
 * @program: feng-cloud-template
 * @description: 生成id
 * @author: feng
 * @create: 2020-07-14 23:50
 **/
@Slf4j
public class IdUtil {

    /**
     * 时间格式生成序列
     * @return String
     */
    public static synchronized String generateSequenceNo() {
        try {
            Date date = new Date();
            String dateStr = TimeUtil.dateFormat(date,DATE_FOMATE_yyyyMMddHHmmssS);
            int i = (int) ((Math.random() * 9 + 1) * 100000);
            String idStr = dateStr+i;
            return idStr;
        }catch (Exception e){
            log.info("id 生成异常",e);
        }
        return null;
    }
}