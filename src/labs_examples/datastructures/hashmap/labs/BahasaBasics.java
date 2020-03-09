package labs_examples.datastructures.hashmap.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class BahasaBasics {

    public static void main(String[] args) {

        HashMap <String, String> basics = new HashMap<>();

        basics.put("Hello", "Halo");
        basics.put("Good Morning", "Selamat Pagi");
        basics.put("How are you?", "Apa Kabar?");
        basics.put("I","Saya");
        basics.put("You","Anda");
        basics.put("He/She", "Dia");
        basics.put("Rice","Nasi");
        basics.put("You're welcome", "sama-sama");

        System.out.println(basics);

        System.out.println(basics.get("I"));

        HashMap<String, String> greetings = new HashMap<>();


        greetings.put("Good afternoon 1", "Selamat siang");
        greetings.put("Good afternoon 2","Selamat sore");
        greetings.put("Good evening", "Selamat malam");
        greetings.put("good night","Selamat tidur");
        greetings.put("Goodbye","Selamat tinggal");
        greetings.put("Welcome","Selamat datang");

        basics.putAll(greetings);
        System.out.println();
        System.out.println(basics);


    }

}
