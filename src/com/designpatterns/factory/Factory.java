package com.designpatterns.factory;

import java.util.HashMap;
import java.util.function.Supplier;

public class Factory {

    private static final HashMap<NotificationType, Supplier<Notification>> registry  = new HashMap<>();
    static {
        registry.put(NotificationType.EMAIL,() -> new EmailNotification());
    }
    public void addToRegistry(NotificationType notificationType,Supplier<Notification> notificationSupplier){
        registry.put(notificationType,notificationSupplier);
    }
    public Notification create(NotificationType notificationType){
        Supplier<Notification> supplier=null;
        if(registry.containsKey(notificationType))  supplier =registry.get(notificationType);
        if(supplier == null)
        {
            throw new IllegalArgumentException("Notification type not supported");
        }
        return supplier.get();
    }
}
