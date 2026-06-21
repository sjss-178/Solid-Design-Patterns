package com.designpatterns.singleton;

public class HolderSingleton {
    private HolderSingleton(){}

    private static class Holder{
        public static final HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return Holder.instance;
    }
}
