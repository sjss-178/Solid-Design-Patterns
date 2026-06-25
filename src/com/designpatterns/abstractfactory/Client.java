package com.designpatterns.abstractfactory;

public class Client {
    public static void main(String[] args) {
        GuiFactory guiFactory = new WindowFactory();
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();
        button.display();
        checkBox.display();
        GuiFactory guiFactory1 = new MacOsFactory();
        CheckBox checkBox1 = guiFactory1.createCheckBox();
        Button button1 = guiFactory1.createButton();
        checkBox1.display();
        button1.display();
    }
}
