package com.designpatterns.factorymethod;

public class PdfDocument implements Document{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
