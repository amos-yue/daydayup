package com.yue.daydayup.model;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author: yue
 * date: 2018/01/06
 * description:
 */
@Configuration
public class MyBean {

    @Bean(name = "student")
    public Student createStudent(){
        return null;
    }

    @Bean(name = "teacher")
    public Teacher createTeacher(){
        Teacher teacher=new Teacher();
        teacher.setAge(30);
        teacher.setId(1);
        teacher.setMale("男");
        teacher.setName("张三");
        return teacher;
    }

    @Bean(name = "teacher1")
    public Teacher createTeacher(Teacher teacher){
        return teacher;
    }

}
