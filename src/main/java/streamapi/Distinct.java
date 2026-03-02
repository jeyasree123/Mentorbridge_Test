package streamapi;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        List<Integer> newList=list.stream().distinct().toList();
        System.out.println(newList);
    }
}
