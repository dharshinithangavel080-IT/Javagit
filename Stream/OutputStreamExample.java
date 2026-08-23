import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("output.txt");

            String message = "Hello Friends\nWelcome to Java OutputStream";

            output.write(message.getBytes());

            output.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}