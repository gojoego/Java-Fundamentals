package videos_source_code.arrays;

import java.util.ArrayList;

public class arraylist_ex2 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("I");
        arrayList.add("am");
        arrayList.add("ready");
        arrayList.add("ready");

        String val = arrayList.get(4);

        boolean check = arrayList.contains("ready");
        System.out.println(check);

        for (String s : arrayList){
            System.out.println(s);

        }

        int lastIndexOfProgramming = arrayList.lastIndexOf("ready");
        System.out.println(lastIndexOfProgramming);

    }

}
