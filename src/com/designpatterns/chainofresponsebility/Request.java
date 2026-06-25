package com.designpatterns.chainofresponsebility;

public class Request {
    private String type;

    public Request(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }
}
