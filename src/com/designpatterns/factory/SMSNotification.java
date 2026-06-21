package com.designpatterns.factory;

public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("message sent using SMS Notification");
    }
}
