package com.java.features.java8.interfacemethod;

public class MyClass implements Interface1, Interface2 {

    @Override
    public void method1(String string) {
        System.out.println(string);
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    //MyClass won't compile without having it's own log() implementation
    @Override
    public void log(String log) {
        System.out.println("MyClass logging: " + log);
        Interface1.print("interface 1");
        Interface2.print("interface 2");

    }
}
