package com.java.features.java12.filemismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExecuteFileMismatch {

    public static void execute() {

        try {
            Path filePath1 = Files.createTempFile("file1", ".txt");
            Path filePath2 = Files.createTempFile("file2", ".txt");

            Files.writeString(filePath1, "JournalDev Test String");
            Files.writeString(filePath2, "JournalDev Test String");

            // File Mismatch position
            // It returns -1 if there is no mismatch

            long mismatch = Files.mismatch(filePath1, filePath2);
            System.out.println("Mismatch position in file1 and file2 is: " + mismatch);

            filePath1.toFile().deleteOnExit();
            filePath2.toFile().deleteOnExit();

            System.out.println();

            Path filePath3 = Files.createTempFile("file3", ".txt");
            Path filePath4 = Files.createTempFile("file4", ".txt");

            Files.writeString(filePath3, "JournalDev Test String");
            Files.writeString(filePath4, "JournalDev.com Test String");

            long mismatch2 = Files.mismatch(filePath3, filePath4);
            System.out.println("Mismatch position in file3 and file4 is: " + mismatch2);

            filePath3.toFile().deleteOnExit();
            filePath4.toFile().deleteOnExit();

        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
