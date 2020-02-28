package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
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

        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        String filePath = "/Users/joe/Documents/CodingNomads/labs/online-java-" +
                "fundamentals/src/labs_examples/input_output/labs/UbudInfo";

        try {

            bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

            byte[] buffer = new byte[8];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {

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