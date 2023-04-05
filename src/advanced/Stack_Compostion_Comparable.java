package advanced;

public class Stack_Compostion_Comparable < T extends Comparable<T>> extends Stack_Compostion<T> {
    
    T pop(){
       return  getList().Remove_From_Front();
    }
    
    T peek(){
        return getList().getFirst();
    }
    
}
