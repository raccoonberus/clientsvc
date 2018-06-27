package com.raccoonberus.clientsvc.web.model;

import java.util.ArrayList;
import java.util.List;

public class CommonRespose {

    private boolean success;
    private List<String> errors = new ArrayList<String>();

    public CommonRespose() {
    }

    public CommonRespose(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public CommonRespose setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public CommonRespose setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }
}
