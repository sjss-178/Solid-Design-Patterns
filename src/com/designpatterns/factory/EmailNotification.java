package com.designpatterns.factory;

public class EmailNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("message sent using email");
    }
}
