package advanced;

import java.util.Stack;
        
public class Final_Project {
    
    public static<T> boolean compare(Stack<T> s1,Stack<T> s2){
        
        if (s1.isEmpty() && s2.isEmpty()) 
            return true;
        

        if (s1.isEmpty() || s2.isEmpty()) 
            return false;
        
        while (!s2.isEmpty() && !s2.isEmpty()) {

            if (!s2.pop().equals(s2.pop())) 
                return false;
            
        }
        
        return true;
        
    }
    
}
