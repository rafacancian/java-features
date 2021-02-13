package com.java.features.java8.foreach;

import java.util.function.Consumer;

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value: " + t);
    }
}