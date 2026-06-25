package com.designpatterns.chainofresponsebility;

public class Main {
    public static void main(String[] args) {
        Request requestA = new Request("A");
        Request requestB = new Request("B");

        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        concreteHandlerA.setNextHandler(concreteHandlerB);
        concreteHandlerB.setNextHandler(null);

        concreteHandlerA.handle(requestA);
        concreteHandlerA.handle(requestB);
    }
}
