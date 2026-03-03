package streamapitest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOddByGrouping {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<String, List<Integer>> groupingNumber = list.stream()
                .collect(Collectors.groupingBy(n->(n%2==0) ? "Even":"Odd"));
        System.out.println("Grouped even and odd numbers :"+groupingNumber);
    }
}
