package com.btptraining.dbboot.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//bean creation
@Component
@Scope("prototype")
@Entity
@Table(name = "VENDOR")
public class Vendor {
    @Id
    @Column(nullable = false, name = "CODE")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String code;
    @Column(nullable = false, name = "COMPANY_NAME")
    private String companyName;
    @Column(nullable = false, name = "CONTACT_PERSON")
    private String contactPerson;
    @Column(nullable = false, name = "FIRST_NAME")
    private String firstName;
    @Column(nullable = false, name = "LAST_NAME")
    private String lastName;
    @Column(nullable = false, name = "WEBSITE")
    private String website;
    @Column(nullable = false, name = "EMAIL")
    private String email;
    @Column(nullable = false, name = "STATUS")
    private Integer status;
    @Column(nullable = false, name = "REG_DATE")
    private Date regDate;

    // Default Constructor
    public Vendor(String code, String companyName, String contactPerson, String firstName, String lastName) {
        this.code = code;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.website = companyName + ".com";
        this.email = this.firstName + "." + this.lastName + "@" + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date();
    }

    public Vendor() {
        this.code = "code";
        this.companyName = "companyName";
        this.contactPerson = "contactPerson";
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.website = companyName + ".com";
        this.email = this.firstName + "." + this.lastName + "@" + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

}
