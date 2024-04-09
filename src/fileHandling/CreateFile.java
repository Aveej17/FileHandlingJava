package fileHandling;


// Importing File class

import java.io.File;
// Importing the IOException class for handling errors
import java.io.IOException;
class CreateFile {
    public static void main(String args[]) {
        try {
            // Creating an object of a file
            File file = new File("D:FileOperationExample.txt");
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in the directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
    }
}
