/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.beans;

import javax.servlet.http.Part;

/**
 *
 * @author habeel
 */
public class TblPostBeans {

    private int serialNo;
    private int id;
    private String link;
    private String keywords;
    private String title;
    private String description;
    private String thumbnail;
    private String content;
    private String dateTime;
    private String videoId;
    private String categoryIN;
    private String categoryOUT;
    private String postedby;
    private int visits;
    
    
    

    public TblPostBeans(int serialNo, int id, String link, String keywords, String title, String description, String thumbnail, String content, String dateTime, String videoId, String categoryIN, String categoryOUT, String postedby, int visits) {
        this.serialNo = serialNo;
        this.id = id;
        this.link = link;
        this.keywords = keywords;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.content = content;
        this.dateTime = dateTime;
        this.videoId = videoId;
        this.categoryIN = categoryIN;
        this.categoryOUT = categoryOUT;
        this.postedby = postedby;
        this.visits = visits;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCategoryIN() {
        return categoryIN;
    }

    public void setCategoryIN(String categoryIN) {
        this.categoryIN = categoryIN;
    }

    public String getCategoryOUT() {
        return categoryOUT;
    }

    public void setCategoryOUT(String categoryOUT) {
        this.categoryOUT = categoryOUT;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public TblPostBeans() {
    }

    public TblPostBeans(int serialNo, int id, String videoId) {
        this.serialNo = serialNo;
        this.id = id;
        this.videoId = videoId;
    }

}
