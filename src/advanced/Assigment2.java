package advanced;

public class Assigment2 {
    
    void Sort(Array_Stack stack) {

    if (stack == null)
        return;
     
    int x = stack.pop();
     
    Sort(stack);
     
    Array_Stack temp;
     
    while (!stack.empty() && stack.top() > x) 
        temp.push(stack.pop());
    
     
    stack.push(x);
     
    while (temp != null) 
        stack.push(temp.pop());
    
}
    
}
