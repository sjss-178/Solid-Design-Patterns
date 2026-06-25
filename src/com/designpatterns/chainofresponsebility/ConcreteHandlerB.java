package com.designpatterns.chainofresponsebility;

public class ConcreteHandlerB extends AbstractHandler {
    @Override
    protected boolean process(Request request) {
        if(request.getType().equals("B")){
            System.out.println("Request Handled by Concrete Handler B");
            return true;
        }
        return false;
    }
}
