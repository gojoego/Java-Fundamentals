package labs_examples.datastructures.hashmap.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.BiConsumer;

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

        System.out.println(basics.size());

        System.out.println(basics.containsKey("Welcome"));
        System.out.println(basics.containsValue("Turducken"));

        System.out.println(basics.keySet());

        System.out.println(basics.entrySet());

        basics.putIfAbsent("Sorry","Maaf");

        System.out.println(basics);
        System.out.println(basics.size());

        basics.remove("Good afternoon 2","Selamat sore");

        System.out.println(basics);
        System.out.println(basics.size());

        basics.replace("Good afternoon 1", "Selamat siang","Selamat sore");

        System.out.println(basics);
        System.out.println(basics.size());

        basics.clear();
        System.out.println(basics);
        System.out.println(basics.size());

        basics.forEach(print());







    }

    private static BiConsumer<? super String,? super String> print() {

        return null;
    }

}
