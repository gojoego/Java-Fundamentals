package labs_examples.testing.data_structures;



public class HashMapController {

    public static void main(String[] args) {

        CustHashMap<String, String> firstmap = new CustHashMap<>();

        firstmap.put("Older Sister", "Diana");
        firstmap.put("Brother", "Nate");
        firstmap.put("Oldest Sister", "Gia");

        System.out.println(firstmap.get("Older Sister"));
        System.out.println(firstmap.get("Brother"));
        System.out.println(firstmap.get("Oldest Sister"));



    }

}


