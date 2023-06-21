/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ats.ApplicationTrackingSystem.CourseBeans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Marya
 */
public class CourseBean {
     private Integer id;
    @NotNull
    private String title;
    @NotNull
    private Character craditHours;
    @Size(max = 10)
    private String code;
//    private Collection<CourseHasApplication> courseHasApplicationCollection;

    public CourseBean() {
    }

    public CourseBean(Integer id, String title, Character craditHours, String code) {
        this.id = id;
        this.title = title;
        this.craditHours = craditHours;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Character getCraditHours() {
        return craditHours;
    }

    public void setCraditHours(Character craditHours) {
        this.craditHours = craditHours;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CourseBean{" + "id=" + id + ", title=" + title + ", craditHours=" + craditHours + ", code=" + code + '}';
    }
    
}
