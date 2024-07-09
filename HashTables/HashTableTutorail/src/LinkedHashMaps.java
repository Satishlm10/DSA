import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {

    public void linkedHashMapExercise(){
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();

        // follows order of insertion
        linkedHashMap.put(100,"abcd");
        linkedHashMap.put(1,"a");
        linkedHashMap.put(2,"b");
        linkedHashMap.put(3,"c");
        linkedHashMap.put(4,"d");


        System.out.println("Linked Hash Map Example"+linkedHashMap);
        System.out.println();
    }
}
