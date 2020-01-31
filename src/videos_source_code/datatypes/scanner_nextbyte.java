package videos_source_code.datatypes;

import java.util.Scanner;

public class scanner_nextbyte {

    public static void main(String[] args) {

        byte x;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        x = keyboard.nextByte();
        System.out.println(x);
    }
}
