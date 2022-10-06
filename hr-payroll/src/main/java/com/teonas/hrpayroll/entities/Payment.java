package com.teonas.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
    
    private String name;
    private Double dailyincome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyincome, Integer days) {
        this.name = name;
        this.dailyincome = dailyincome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyincome() {
        return dailyincome;
    }

    public void setDailyincome(Double dailyincome) {
        this.dailyincome = dailyincome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getTotal() {
        return days * dailyincome;
    }

    
}
