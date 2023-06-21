/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ats.ApplicationTrackingSystem.FeedbackBeans;

import javax.validation.constraints.Size;

/**
 *
 * @author Marya
 */
public class FeedbackBean {
    private Integer id;
    @Size(max = 200)
    private String suggestion;
    private Integer rating;
    private Short q1;
    private Short q2;
    private Short q3;
//    private User userId;

    public FeedbackBean() {
    }

    public FeedbackBean(Integer id, String suggestion, Integer rating, Short q1, Short q2, Short q3) {
        this.id = id;
        this.suggestion = suggestion;
        this.rating = rating;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Short getQ1() {
        return q1;
    }

    public void setQ1(Short q1) {
        this.q1 = q1;
    }

    public Short getQ2() {
        return q2;
    }

    public void setQ2(Short q2) {
        this.q2 = q2;
    }

    public Short getQ3() {
        return q3;
    }

    public void setQ3(Short q3) {
        this.q3 = q3;
    }

    @Override
    public String toString() {
        return "FeedbackBean{" + "id=" + id + ", suggestion=" + suggestion + ", rating=" + rating + ", q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + '}';
    }
    

}
