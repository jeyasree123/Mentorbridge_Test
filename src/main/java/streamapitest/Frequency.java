package streamapitest;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 3, 2, 4, 1, 5, 1);
        Map<Integer,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        for(Integer key: map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
