package com.raccoonberus.clientsvc.web.model;

public class RegistrationModel {
    private boolean success = true;

    public boolean isSuccess() {
        return success;
    }

    public RegistrationModel setSuccess(boolean success) {
        this.success = success;
        return this;
    }
}
