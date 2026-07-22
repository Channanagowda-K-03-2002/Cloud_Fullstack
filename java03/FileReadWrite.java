package java03;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ChannanagowdaK\\Desktop\\Cloud_Fullstack\\java03\\example.txt");
        try {
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        try {
            // Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, World!\n");
            writer.write("This is a test file.\n");
            writer.write("File read and write example in Java.\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
