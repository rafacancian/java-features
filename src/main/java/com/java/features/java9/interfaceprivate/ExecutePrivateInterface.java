package com.java.features.java9.interfaceprivate;

public class ExecutePrivateInterface {

    public static void execute() {

        DBLogging dbLogging = new LoggingOracle();
        dbLogging.logInfo("info about steps");
        dbLogging.logWarn("warn about steps");
        dbLogging.logError("error about steps");
        dbLogging.logFatal("fatal about steps");
    }
}
