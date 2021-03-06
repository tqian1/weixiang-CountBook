/**
 * Counter Class
 *
 * Copyright 2017 Kevin Wang
 *
 * @author weixiang
 * @version 1.0
 * @created 2017-09-27
 */

package com.ualberta.kevin.countbook;

import com.google.gson.annotations.Expose;

import java.util.Date;

/**
 * Counter contains the data representing a single
 * counter. It has convenience functions to increment
 * and decrement the counter.
 */

public class Counter {

    @Expose
    private String name;
    @Expose
    private Date date;
    @Expose
    private Integer initialValue;
    @Expose
    private Integer currentValue;
    @Expose
    private String comment;

    public Counter (String name, Date date, Integer initialValue, String comment) {
        this.name = name;
        this.date = date;
        this.initialValue = initialValue;
        this.currentValue = initialValue;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Integer initialValue) {
        this.initialValue = initialValue;
    }

    public Integer increment() {
        return ++currentValue;
    }

    public Integer decrement() {
        if (currentValue > 0) {
            --currentValue;
        }
        return currentValue;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
