
import java.util.ArrayList;

public class ArrayBasics {

    public void gettingStartedIntoArray(){
         /*
                Data Structure - Array or List
                IN JAVA - we use collection: ArrayList (dynamic array)
         */

        //since java has type safety using basic array is inconvenient, so we use collections in java
        ArrayList<String > arrayStr = new ArrayList<>();

        // pushing or adding data in an array takes O(1) time
        // elements are push at the end of the list
        arrayStr.add("a");
        arrayStr.add("b");
        arrayStr.add("c");
        arrayStr.add("d");
        arrayStr.add("e");



        // lookup or accessing elements of array take O(1) time
        System.out.printf("%s", arrayStr.get(1));
        System.out.println();

        // pop or removing last item of the array takes O(1) time
        arrayStr.removeLast();

        /*
         insertion operation (not push) take O(n) time because to add a new item
         we need to iterate through the array to maintain the proper indexing of
         the array
         */
        arrayStr.addFirst("s");
        arrayStr.add(3,"x");

        System.out.printf("%s", arrayStr);
        System.out.println();


        /*
        Deletion (not pop) take O(n) time
         */

        arrayStr.remove(3);
        System.out.printf("%s", arrayStr);



    }
}
