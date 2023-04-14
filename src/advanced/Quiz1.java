package advanced;

import java.util.ArrayList;
import java.util.Stack;

public class Quiz1 {

    static void remove_odd(ArrayList<Integer> arr) {
        ArrayList<Integer> odds = new ArrayList<>();
        
        for (Integer x : arr) 
            if (x % 2 == 1) 
                odds.add(x);
            
        for (Integer x : odds) 
            arr.remove(x);
            
    }

    Stack<Integer> stack;

    Quiz1(Stack<Integer> stack) {
        this.stack = stack;
    }

    void sort(){
        sort_helper(stack);
    }
    
    private void sort_helper(Stack<Integer> stack) {

        if (stack.isEmpty()) 
            return;
        

        Integer x = stack.pop();

        sort_helper(stack);

        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty() && stack.peek() > x) 
            temp.push(stack.pop());
        

        stack.push(x);

        while (!temp.isEmpty()) 
            stack.push(temp.pop());
        
    }
    
    int count(){
        int counter = 0;
        
        for(Integer x:stack)
            counter++;
        
        return counter;
    }
    
    void print(){
        for(Integer x:stack)
            System.out.println(x);
    }

}
