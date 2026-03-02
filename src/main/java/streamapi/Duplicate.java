package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("AA","BB","AA","CC");
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        map.forEach((key,value)->{
            if(value>1){
                System.out.println("The Duplicate Element is "+key+"="+value);
            }
        });

    }
}
