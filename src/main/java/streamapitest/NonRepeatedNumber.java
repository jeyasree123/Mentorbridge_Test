package streamapitest;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedNumber {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(4 ,5 ,1 ,2 ,0, 4, 5, 2);
        Map<Integer,Long> map=list1.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
           for (Map.Entry<Integer, Long> entry : map.entrySet()){
               if (entry.getValue() == 1) {
                   System.out.println("First non-repeated numberis : "+entry.getKey());
                            break;
               }
           };
    }

}
