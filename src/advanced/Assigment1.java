package advanced;

public class Assigment1 {
    
    static void Display_Reverse(LinkedList L) {

        LinkedList<Integer> Temp = new LinkedList("Temp");

        while (!L.isEmpty()) {

            int d = (int) L.Remove_From_Front();
            
            if(d%2==0)
            System.out.println(d);

            Temp.Insert_At_Front(d);
        }
        
        while (!Temp.isEmpty()) {
            L.Insert_At_Front(Temp.Remove_From_Front());
        }
    }
    
}
