package streamapitest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<Integer> evenNumbers=list.stream().filter(n->n%2==0).toList();
        System.out.println("Even:"+evenNumbers);
        List<Integer> oddNumbers=list.stream().filter(n->n%2==1).toList();
        System.out.println("Odd:"+oddNumbers);

    }
}
