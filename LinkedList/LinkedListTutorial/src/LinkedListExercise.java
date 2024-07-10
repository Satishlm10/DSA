import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExercise {

    public void linkedListExercise(){

        LinkedList<Integer> linkedList = new LinkedList<>();

        /*
            the LinkedList class follow doubly linked list of circular linked list
            data structure

         */

        // Linked list is index based in Java
        linkedList.add(0,100);
        linkedList.add(1,200);

        /*
            we can choose not to provide index
            the elements will be stored sequentially,
            so it follow insertion order
         */
        linkedList.add(300);
        linkedList.add(400);

        // we can check index of elements stored
        System.out.println(linkedList.indexOf(300));

        // we can access elements using index
        System.out.println(linkedList.get(2));

        System.out.println(linkedList);

        // prepend and append methods
        linkedList.addFirst(99);
        linkedList.addLast(9999);

        // we can remove item using its index
        linkedList.remove(1);

        System.out.println(linkedList);


        // also we can use iterators to access the elements of a collection

        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
