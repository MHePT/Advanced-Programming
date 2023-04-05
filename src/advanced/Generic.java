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

    public static <T> void swaparray(T[] arr, int index1, int index2) {
        T temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) 
            max = y;
        
        if (z.compareTo(max) > 0) 
            max = z;
        
        return max;
    }

}
