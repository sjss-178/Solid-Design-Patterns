package com.designpatterns.factorymethod;

public class PdfApplication  extends Application{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
