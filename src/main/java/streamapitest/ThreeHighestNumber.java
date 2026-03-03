package streamapitest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeHighestNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10, 80, 45, 60, 30, 90, 20);
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

    }
}
