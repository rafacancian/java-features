package com.java.features.java8.interfacemethod;

public interface Interface1 {

    void method1(String string);

    default void log(String log) {
        System.out.println("[I1] logging: " + log);
    }

    static void print(String string) {
        System.out.println("[I1] print: " + string);
    }

    // trying to override Object method gives compile-time error as
    // Default method 'toString' overrides a member of 'java.lang.Object

    /*default String toString() {
        return "i1";
    }*/


}
