package advanced;

import java.util.Stack;

public class Assigment2 {

    void Sort(Stack<Integer> stack) {

        if (stack.isEmpty()) 
            return;
        

        Integer x = stack.pop();

        Sort(stack);

        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty() && stack.peek() > x) 
            temp.push(stack.pop());
        

        stack.push(x);

        while (!temp.isEmpty()) 
            stack.push(temp.pop());
        

    }

}
