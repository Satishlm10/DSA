import java.util.HashMap;
import java.util.Map;

public class FirstRecurringNumber {

    /*
        Given an array A=[1,2,3,4,5,6,8,7,8,2]
        we've to find the first recurring number
        in above case it is 2
     */

    // using 2 loops the BigO is O(n^2)

    public int firstRecurringNumberUsingArray()
    {
        int[] arr = {1,2,3,4,5,6,8,7,2,8};

        for(int i = 0; i<arr.length; i++)
        {
            for (int j = i+1;j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                {
                    return arr[i];
                }
            }

        }
        return 0;
    }
        /*
            using hashtable we only required one for loop which is
            better algorithm with BigO O(n)
        */
    public int firstRecurringNumberUsingHashTable(){
        int[] arr = {1,2,3,4,5,6,8,7,2,8};
        Map<Integer,Integer> hashmap = new HashMap<>();

        hashmap.put(arr[0],null);
        for(int i = 1; i < arr.length; i++){
            if(hashmap.containsKey(arr[i])){
                return arr[i];
            }
                hashmap.put(arr[i],null);
        }
        return 0;


    }
}
