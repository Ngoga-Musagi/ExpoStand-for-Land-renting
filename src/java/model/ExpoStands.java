/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hp
 */
@Entity
public class ExpoStands {
    @Id
 private String standNo;
 private String rentingCompany;
 private String standLength;
 private String standWidth;
 private float standArea;
 private String rentingDate;
 private float rentingPrice=0;

    public String getStandNo() {
        return standNo;
    }

    public void setStandNo(String standNo) {
        this.standNo = standNo;
    }

    public String getRentingCompany() {
        return rentingCompany;
    }

    public void setRentingCompany(String rentingCompany) {
        this.rentingCompany = rentingCompany;
    }

    public String getRentingDate() {
        return rentingDate;
    }

    public void setRentingDate(String rentingDate) {
        this.rentingDate = rentingDate;
    }

    public String getStandLength() {
        return standLength;
    }

    public void setStandLength(String standLength) {
        this.standLength = standLength;
    }

    public String getStandWidth() {
        return standWidth;
    }

    public void setStandWidth(String standWidth) {
        this.standWidth = standWidth;
    }

    public float getStandArea() {
        return standArea;
    }

    public void setStandArea(String l,String w) {
        this.standArea = Integer.parseInt(w)*Integer.parseInt(l);
    }

    public float getRentingPrice() {
        return rentingPrice;
    }

    public void setRentingPrice() {
       
        this.rentingPrice =( 5500* this.getStandArea());
    }
 
}
