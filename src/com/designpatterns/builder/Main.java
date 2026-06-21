package com.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder().firstName("Mark").lastName("Zucker burg").college("Hardvard").build();
        System.out.println(user.toString());
    }
}
