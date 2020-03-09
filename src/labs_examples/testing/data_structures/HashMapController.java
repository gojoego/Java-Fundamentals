package labs_examples.testing.data_structures;


public class HashMapController {

    public static void main(String[] args) {

        CustHashMap<String, String> family = new CustHashMap<>();
        //  HashMap<String, Integer> f = new HashMap<>();
        //  f.put("p", 1);
        //  f.containsKey("p");
        //   f.isEmpty();

        family.put("Older Sister", "Diana");
        family.put("Brother", "Nate");
        family.put("Oldest Sister", "Gia");
        family.put("Mother", "Ann");
        family.put("Uncle", "Val");
        family.put("Aunt", "Mae");
        family.put("Grandma", "Miriam");
        family.put("Cousin", "Matt");


        System.out.println(family.get("Older Sister"));
        System.out.println(family.get("Brother"));
        System.out.println(family.get("Oldest Sister"));
        System.out.println(family.get("Mother"));
        System.out.println(family.get("Uncle"));
        System.out.println(family.get("Aunt"));
        System.out.println(family.get("Grandma"));
        System.out.println(family.get("Cousin"));



    }

}


