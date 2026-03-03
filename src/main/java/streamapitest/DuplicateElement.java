package streamapitest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list2= Arrays.asList(10 ,20, 30, 20, 40, 10, 50, 30);
        Map<Integer,Long> map=list2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((key,value)->{
            if(value>1){
                System.out.println(key);
            }
        });

    }
}
