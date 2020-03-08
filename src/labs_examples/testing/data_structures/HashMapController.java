package labs_examples.testing.data_structures;


import java.util.HashMap;

public class HashMapController {

    public static void main(String[] args) {

        CustHashMap<String, String> firstmap = new CustHashMap<>();
      //  HashMap<String, Integer> f = new HashMap<>();
      //  f.put("p", 1);
      //  f.containsKey("p");
     //   f.isEmpty();

        firstmap.put("Older Sister", "Diana");
        firstmap.put("Brother", "Nate");
        firstmap.put("Oldest Sister", "Gia");

        System.out.println("before");

        System.out.println(firstmap.get("Older Sister"));
        System.out.println(firstmap.get("Brother"));
        System.out.println(firstmap.get("Oldest Sister"));

        firstmap.remove("Brother");

        System.out.println("after");

        System.out.println(firstmap.get("Older Sister"));
        System.out.println(firstmap.get("Brother"));
        System.out.println(firstmap.get("Oldest Sister"));


    }

}


