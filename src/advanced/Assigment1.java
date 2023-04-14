package advanced;

import java.util.LinkedList;

public class Assigment1 {
    
    static void Display(LinkedList L) {

        LinkedList<Integer> Temp = new LinkedList();

        while (!L.isEmpty()) {

            int d = (int) L.removeFirst();
            
            if(d%2==0)
            System.out.println(d);

            Temp.addFirst(d);
        }
        
        while (!Temp.isEmpty()) 
            L.addFirst(Temp.removeFirst());
        
    }
    
}
