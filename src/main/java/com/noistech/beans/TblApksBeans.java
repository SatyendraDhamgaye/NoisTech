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
public class TblApksBeans {
    
    private int SerialNo;
    private int Id;
    private String Name;
    private String Link;
    private String Description;
    private String Version;
    private String Img;
    private String DateTime;
    private double Visits;
    private double downloads;

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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public double getVisits() {
        return Visits;
    }

    public void setVisits(double Visits) {
        this.Visits = Visits;
    }

    public double getDownloads() {
        return downloads;
    }

    public void setDownloads(double downloads) {
        this.downloads = downloads;
    }

    public TblApksBeans() {
    }

    public TblApksBeans(int SerialNo,int Id, String Name, String Link, String Description, String Version, String Img, String DateTime, double Visits, double downloads) {
        this.SerialNo=SerialNo;
        this.Id = Id;
        this.Name = Name;
        this.Link = Link;
        this.Description = Description;
        this.Version = Version;
        this.Img = Img;
        this.DateTime = DateTime;
        this.Visits = Visits;
        this.downloads = downloads;
    }

    
   
    
            
    
}
