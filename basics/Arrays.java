package basics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        // Arrays

        String[] myStringArray = new String[3];
        myStringArray[0] = "ece";
        myStringArray[1] = "sensoz";
        myStringArray[2] = "23";
        System.out.println(myStringArray);
        ///////////////////////////////////
        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        System.out.println(myIntegerArray[2]);
        ///////////////////////////////////
        int[] myNumber = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(myNumber[2] + "\n");

        // Lists

        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("james");
        myMusicians.add("larse");
        myMusicians.add(1, "Kirk");// belirtilen indexe konumlanır
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        System.out.println(myMusicians.size() + "\n");

        // Set

        HashSet<String> mySet = new HashSet<>();
        mySet.add("james"); // set ile bir deger bir kere atanabilir
        mySet.add("james");
        System.out.println(mySet.size() + "\n");

        // HashMap
        // anahtar deger cifti ile veri depo etmeyi saglar
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "James");
        myHashMap.put("instrument", "Guitar");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        // int ilkel ,primitif bir degerdir
        // asagida primitif deger alinmaz sinifin adini alir
        // goruldugu gibi deger sadece string string olmak zorunda degil
        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);
        System.out.println(mySecondMap.get("run"));
    }
}
