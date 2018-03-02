package com.yue.daydayup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * author: yue
 * date: 2017/11/16
 * description:
 */
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "male")
    private String male;
    @Column(name = "age")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
