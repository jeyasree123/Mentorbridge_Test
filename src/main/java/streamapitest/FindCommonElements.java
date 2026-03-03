package streamapitest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2=Arrays.asList(30, 40, 60, 70);
        list1.stream().filter(list2::contains).forEach(System.out::println);

    }
}
