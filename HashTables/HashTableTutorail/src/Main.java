public class Main {
    public static void main(String[] args) {

        HashMaps hashMaps = new HashMaps();
        hashMaps.hashMapExercise();

        LinkedHashMaps linkedHashMaps = new LinkedHashMaps();
        linkedHashMaps.linkedHashMapExercise();

        TreeMaps treeMaps = new TreeMaps();
        treeMaps.treeMapExercise();

        HashTables hashTables = new HashTables();
        hashTables.hashTableExample();
        System.out.println();


        // solving using array
        FirstRecurringNumber firstRecurringNumber = new FirstRecurringNumber();
        int number = firstRecurringNumber.firstRecurringNumberUsingArray();
        System.out.println("Using Array");
        if(number != 0) {
            System.out.println("First Recurring Number is:" + number);
        }
        else {
            System.out.println("No recurring number found");
        }


        System.out.println();

        // solving using hashtable
        int number2 = firstRecurringNumber.firstRecurringNumberUsingHashTable();
        System.out.println("Using HashTable");
        if(number2 != 0) {
            System.out.println("First Recurring Number is:" + number2);
        }
        else {
            System.out.println("No recurring number found");
        }

    }
}