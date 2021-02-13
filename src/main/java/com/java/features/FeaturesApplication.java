package com.java.features;

import com.java.features.java8.foreach.ForEach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeaturesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeaturesApplication.class, args);

        ForEach.execute();

    }

}
