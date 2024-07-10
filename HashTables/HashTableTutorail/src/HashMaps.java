import java.util.*;
public class HashMaps {

    public void hashMapExercise(){
        Map<Integer,String> hashMap = new HashMap<>();

        // doesn't follow order of insertion, nor it is sorted
        // but allow one null key
        hashMap.put(100,"abcd");
        hashMap.put(10,"efgh");
        hashMap.put(1,"zzzz");
        hashMap.put(2,"yyyy");
        hashMap.put(3,"xxxx");
        hashMap.put(3,"wwww"); // providing same key overrides previous saved value

        /*
        since hashmap allows only one null key any previous value with null key will get overridden
        if a new value with null key is inserted into the map
         */
        hashMap.put(null,"first null value");
        hashMap.put(null,"second null value");

        System.out.println("HashMap Example"+hashMap);
        System.out.println();

    }
}
