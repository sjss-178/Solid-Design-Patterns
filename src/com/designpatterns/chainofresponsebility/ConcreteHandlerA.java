package com.designpatterns.chainofresponsebility;

public class ConcreteHandlerA extends AbstractHandler{
    @Override
    protected boolean process(Request request) {
        if(request.getType().equals("A")){
            System.out.println("Request Handles by ConcreteHandlerA");
            return true;
        }
        return false;
    }
}
