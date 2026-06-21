package com.designpatterns.builder;

public class User {
    private String firstName;
    private String lastName;
    private String college;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public User(String firstName, String lastName, String college){
        this.firstName=firstName;
        this.lastName=lastName;
        this.college=college;
    }

}
