import java.util.Enumeration;
import java.util.Vector;

class Enumerator{
    public static void main(String[] args){

        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Papaya");

        Enumeration<String> list = fruits.elements();

        while(list.hasMoreElements()){
            System.out.println(list.nextElement());
        }
    }
}