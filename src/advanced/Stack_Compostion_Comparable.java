package advanced;

public class Stack_Compostion_Comparable < T extends Comparable<T>> extends Stack_Compostion<T> {
    
    @Override
    T pop(){
       return  getList().Remove_From_Front();
    }
    
    @Override
    T peek(){
        return getList().getFirst();
    }
    
}
