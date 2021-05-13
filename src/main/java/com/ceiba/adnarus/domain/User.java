package com.ceiba.adnarus.domain;

import java.util.Date;

public class User {

    private String documentType;
    private String documentNumber;
    private String firstName;
    private String secondName;
    private String surname;
    private String secondSurname;
    private String healthAdministrator;
    private Date healthAffiliationDate;
    private String pensionAdministrator;
    private Date pensionAffiliationDate;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getHealthAdministrator() {
        return healthAdministrator;
    }

    public void setHealthAdministrator(String healthAdministrator) {
        this.healthAdministrator = healthAdministrator;
    }

    public Date getHealthAffiliationDate() {
        return healthAffiliationDate;
    }

    public void setHealthAffiliationDate(Date healthAffiliationDate) {
        this.healthAffiliationDate = healthAffiliationDate;
    }

    public String getPensionAdministrator() {
        return pensionAdministrator;
    }

    public void setPensionAdministrator(String pensionAdministrator) {
        this.pensionAdministrator = pensionAdministrator;
    }

    public Date getPensionAffiliationDate() {
        return pensionAffiliationDate;
    }

    public void setPensionAffiliationDate(Date pensionAffiliationDate) {
        this.pensionAffiliationDate = pensionAffiliationDate;
    }
}
