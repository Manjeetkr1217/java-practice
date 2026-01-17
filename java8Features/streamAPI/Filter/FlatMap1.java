package java8Features.streamAPI.Filter;

import java.util.Arrays;
import java.util.List;

public class FlatMap1 {

    public static void main(String[] args) {
        
        List<String[]> stringArrayList = 
        List.of(
            new String[] {"a", "b"},
            new String[] {"c","d"},
            new String[] {"e", "f"}
        );

        System.out.println(stringArrayList);

        stringArrayList.stream()
            .flatMap(sa -> Arrays.stream(sa))
            .forEach(ele -> System.out.print(ele + ", "));

    }
    
}
