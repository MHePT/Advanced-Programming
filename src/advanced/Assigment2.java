package advanced;

public class Assigment2 {
    
    void Sort(Stack_Compostion_Comparable stack) {

    if (stack == null)
        return;
     
    Object x = stack.pop();
     
    Sort(stack);
     
    Stack_Compostion_Comparable temp = null;
     
    while (!stack.isEmpty() && stack.peek().compareTo(x) > 0) 
        temp.push(stack.pop());
    
     
    stack.push(x);
     
    while (temp != null) 
        stack.push(temp.pop());
    
}
    
}
