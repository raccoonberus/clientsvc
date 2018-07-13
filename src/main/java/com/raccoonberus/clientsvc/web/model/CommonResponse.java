package com.raccoonberus.clientsvc.web.model;

import java.util.ArrayList;
import java.util.List;

public class CommonResponse {

    private boolean success;
    private Object result;
    private List<String> errors = new ArrayList<>();

    public CommonResponse() {
    }

    public CommonResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public CommonResponse setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Object getResult() {
        return result;
    }

    public CommonResponse setResult(Object result) {
        this.result = result;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public CommonResponse setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }
}
