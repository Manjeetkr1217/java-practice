package java8Features.functionalProg.PreDefinedFI;

import java.util.function.Supplier;

public class Test_Supplier {

    public static void main(String[] args) {

       Supplier<Integer> s1 = () -> 5;
       Supplier<Double> s2 = () -> 5.5;
       Supplier<String> s3 = () -> "Hello";
       Supplier<int[]> s4 = () -> new int[] {5,6,7,8,9};
       Supplier<Boolean> s5 = () -> true; 

        int res1 = s1.get();      System.out.println(res1);
        double res2 = s2.get();   System.out.println(res2);
        String res3 = s3.get();   System.out.println(res3);
        int[] res4 = s4.get();   System.out.println(java.util.Arrays.toString(res4));
        boolean res5 = s5.get(); System.out.println(res5);

    


    }
}
