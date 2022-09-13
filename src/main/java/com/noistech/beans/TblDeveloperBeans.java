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
public class TblDeveloperBeans {
     private int SerialNo;
    private int Id;
    private String Phone;
    private String Password;
    private String Username;
    private String Name;
    private int LoginCount;
    private int Authentification;
    private String Facebook;
    private String Instagram;
    private String LinkedIn;
    private String Twitter;
    private String DateTime;
    private String LoginDateTime;

    
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

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getLoginCount() {
        return LoginCount;
    }

    public void setLoginCount(int LoginCount) {
        this.LoginCount = LoginCount;
    }

    public int getAuthentification() {
        return Authentification;
    }

    public void setAuthentification(int Authentification) {
        this.Authentification = Authentification;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String Instagram) {
        this.Instagram = Instagram;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String Twitter) {
        this.Twitter = Twitter;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public String getLoginDateTime() {
        return LoginDateTime;
    }

    public void setLoginDateTime(String LoginDateTime) {
        this.LoginDateTime = LoginDateTime;
    }

    public TblDeveloperBeans() {
    }

    public TblDeveloperBeans(int SerialNo,int Id, String Phone, String Password, String Username, String Name, int LoginCount, int Authentification, String Facebook, String Instagram, String LinkedIn, String Twitter, String DateTime, String LoginDateTime) {
        this.SerialNo=this.SerialNo;
        this.Id = Id;
        this.Phone = Phone;
        this.Password = Password;
        this.Username = Username;
        this.Name = Name;
        this.LoginCount = LoginCount;
        this.Authentification = Authentification;
        this.Facebook = Facebook;
        this.Instagram = Instagram;
        this.LinkedIn = LinkedIn;
        this.Twitter = Twitter;
        this.DateTime = DateTime;
        this.LoginDateTime = LoginDateTime;
    }

              
    
}
