package com.designpatterns.abstractfactory;

public class WindowFactory extends GuiFactory{
    @Override
    CheckBox createCheckBox() {
        CheckBox checkBox  = () ->{
            System.out.println("Windows CheckBox");
        };
        return checkBox;
    }

    @Override
    Button createButton() {
        Button button = () ->{
            System.out.println("Window Button");
        };
        return button;
    }
}
