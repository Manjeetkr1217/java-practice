package java8Features.functionalProg.PreDefinedFI;

import java.util.function.Predicate;

// Develop a LE to take an array of integers check whether
// it contains atleast one even number, if available return true, else 
// return false

public class Code2 {

    public static void main(String[] args) {

        Predicate<int[]> p1 = (arr) -> {
            for(int i =0;i< arr.length; i++){
                if(arr[i] % 2 == 0){
                    return true;
                }
            }
            return false;
        };

        boolean res = p1.test(new int[] { 1,2,5,7,9});
        System.out.println(res);
        
    }
    
}
