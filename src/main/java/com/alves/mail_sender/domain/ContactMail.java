package com.alves.mail_sender.domain;

public class ContactMail {

    private String from;
    private String name;
    private String message;

    public ContactMail() {

    }

    public ContactMail(String from, String name, String message) {
        this.from = from;
        this.name = name;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
