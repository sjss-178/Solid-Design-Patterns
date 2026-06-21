package com.designpatterns.builder;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private String college;
    public UserBuilder firstName(String firstName){
        this.firstName=firstName;
        return this;
    }
    public UserBuilder  lastName(String lastName){
        this.lastName=lastName;
        return this;
    }
    public UserBuilder  college(String college){
        this.college=college;
        return this;
    }
    public User build(){
        return new User(this.firstName,this.lastName,this.college);
    }

}
