package com.example.greetings;

public class GreetingActivitiesImpl implements GreetingActivities {

    @Override
    public String greet(String name) {
        return "Hello " + name + "!";
    }
}
