package streamapitest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 45, 67, 23, 89, 54, 89);
        int secondHighestNum = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("The second greatest number is:" + secondHighestNum);
    }
}