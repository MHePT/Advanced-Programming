package advanced;

public class Tree_Node < T extends Comparable<T> > {
    
    T Data;
    Tree_Node<T > Left;
    Tree_Node<T > Right;
    
    Tree_Node(T Data){
        this.Data = Data;
        Left = Right = null;
    }
    
    void insert(T Value){
        
        if(Value.compareTo(Data) < 0){
            
            if(Left== null)
                Left = new Tree_Node<T>(Value);
            Left.insert(Value);
            
        }else if(Value.compareTo(Data) > 0){
            
            if(Right== null)
                Right = new Tree_Node<T>(Value);
            Right.insert(Value);
            
        }
    }
    
}
