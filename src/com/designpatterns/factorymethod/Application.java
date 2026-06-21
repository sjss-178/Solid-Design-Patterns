package com.designpatterns.factorymethod;

public abstract class Application {
    public void workflow(){
        Document document=createDocument();
        System.out.println("opening document \n writing to document \n closing the document");
    }
    public abstract Document createDocument();
}
