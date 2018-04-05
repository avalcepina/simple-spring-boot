package com.example.demo.api.model;

public class ResponseView {

    private String message;

    public ResponseView(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
