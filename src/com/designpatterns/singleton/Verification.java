package com.designpatterns.singleton;

public class Verification {
    public static void main(String[] args) {
        HolderSingleton h1=HolderSingleton.getInstance();
        HolderSingleton h2=HolderSingleton.getInstance();
        if(h1.hashCode() == h2.hashCode()) System.out.println("Both Holder Objects are same");
        else System.out.println("Both Holder Objects are not same");

        LazySingleton l1=LazySingleton.getLazySingleton();
        LazySingleton l2=LazySingleton.getLazySingleton();
        if(l1.hashCode() == l2.hashCode()) System.out.println("Both Lazy Singleton objects are same");
        else System.out.println("Both Lazy Singleton objects are not same");

        EagerSingleton e1=EagerSingleton.getEagerSingleton();
        EagerSingleton e2=EagerSingleton.getEagerSingleton();
        if(e1.hashCode() == e2.hashCode()) System.out.println("Both Eager Singleton objects are same");
        else System.out.println("Both Eager Singleton objects are not same");

    }
}
