@FunctionalInterface
interface addition{
    void add(int t1, int t2);
}


public class first {
    public static void main(String[] args) {

        addition a1 = (int a, int b) -> {System.out.println(a+b);};
        
        a1.add(5, 7);
    }
}
