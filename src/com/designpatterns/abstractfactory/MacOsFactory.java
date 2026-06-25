package com.designpatterns.abstractfactory;

public class MacOsFactory extends GuiFactory{
    @Override
    CheckBox createCheckBox() {
        return () ->{
            System.out.println("MacOs CheckBox");
        };
    }

    @Override
    Button createButton() {
        return () -> {
            System.out.println("MacOs Button");
        };
    }
}
