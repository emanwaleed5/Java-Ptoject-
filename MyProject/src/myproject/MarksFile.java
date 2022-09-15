package myproject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class MarksFile {
    public static void write(ArrayList<String> marks, String fileName) {
        try {
            // Open given file in append mode by creating an
            // object of BufferedWriter class
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));
            for (int e = 0; e < marks.size(); e++) {
                out.write(marks.get(e) + "\n");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("exception occurred" + e);
        }
    }
    public static void write(String marks, String fileName) {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));

            out.write(marks + "\n");
            out.close();
        } catch (IOException e) {
            System.out.println("exception occurred" + e);
        }
    }
    public static void print(String fileName) {
        try {
            File file = new File(fileName);
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                System.out.println(input.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File can't be opend");
        }
    }
}
