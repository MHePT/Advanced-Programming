package advanced;

import java.io.Serializable;

public class Generic<T extends Object & Serializable & Comparable> {

    T ThingToPrint;

    Generic(T ThingToPrint) {
        this.ThingToPrint = ThingToPrint;
    }

    public static <M> void Print(M t) {
        System.out.println(t);
    }

    public void Print() {
        System.out.println(ThingToPrint);
    }

    public static <Data_Type> void swaparray(Data_Type[] arr, int index1, int index2) {
        Data_Type temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static <Data_Type extends Comparable<Data_Type>> Data_Type maximum(Data_Type x, Data_Type y, Data_Type z) {
        Data_Type max = x;
        if (y.compareTo(max) > 0) 
            max = y;
        
        if (z.compareTo(max) > 0) 
            max = z;
        
        return max;
    }

}
