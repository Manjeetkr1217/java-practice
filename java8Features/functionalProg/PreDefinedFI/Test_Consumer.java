package java8Features.functionalProg.PreDefinedFI;
import java.util.function.Consumer;

public class Test_Consumer {

    public static void main(String[] args) {
        
        Consumer<Integer> c1 = value -> System.out.println(value);
        Consumer<Double> c2 = value -> System.out.println(value);
        Consumer<String> c3 = value -> System.out.println(value);
        c1.accept(25);
        c2.accept(255.2);
        c3.accept("Manjeet");

        System.out.println();
        //===========================================================

        Consumer<Integer> c4 = System.out::println;
        Consumer<Double> c5 = System.out::println;

        c4.accept(252);
        c5.accept(36.5);

        System.out.println();

        //================================================

        Consumer<int[]> c6 = value -> {
            for(int i = 0;i < value.length; i++){
                System.out.println(value[i]);
            }
        };

        c6.accept(new int[]{5,6,7,8,9});



        


    }
    
}
