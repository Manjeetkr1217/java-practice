package java8Features.functionalProg.PreDefinedFI;

import java.util.function.Function;

// Develop a LE to take an array of integer 
// add all those integers adn return sum

public class Code1 {

    public static void main(String[] args) {

        Function<int[], Integer> f1 = (arr) -> {
            int sum =arr[0];
                for(int i =1;i<arr.length; i++){
                    sum = sum + arr[i];
                }
                return sum;
        };

        int res = f1.apply(new int[] {5,6,7,8,9});
        System.out.println(res);

        

    }
    
}
