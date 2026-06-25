package com.designpatterns.chainofresponsebility;

public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler=nextHandler;
    }

    public final void handle(Request request){
        boolean handled = process(request);
        if(!handled && nextHandler!=null){
            nextHandler.handle(request);
        }
    }

    protected abstract boolean process(Request request);
}
