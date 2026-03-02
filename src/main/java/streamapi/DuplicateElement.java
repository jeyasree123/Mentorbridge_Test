package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,15,8,49,25,98,98,32,15);
        Map<Integer,Long> duplicateElements=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        duplicateElements.forEach((Key,Value)->{
            if(Value>1){
                System.out.println(Key);
            }

        });
    }
}
