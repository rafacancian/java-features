package com.java.features.java9.processhandle;

public class ExecuteProcessHandle {

    public static void execute() {

        ProcessHandle currProcessHandle = ProcessHandle.current();
        System.out.println("Current Process: " + currProcessHandle.info());
    }
}
