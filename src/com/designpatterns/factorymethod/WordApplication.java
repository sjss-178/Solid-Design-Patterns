package com.designpatterns.factorymethod;

public class WordApplication extends Application{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
