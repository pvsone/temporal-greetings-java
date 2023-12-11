package com.example.greetings;

import io.temporal.activity.ActivityInterface;

@ActivityInterface
public interface GreetingActivities {

    String greet(String name);

}
