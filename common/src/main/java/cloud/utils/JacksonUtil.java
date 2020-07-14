package cloud.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;

/**
 * @program: feng-cloud-template
 * @description: json 转换工具类
 * @author: feng
 * @create: 2020-07-13 04:11
 **/
public class JacksonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();
    private static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    static {
        /**
         * objectMapper 初始化
         */
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
        objectMapper.setDateFormat(new SimpleDateFormat(STANDARD_FORMAT));
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
    }

    /**
     * 对象转Json格式字符串
     * @param obj 对象
     * @return Json格式字符串
     */
    public static <T> String obj2String(T obj) throws JsonProcessingException {
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : objectMapper.writeValueAsString(obj);
    }

    /**
     * 对象转Json格式字符串(格式化的Json字符串)
     * @param obj 对象
     * @return 美化的Json格式字符串
     */
    public static <T> String obj2StringPretty(T obj) throws JsonProcessingException {
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }

    /**
     * 字符串转换为自定义对象
     * @param str 要转换的字符串
     * @param clazz 自定义对象的class对象
     * @return 自定义对象
     */
    public static <T> T string2Obj(String str, Class<T> clazz) throws JsonProcessingException {
        if(StringUtils.isEmpty(str) || clazz == null){
            return null;
        }
        return clazz.equals(String.class) ? (T) str : objectMapper.readValue(str, clazz);

    }
    public static <T> T string2Obj(String str, TypeReference<T> typeReference) throws JsonProcessingException {
        if (StringUtils.isEmpty(str) || typeReference == null) {
            return null;
        }
        return (T) (typeReference.getType().equals(String.class) ? str : objectMapper.readValue(str, typeReference));
    }

    public static <T> T string2Obj(String str, Class<?> collectionClazz, Class<?>... elementClazzes) throws JsonProcessingException {
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(collectionClazz, elementClazzes);
        return objectMapper.readValue(str, javaType);
    }
}
