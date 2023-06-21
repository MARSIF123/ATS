/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ats.ApplicationTrackingSystem.ApplicationBeans;

import java.util.Date;
import javax.faces.application.Application;
import javax.validation.constraints.Size;

/**
 *
 * @author Marya
 */
public class OneStopSolution {

    private Integer id;
    private Character bloodGroup;
    private Character degreeProgram;
    private Short maritalStatus;
    private Integer session;
    @Size(max = 45)
    private String religion;
    @Size(max = 13)
    private String cnic;
    @Size(max = 100)
    private String address;
    @Size(max = 10)
    private String ptcl;
    @Size(max = 100)
    private String faculty;
    private Date challanDate;
    @Size(max = 45)
    private String challanNumber;
    private byte[] challan;
    private Short degreeStstus;
    private byte[] transcripts;
    private byte[] cnicCopy;
    private Application applicationId;

    public OneStopSolution() {
    }

    public OneStopSolution(Integer id, Character bloodGroup, Character degreeProgram, Short maritalStatus, Integer session, String religion, String cnic, String address, String ptcl, String faculty, Date challanDate, String challanNumber, byte[] challan, Short degreeStstus, byte[] transcripts, byte[] cnicCopy, Application applicationId) {
        this.id = id;
        this.bloodGroup = bloodGroup;
        this.degreeProgram = degreeProgram;
        this.maritalStatus = maritalStatus;
        this.session = session;
        this.religion = religion;
        this.cnic = cnic;
        this.address = address;
        this.ptcl = ptcl;
        this.faculty = faculty;
        this.challanDate = challanDate;
        this.challanNumber = challanNumber;
        this.challan = challan;
        this.degreeStstus = degreeStstus;
        this.transcripts = transcripts;
        this.cnicCopy = cnicCopy;
        this.applicationId = applicationId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(Character bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Character getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(Character degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public Short getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Short maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getSession() {
        return session;
    }

    public void setSession(Integer session) {
        this.session = session;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPtcl() {
        return ptcl;
    }

    public void setPtcl(String ptcl) {
        this.ptcl = ptcl;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Date getChallanDate() {
        return challanDate;
    }

    public void setChallanDate(Date challanDate) {
        this.challanDate = challanDate;
    }

    public String getChallanNumber() {
        return challanNumber;
    }

    public void setChallanNumber(String challanNumber) {
        this.challanNumber = challanNumber;
    }

    public byte[] getChallan() {
        return challan;
    }

    public void setChallan(byte[] challan) {
        this.challan = challan;
    }

    public Short getDegreeStstus() {
        return degreeStstus;
    }

    public void setDegreeStstus(Short degreeStstus) {
        this.degreeStstus = degreeStstus;
    }

    public byte[] getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(byte[] transcripts) {
        this.transcripts = transcripts;
    }

    public byte[] getCnicCopy() {
        return cnicCopy;
    }

    public void setCnicCopy(byte[] cnicCopy) {
        this.cnicCopy = cnicCopy;
    }

    public Application getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Application applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public String toString() {
        return "OneStopSolution{" + "id=" + id + ", bloodGroup=" + bloodGroup + ", degreeProgram=" + degreeProgram + ", maritalStatus=" + maritalStatus + ", session=" + session + ", religion=" + religion + ", cnic=" + cnic + ", address=" + address + ", ptcl=" + ptcl + ", faculty=" + faculty + ", challanDate=" + challanDate + ", challanNumber=" + challanNumber + ", challan=" + challan + ", degreeStstus=" + degreeStstus + ", transcripts=" + transcripts + ", cnicCopy=" + cnicCopy + ", applicationId=" + applicationId + '}';
    }
    

  
}
