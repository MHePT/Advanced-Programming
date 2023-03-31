package advanced;

public class Stack_Inheritance < T > extends LinkedList< T >{
    
    public Stack_Inheritance() {
        super("Stack");
    }
    
    void push(T newValue){
         Insert_At_Front(newValue);
    }
    
    T pop(){
        return Remove_From_Front();
    }
    
}
