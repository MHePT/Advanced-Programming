package advanced;

public class Node < T > {
    
    private T Data;
    private Node<T> Next;
    
    Node(T Data){
        this.Data = Data;
    }
    
    Node(T Data, Node<T> Next) {
        this.Data = Data;
        this.Next = Next;
    }

    T getData() {
        return Data;
    }

    void setData(T Data) {
        this.Data = Data;
    }

    Node<T> getNext() {
        return Next;
    }

    void setNext(Node<T> Next) {
        this.Next = Next;
    }
    
}
