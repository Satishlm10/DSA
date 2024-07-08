import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {

    public void sortedArray(){
        ArrayList<Integer> sortedArray1 = new ArrayList<>(Arrays.asList(0,3,11,98));

        ArrayList<Integer> sortedArray2 = new ArrayList<>(Arrays.asList(5,9,12,32));

        ArrayList<Integer> mergeSorted = new ArrayList<>();

        mergeSorted.addAll(sortedArray1);
        mergeSorted.addAll(sortedArray2);

        System.out.println(mergeSorted);

        Collections.sort(mergeSorted);

        System.out.println(mergeSorted);

    }
}
