package advanced;

public class LinkedList < T > {
    
    private Node< T > First;
    private Node< T > Last;
    String Name;

    LinkedList(String Name) {
        this.Name = Name;
        First = Last = null;
    }

    LinkedList(Node<T> First, String Name) {
        this.First = First;
        this.Name = Name;
        Last = null;
    }
    
    boolean isEmpty(){
        return First == null;
    }
    
    void Insert_At_Front(T newValue){
        
        Node <T> newNode = new Node(newValue);
        newNode.setNext(First);
        First = newNode;
        
        if(Last == null)
            Last = First;
        
    }
    
    void Insert_At_Back(T newValue){
        
        Node newNode = new Node(newValue);
        Last.setNext(newNode);
        Last = newNode;
        
        if(First == null)
            First = Last;
        
    }
    
    T Remove_From_Front(){
        
        if(First == null)
            return null;
        
        T Result = First.getData();
        
        if(First == Last)
            First = Last = null;
        
        First = First.getNext();
        
        return Result;
        
    }
    
    T Remove_From_Back(){
        
        if(Last == null)
            return null;
        
        T Result = Last.getData();
        
        if(First == Last)
            First = Last = null;
        
        Node Runner = First;
        while(Runner.getNext().getNext()!=null)
            Runner = Runner.getNext();
        
        Runner.setNext(null);
        Last = Runner;
        
        return Result;
        
    }
    
    void Print(){
        Node Runner = First;
        
        while(Runner.getNext()!=null)
        {
            System.out.println(Runner.getData());
            Runner = Runner.getNext();
        }
    }

    T getFirst() {
        return First.getData();
    }

    T getLast() {
        return Last.getData();
    }

    String getName() {
        return Name;
    }
}
