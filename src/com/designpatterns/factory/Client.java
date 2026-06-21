package com.designpatterns.factory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Notification notification = factory.create(NotificationType.EMAIL);
        //we need to add new Concrete impl of the notification
        factory.addToRegistry(NotificationType.SMS,() -> new SMSNotification());
        Notification notification1 = factory.create(NotificationType.SMS);
        notification.send("Hello everyone");
        notification1.send("Hello everyone");;
    }
}
