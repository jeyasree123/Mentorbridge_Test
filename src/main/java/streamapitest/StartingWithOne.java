package streamapitest;

import java.util.Arrays;
import java.util.List;

public class StartingWithOne {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10 ,15, 23, 11, 45, 19, 30);
        list.stream().filter(n->String.valueOf(n).startsWith("1")).forEach(System.out::println);
    }
}
