package basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

    @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\wayes\\eclipse-workspace\\seleniumdemos\\FileTest\\Sample.txt");
        f.createNewFile();

       BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\wayes\\eclipse-workspace\\seleniumdemos\\FileTest\\Sample.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}