package labs_examples.datastructures.hashmap.labs;

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


    }

}
