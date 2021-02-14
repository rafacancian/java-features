package com.java.features;

import com.java.features.java9.processhandle.ExecuteProcessHandle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeaturesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeaturesApplication.class, args);

        //Java 8
        //ForEach.execute();
        //ExecuteInterfaceMethod.execute();
        //ExecuteStreamAPI.execute();

        //Java 9
        //ExecuteImmutable.execute();
        //ExecutePrivateInterface.execute();
        ExecuteProcessHandle.execute();

    }

}
