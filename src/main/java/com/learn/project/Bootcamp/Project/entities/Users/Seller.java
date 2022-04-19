package com.learn.project.Bootcamp.Project.entities.Users;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigInteger;
@Entity
@PrimaryKeyJoinColumn(name = "seller_id",referencedColumnName = "id")
public class Seller extends User {

    private String gst;
    private Integer companyContact;
    private String companyName;

    public void setCompanyContact(Integer companyContact) {
        this.companyContact = companyContact;
    }

    public Seller() {
        super();
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


}
