package features.java9.resourcereader;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class ExecuteResourceReader {

    private static final String path = "C:/Dev/Projetos/java-features/resources/example_reader.txt";

    public static void execute() {

        try {

            BufferedReader readerBeforeJava9 = new BufferedReader(new FileReader(path));
            try (BufferedReader reader2 = readerBeforeJava9) {
                System.out.println(reader2.readLine());
            } catch (IOException e) {
                System.out.println("Error to read example_reader.txt using existent resource before java 9");
            }

            BufferedReader readerJava9 = new BufferedReader(new FileReader(path));
            try (readerJava9) {
                System.out.println(readerJava9.readLine());
            } catch (IOException e) {
                System.out.println("Error to read example_reader.txt using new resource of java 9");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File example_reader.txt not found");
        }


    }
}
