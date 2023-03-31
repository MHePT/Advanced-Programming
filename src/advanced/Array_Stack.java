package advanced;

import java.util.ArrayList;

public class Array_Stack < T > {
    
    private ArrayList<T> elements;
    
    Array_Stack(){
        elements = new ArrayList<>();
    }
    
    void push(T Value){
        elements.add(Value);
    }
    
    void pop(T Value){
        elements.remove(Value);
    }
    
}
