package videos_source_code.arrays;

import java.util.ArrayList;

public class arraylists_vid_ex1 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Programming");
        arrayList.add("is");
        arrayList.add("so");
        arrayList.add("cool");
        arrayList.remove("World");

        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
