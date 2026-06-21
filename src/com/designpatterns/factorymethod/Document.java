package com.designpatterns.factorymethod;


public interface Document {
    static void doSomething(){
        System.out.println("We can write to document");
    }
    public abstract Document createDocument();
}
