package labs_examples.testing.data_structures;


public class HashMapController {

    public static void main(String[] args) {

        CustHashMap<String, String> family = new CustHashMap<>();

        family.put("Older Sister", "Diana");
        family.put("Brother", "Nate");
        family.put("Oldest Sister", "Gia");
        family.put("Mother", "Ann");
        family.put("Uncle", "Val");
        family.put("Aunt", "Mae");
        family.put("Grandma", "Miriam");
        family.put("Cousin", "Matt");
        family.put("Sister in Law", "Rebecca");


        System.out.println(family.get("Older Sister"));
        System.out.println(family.get("Brother"));
        System.out.println(family.get("Oldest Sister"));
        System.out.println(family.get("Mother"));
        System.out.println(family.get("Uncle"));
        System.out.println(family.get("Aunt"));
        System.out.println(family.get("Grandma"));
        System.out.println(family.get("Cousin"));
        System.out.println(family.get("Sister in Law"));

        System.out.println();

        System.out.println("original above");

        System.out.println();

        System.out.println("My older sister is " + family.get("Older Sister"));


        family.remove("Sister in Law");

        family.printList();


        System.out.println(family.contains("Sister in Law"));


        System.out.println();
        boolean i = family.contains("Brother");
        System.out.println(i);


    }

}


