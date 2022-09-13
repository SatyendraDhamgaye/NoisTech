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
public class TblCategoryBeans {
   private int SerialNo;
   private int Id;
   private String Name;
   private int Counter;

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

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int Counter) {
        this.Counter = Counter;
    }

    public TblCategoryBeans(int SerialNo,int Id, String Name, int Counter) {
        this.SerialNo=SerialNo;
        this.Id = Id;
        this.Name = Name;
        this.Counter = Counter;
    }

    public TblCategoryBeans() {
    }

 
   
   
}
