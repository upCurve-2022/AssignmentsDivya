package com.company;

public class newException extends Exception {
    newException()
    {

    }
    public String getMessage() {
        return "Delivery is not available in your area!";
    }
}
