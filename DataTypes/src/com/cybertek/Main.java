package com.cybertek;

import com.cybertek.core.Methods;

public class Main {
    public static void main(String[] args) {


        //CORE package

     //I can't call methodA() directly, because it's an instance method, that's why I need to create a class
        Methods methods = new Methods();
        methods.methodA();
        methods.methodB("Apple");
        methods.methodC(6);


        Methods.methodD();

        System.out.println(methods.methodE());



    }
}
