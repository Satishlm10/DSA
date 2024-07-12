import java.util.List;
import java.util.Stack;

public class StackTutorial {
    public void stack(){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println();
        stack.pop();
        System.out.println(stack);
        System.out.println();
        stack.pop();
        System.out.println(stack);
        System.out.println();
        int topItem = stack.peek();
        System.out.println(topItem);
        
    }
}
