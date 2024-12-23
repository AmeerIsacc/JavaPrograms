package ameer1;
/**
 * @امير 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ameer1 { 
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter text to write to file:");
        String inputText = scanner.nextLine();
        
        // كتابة النص في الملف Africa.txt
        try (FileWriter writer = new FileWriter("Africa.txt")) {
            writer.write(inputText);
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        
        // قراءة محتويات الملف Africa.txt وعرضها على الشاشة
        try (FileReader reader = new FileReader("Africa.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
             
            String line;
            System.out.println("Contents of the file Africa.txt:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
        }
    }
}

