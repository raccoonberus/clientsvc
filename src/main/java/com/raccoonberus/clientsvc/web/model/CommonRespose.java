package com.raccoonberus.clientsvc.web.model;

import java.util.ArrayList;
import java.util.List;

public class CommonRespose {

    private boolean success;
    private Object result;
    private List<String> errors = new ArrayList<>();

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

    public Object getResult() {
        return result;
    }

    public CommonRespose setResult(Object result) {
        this.result = result;
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
