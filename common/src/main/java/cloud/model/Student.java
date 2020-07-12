package cloud.model;

import lombok.Data;

import java.io.Serializable;


/**
 * @description: 学生测试model
 * @author: feng
 * @create: 2020-07-13
 **/
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = -4092481519042776220L;

    /**
     * 名字
     */
    private String name;
}
