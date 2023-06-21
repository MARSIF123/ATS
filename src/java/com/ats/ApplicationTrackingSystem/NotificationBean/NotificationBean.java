/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ats.ApplicationTrackingSystem.NotificationBean;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Marya
 */
public class NotificationBean {
     private Integer id;
    @NotNull
    private int senderId;
    @Size(max = 100)
    private String message;
    private Date timeSent;
    @Size(max = 200)
    private String link;
    @Size(max = 45)
    private String type;
    private Short isRead;
//    private User userId;

    public NotificationBean() {
    }

    public NotificationBean(Integer id, int senderId, String message, Date timeSent, String link, String type, Short isRead) {
        this.id = id;
        this.senderId = senderId;
        this.message = message;
        this.timeSent = timeSent;
        this.link = link;
        this.type = type;
        this.isRead = isRead;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(Date timeSent) {
        this.timeSent = timeSent;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getIsRead() {
        return isRead;
    }

    public void setIsRead(Short isRead) {
        this.isRead = isRead;
    }

    @Override
    public String toString() {
        return "NotificationBean{" + "id=" + id + ", senderId=" + senderId + ", message=" + message + ", timeSent=" + timeSent + ", link=" + link + ", type=" + type + ", isRead=" + isRead + '}';
    }
    
}
