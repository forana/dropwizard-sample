package com.example.dropwizard.models;

public class Hello {
    private String greeting;
    
    private String who;
    
    public Hello(String greeting) {
        this.greeting = greeting;
        who = "world";
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
