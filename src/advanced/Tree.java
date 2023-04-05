package advanced;

public class Tree<T extends Comparable<T> > {
    
    private Tree_Node<T> root;
    
    Tree(){
        root = null;
    }
    
    void insert(T insertValue){
        
        if(root == null)
            root = new Tree_Node<>(insertValue);
        else
            root.insert(insertValue);
    }
    
    private void Print_Pre_Order_Helper(Tree_Node<T> root){
        
        if(root == null)
            return;
        
        System.out.println(""+root.Data);
        Print_Pre_Order_Helper(root.Left);
        Print_Pre_Order_Helper(root.Right);
    }
    
    private void Print_Post_Order_Helper(Tree_Node<T> root){
        
        if(root == null)
            return;
        
        Print_Pre_Order_Helper(root.Left);
        Print_Pre_Order_Helper(root.Right);
        System.out.println(""+root.Data);
    }
    
    private void Print_in_Order_Helper(Tree_Node<T> root){
        
        if(root == null)
            return;
        
        Print_Pre_Order_Helper(root.Left);
        System.out.println(""+root.Data);
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
    
}
