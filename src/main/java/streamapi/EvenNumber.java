package streamapi;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,15,8,49,25,98,32);
        num.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
