package advanced;

public class Queue < T > {
    
    private LinkedList<T> list;
    
    Queue(){
        list =new LinkedList("Queue");
    }
    
    void Enqueue(T object){
        list.Insert_At_Back(object);
    }
    
    T Dequeue(){
        return list.Remove_From_Front();
    }
    
    boolean isEmpty(){
        return list.isEmpty();
    }
    
    void print(){
        list.Print();
    }
    
}
