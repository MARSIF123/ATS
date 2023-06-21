package com.ats.ApplicationTrackingSystem.ApplicationBeans;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Size;

@ManagedBean
@ApplicationScoped
public class ApplicationBean implements Serializable {

    private Integer id;
   
    private String type;
    
    private String sybject;
    @Size(max = 255)
    private String content;
    @Size(max = 100)
    private String hodRemarks;
    @Size(max = 100)
    private String sscRemarks;
    private Character semester;
    private Character extraSemester;
    private Short program;
    private Date submissionDate;
    @Size(max = 100)
    private String campusName;
    private byte[] transcript;
    @Size(max = 100)
    private String degreeTitle;
    @Size(max = 45)
    private String status;
    private Float cgpa;
    private Integer extraYear;
//    private Collection<CourseHasApplication> courseHasApplicationCollection;
   
//    private User userId;
//    private Onestopsolution onestopsolution;


    public ApplicationBean() {
    }

    public String submitApplication() {
        return null;
    }

    public String printApplication() {
        return null;
    }

    public String downloadApplication() {
        return null;
    }

}
