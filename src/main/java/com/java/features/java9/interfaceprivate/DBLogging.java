package com.java.features.java9.interfaceprivate;

public interface DBLogging {

    String MONGO_DB_NAME = "Mongo_Datastore";
    String H2_DB_NAME = "H2_Datastore";
    String ORACLE_DB_NAME = "Oracle_Datastore";

    default void logInfo(String message) {
        log(message, "INFO");
    }

    default void logWarn(String message) {
        log(message, "WARN");
    }

    default void logError(String message) {
        log(message, "ERROR");
    }

    default void logFatal(String message) {
        log(message, "FATAL");
    }

    private void log(String message, String msgPrefix) {
        // Step 1: Connect to DataStore
        // Step 2: Log Message with Prefix and styles etc.
        // Step 3: Close the DataStore connection
        System.out.println("[" + msgPrefix + "] " + message);
    }

    // Any other abstract, static, default methods
}

