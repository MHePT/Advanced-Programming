package advanced;

public class Tree<T extends Comparable<T> > {
    
    private Tree_Node<T> root;
    
    Tree(Tree_Node<T> root){
        this.root = root;
    }
    
    void insert(T insertValue){
        
        if(root == null)
            root = new Tree_Node<>(insertValue);
        else
            root.insert(insertValue);
    }
    
    private boolean Remove_Helper(Tree_Node<T> root,T removeValue){
        
        if(root == null)
            return false;
                
        if(removeValue.compareTo(root.Data) > 0)
           return Remove_Helper(root.Right,removeValue);
        
        if(removeValue.compareTo(root.Data) < 0)
           return Remove_Helper(root.Left,removeValue);
        
        if(removeValue.compareTo(root.Data) == 0)
            root.Data = null;
        
        return true;
    }
    
    private boolean Search_Helper(Tree_Node<T> root,T Target){
        
        if(root == null)
            return Target == null;
                
        if(Target.compareTo(root.Data) > 0)
           return Remove_Helper(root.Right,Target);
        
        if(Target.compareTo(root.Data) < 0)
           return Remove_Helper(root.Left,Target);
        
        if(Target.compareTo(root.Data) == 0)
            return true;
        
        return false;
    }
    
    private void Print_Pre_Order_Helper(Tree_Node<T> root){
        
        if(root == null)
            return;
        
        System.out.println(""+root);//Same as root.Data
        Print_Pre_Order_Helper(root.Left);
        Print_Pre_Order_Helper(root.Right);
    }
    
    private void Print_Post_Order_Helper(Tree_Node<T> root){
        
        if(root == null)
            return;
        
        Print_Pre_Order_Helper(root.Left);
        Print_Pre_Order_Helper(root.Right);
        System.out.println(""+root);//Same as root.Data
    }
    
    private void Print_in_Order_Helper(Tree_Node<T> root){
        
        if(root == null)
            return;
        
        Print_Pre_Order_Helper(root.Left);
        System.out.println(""+root);//Same as root.Data
        Print_Pre_Order_Helper(root.Right);
    }
    
    void Print_Pre_Order(){
        Print_Pre_Order_Helper(root);
    }
    
    void Print_Post_Order(){
        Print_Post_Order_Helper(root);
    }
    
    void Print_in_Order(){
        Print_in_Order_Helper(root);
    } 
    
    boolean Remove(T removeValue){
       return Remove_Helper(root, removeValue);
    }
    
    boolean Search(T Target){
       return Search_Helper(root, Target);
    }
    
}
