package com.training.springbatchapp.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_DATA")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    //ID,Job Title,Email Address,FirstName,LastName,CreditCards

    @Id
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    public String getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(String creditCards) {
        this.creditCards = creditCards;
    }

    @Column(name = "CREDIT_CARDS")
    private String creditCards;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
}
