package advanced;

public class Assigment1 {
    
    static void Display_Reverse(LinkedList L) {

        LinkedList Temp = new LinkedList();

        while (!L.isEmpty()) {

            int d = L.Pop();
            
            if(d%2==0)
            System.out.println(d);

            Temp.Push(d);
        }
        
        while (!Temp.isEmpty()) {
            L.Push(Temp.Pop());
        }
    }
    
}
