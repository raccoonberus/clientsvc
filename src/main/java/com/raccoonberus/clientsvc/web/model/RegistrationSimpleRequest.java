package com.raccoonberus.clientsvc.web.model;

import java.util.Date;

public class RegistrationSimpleRequest {

    private String lastName;

    private String firstName;

    private String middleName;

    private Date birthDate;

    private String email;

    private String mobilePhone;

    public String getLastName() {
        return lastName;
    }

    public RegistrationSimpleRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public RegistrationSimpleRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public RegistrationSimpleRequest setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public RegistrationSimpleRequest setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RegistrationSimpleRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public RegistrationSimpleRequest setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }
}
