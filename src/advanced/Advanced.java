package advanced;

public class Advanced {

    public static void main(String[] args) {
        Generic <Integer> g1 = new Generic<>(3);
        Generic <Double> g2 = new Generic<>(3.5);
        
        g1.Print();
        g2.Print();
    }
    
}
