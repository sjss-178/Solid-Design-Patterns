package com.designpatterns.factorymethod;

public class Client {
    public static void main(String[] args) {
        Application application = new PdfApplication();
        application.workflow();
        //here we delegate the object creation to concrete creator rather than a simple facotury through inheritace
        // not composition unlike the factory pattern
        Application application1 = new WordApplication();
        application1.workflow();
    }
}
