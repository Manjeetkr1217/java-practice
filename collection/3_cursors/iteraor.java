import java.util.ArrayList;
import java.util.Iterator;

public class iteraor {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Ravi");
        name.add("Sohan");
        name.add("Manjeet");
        name.add("Kumar");

        Iterator<String> list = name.iterator();
        System.out.println(name);
        while(list.hasNext()){
            if(list.next() == "Ravi")
                list.remove();
        }
        System.out.println(name);
    }
}
