package advanced;

public class Tree<T extends Comparable<T> > {
    
    private Tree_Node<T> root;
    
    Tree(){
        root = null;
    }
    
}
