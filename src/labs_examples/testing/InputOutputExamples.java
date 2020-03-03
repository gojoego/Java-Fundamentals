package labs_examples.testing;

import java.io.*;
import java.util.ArrayList;

public class InputOutputExamples {

    static String filepath = "/Users/joe/Documents/CodingNomads/personal.txt";

    public static void main(String[] args) throws IOException {

        //demonstrateInputStream();
        //demonstrateBufferedInputStream();
        //demonstrateCharacterStream();

        ArrayList<Person> people = demonstrateBufferedCharacterStream();
            for (Person p : people) {
                System.out.println(p.toString());
        }
        int avgAge = calculateAvgAge(people);
        System.out.println("the average age of these people is " + avgAge);
    }

    private static int calculateAvgAge(ArrayList<Person> people) {
        int sum = 0;
        for (Person p : people) {
            sum += p.getId();
        }
        return sum / people.size();
    }

    public static void demonstrateInputStream() {
        File f = new File(filepath);
        FileInputStream fis;
        int val;

        try {
            fis = new FileInputStream(f);
            while ((val = fis.read()) != -1) {
                System.out.print((char) val);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found - demonstrateInputStream()");
        } catch (IOException e) {
            System.out.println("IOException - demonstrateInputStream()");
        }
    }

    public static void demonstrateBufferedInputStream() throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filepath));

        int val = 0;
        byte[] buffer = new byte[4];

        while ((val = bis.read(buffer, 0, buffer.length)) != -1) {
            for (byte b : buffer) {
                System.out.print((char) b);
            }
        }
    }

    public static void demonstrateCharacterStream() throws IOException {

        FileReader fr = new FileReader(filepath);
        int val;
        while ((val = fr.read()) != -1) {
            System.out.print((char) val);
        }

    }

    public static void demonstrateCharacterInputStream() throws IOException {

        FileReader fr = new FileReader(filepath);
        int value;
        while ((value = fr.read()) != -1) {
            System.out.print((char) value);
        }
    }

    public static ArrayList<Person> demonstrateBufferedCharacterStream() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
        ArrayList<Person> people = new ArrayList<>();
        String val = "";

        // read off the first line (the headers) and do nothing with it
        br.readLine();

        while ((val = br.readLine()) != null) {

            //   Person p = new Person(Integer.parseInt(elements[0], elements[1], elements[2]);
            String[] elements = val.split(",");
            int id = Integer.parseInt(elements[0]);
            String name = elements[1];
            String home = elements[2];
            Person p = new Person(id, name, home);
            people.add(p);
        }
        return people;
    }

}
