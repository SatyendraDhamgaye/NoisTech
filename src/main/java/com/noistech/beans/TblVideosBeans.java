/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.beans;

/**
 *
 * @author habeel
 */
public class TblVideosBeans {
     private int SerialNo;
    private int Id;
    private String VideoId;
    private String Link;
    private String DateTime;

    
    
      public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getVideoId() {
        return VideoId;
    }

    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public TblVideosBeans() {
    }

    public TblVideosBeans(int SerialNo,int Id, String VideoId, String Link, String DateTime) {
       this.SerialNo=SerialNo;
        this.Id = Id;
        this.VideoId = VideoId;
        this.Link = Link;
        this.DateTime = DateTime;
    }

    
   
    
}
