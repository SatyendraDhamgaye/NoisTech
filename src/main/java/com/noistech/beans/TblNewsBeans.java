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
public class TblNewsBeans {
     private int SerialNo;
    private int Id;
    private String Link;
    private String Keyword;
    private String Title;
    private String Description;
    private String Thumbnail;
    private String Content;
    private String Category;
    private String PostedBy;
    private double Visits;
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

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String Thumbnail) {
        this.Thumbnail = Thumbnail;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getPostedBy() {
        return PostedBy;
    }

    public void setPostedBy(String PostedBy) {
        this.PostedBy = PostedBy;
    }

    public double getVisits() {
        return Visits;
    }

    public void setVisits(double Visits) {
        this.Visits = Visits;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public TblNewsBeans() {
    }

    public TblNewsBeans(int SerialNo,int Id, String Link, String Keyword, String Title, String Description, String Thumbnail, String Content, String Category, String PostedBy, double Visits, String DateTime) {
       this.SerialNo=SerialNo;
        this.Id = Id;
        this.Link = Link;
        this.Keyword = Keyword;
        this.Title = Title;
        this.Description = Description;
        this.Thumbnail = Thumbnail;
        this.Content = Content;
        this.Category = Category;
        this.PostedBy = PostedBy;
        this.Visits = Visits;
        this.DateTime = DateTime;
    }

    
            
}
