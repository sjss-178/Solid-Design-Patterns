package com.designpatterns.factorymethod;

public class WordDocument implements Document{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
