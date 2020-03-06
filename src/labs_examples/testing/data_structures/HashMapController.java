package labs_examples.testing.data_structures;



public class HashMapController {

    public static void main(String[] args) {

        CustHashMap<String, String> firstmap = new CustHashMap<>();

        firstmap.put("Sister", "Diana");
        firstmap.put("Brother", "Nate");

        System.out.println(firstmap.get("Brother"));
        

    }

}


