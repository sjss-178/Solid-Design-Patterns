package com.designpatterns.singleton;

public class MultithreadSingleton {
    private static  MultithreadSingleton multithreadSingleton=null;

    private MultithreadSingleton(){

    }

    public static MultithreadSingleton getInstance(){
        if(multithreadSingleton == null){
            //class level lock
            synchronized (MultithreadSingleton.class){
                if(multithreadSingleton == null){
                    multithreadSingleton = new MultithreadSingleton();
                }
            }
        }
        return multithreadSingleton;
    }
}
