import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTutorial {

    public void queue(){
        Queue<Integer> queueUsingLinkedList = new LinkedList<>();
        queueUsingLinkedList.add(10);
        queueUsingLinkedList.add(20);
        System.out.println(queueUsingLinkedList);


        Queue<Integer> arraydeque = new ArrayDeque<>();
        arraydeque.add(10);
        arraydeque.add(20);
        System.out.println(arraydeque);


        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println(priorityQueue);

    }
}
