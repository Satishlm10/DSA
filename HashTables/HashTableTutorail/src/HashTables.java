import java.util.Hashtable;

public class HashTables {

    public void hashTableExample(){
        Hashtable<Integer,String > hashtable = new Hashtable<>();

        /*
            it is similar to hashmap, but it doesn't allow any null key or null value
            it is neither sorter nor preserves order of insertion
         */
        /*
            hashtable.put(null,"abcd");
            it will generate NullPointerException
         */
        hashtable.put(10,"abcd");
        hashtable.put(100,"efgh");
        hashtable.put(1,"ijkl");

        System.out.println("Hash Table Example"+hashtable);



       }
}
