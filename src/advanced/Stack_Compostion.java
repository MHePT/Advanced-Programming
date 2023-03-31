package advanced;

public class Stack_Compostion < T > {
    
    private LinkedList <T> list;

    public Stack_Compostion() {
        list = new LinkedList("Stack");
    }
    
    void push(T object){
        list.Insert_At_Front(object);
    }
    
    T pop(){
       return  list.Remove_From_Front();
    }
    
    T peek(){
        return list.getFirst();
    }
    
    boolean isEmpty(){
        return list.isEmpty();
    }
    
    void print(){
        list.Print();
    }

    public LinkedList<T> getList() {
        return list;
    }
    
}
