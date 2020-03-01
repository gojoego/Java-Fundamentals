package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NotesFromClass2 {

    public static void main(String[] args) throws IOException {
        // we need to declare these streams outside the try block since we need to
        // access them and close in the finally block at the bottom
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;


        try {
            inputStream = new FileInputStream("/Users/ryandesmond/Desktop/input_output/file.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);


            // this will hold the collection of bytes that we read at once
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            // this while loop will read the file 5 bytes at a time
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                // print out bytes read to console
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            // there's a possibility that closing these streams can throw an exception
            // we be using the Try-With-Resources shortly to avoid the need for this
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

/*

In the code above we are creating 3 distinct Threads using the Runnable interface.
There are many ways to create Threads. This is just one example.
In this example, we are automatically creating the Thread object inside the constructor
of MyFirstRunnable. We pass in "the Runnable" which in this case is the class
MyFirstRunnable (which implements Runnable) to the constructor of the Thread class.
There are many constructors to choose from in the Thread class.
You can see the one we're using in the image below

 */