package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text
 *      file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        // declare FileInputStream and BufferedInputStream outside of the try/catch/finally blocks
        // so they can be accessed and closed in the finally block at the end of code
        // also so you can access in multiple blocks
        BufferedInputStream bufferedInputStream = null;

        // declare path to file you want read
        // can use absolute path or relative path
        // safer to use absolute path - starts from the root
        // also called the fully qualified path
        String filePath = "/Users/joe/Documents/CodingNomads/labs/online-java-" +
                "fundamentals/src/labs_examples/input_output/labs/UbudInfo";
        // opening FileInputStream by providing path to UbudInfo file

        try {

            bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

            byte[] buffer = new byte[8];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {

                System.out.print(new String(buffer, 0, bytesRead));
                // "out" is a byte stream - print stream
                // in print stream class there is a println
                // good example of polymorphism
            }
        } catch(FileNotFoundException exc){
            System.out.println("file does not exist");
            //
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            // there's a possibility that closing these streams can throw an exception
            // we be using the Try-With-Resources shortly to avoid the need for this
            try {
                bufferedInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}