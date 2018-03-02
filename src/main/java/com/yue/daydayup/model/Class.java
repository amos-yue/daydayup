package com.yue.daydayup.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * author: yue
 * date: 2017/11/16
 * description:
 */
@Entity
@Table(name = "class")
public class Class {

    private Integer id;
    private String name;
    private Integer total;

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
