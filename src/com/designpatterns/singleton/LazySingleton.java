package com.designpatterns.singleton;
/*
    Lazy Singleton -> Singleton Object created only when used in the code.
    rules : private constructor & static feild to hold instance & getter for instance
*/
public class LazySingleton {
    private static LazySingleton lazySingleton =null;

    private LazySingleton(){

    }

    public static LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
