package streamapitest;

import java.util.Arrays;
import java.util.List;

public class SquareOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5, 10, 15, 20, 25, 30);
       int sumOfSquareOfEvenNumbers= list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println(sumOfSquareOfEvenNumbers);

    }
}
