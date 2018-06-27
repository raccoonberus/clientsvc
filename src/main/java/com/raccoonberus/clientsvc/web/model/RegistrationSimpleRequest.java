package com.raccoonberus.clientsvc.web.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class RegistrationSimpleRequest {

    @NotNull
    private String lastName;

    @NotNull
    private String firstName;

    @NotNull
    private String middleName;

    @NotNull
    private Date birthDate;

    @NotNull
    private String email;

    @NotNull
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
