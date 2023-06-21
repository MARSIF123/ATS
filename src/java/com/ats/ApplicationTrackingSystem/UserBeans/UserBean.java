/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ats.ApplicationTrackingSystem.UserBeans;

import java.util.Date;

/**
 *
 * @author Marya
 */
public class UserBean {

    private int id;
    private String regNo;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String uogEmail;
    private String personalEmail;
    private String phoneNo;
    private String userType;
    private short gender;
    private byte profile;
    private Date dateOfBirthday;

    public UserBean() {
    }

    public UserBean(int id, String regNo, String firstName, String lastName, String fatherName, String uogEmail, String personalEmail, String phoneNo, String userType, boolean gender, byte profile, Date dateOfBirthday) {
        this.id = id;
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.uogEmail = uogEmail;
        this.personalEmail = personalEmail;
        this.phoneNo = phoneNo;
        this.userType = userType;
        this.profile = profile;
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getUogEmail() {
        return uogEmail;
    }

    public void setUogEmail(String uogEmail) {
        this.uogEmail = uogEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public short isGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public byte getProfile() {
        return profile;
    }

    public void setProfile(byte profile) {
        this.profile = profile;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public String toString() {
        return "UserBean{" + "id=" + id + ", regNo=" + regNo + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", uogEmail=" + uogEmail + ", personalEmail=" + personalEmail + ", phoneNo=" + phoneNo + ", userType=" + userType + ", gender=" + gender + ", profile=" + profile + ", dateOfBirthday=" + dateOfBirthday + '}';
    }

}
