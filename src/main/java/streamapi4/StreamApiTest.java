package streamapi4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiTest {
    public static void main(String[] args) {
        //1.Find Second_Highest Number
        List<Integer> list= Arrays.asList(10,45,67,23,89,54,89);
        int secondHighestNumber=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("The Second Highest Number is:"+secondHighestNumber);
        System.out.println();

        //2.Find First Non-Repeated Number
        List<Integer> list1=Arrays.asList(4,5,1,2,0,4,5,2);
        Integer firstNonRepeatedNumber=list1.stream().filter(n->list1.stream().filter(number->number.equals(n)).count()==1).findFirst().orElse(null);
        System.out.println("The First Non-Repeated Number is: "+firstNonRepeatedNumber);
        System.out.println();

        //3.Find Duplicate Numbers
        List<Integer> list2=Arrays.asList(10,20,30,20,40,10,50,30);
        list2.stream().filter(n->list2.stream().filter(number->number.equals(n)).count()>1).distinct().forEach(System.out::println);
        System.out.println();

        //4.Count Frequency of Each Number
        List<Integer> list3=Arrays.asList(1,2,3,2,4,1,5,1);
        Map<Integer,Long> frequency=list3.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        frequency.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
        System.out.println();

        //5.Find Top 3 Highest Numbers
        List<Integer> list4=Arrays.asList(10,80,45,60,30,90,20);
        list4.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        System.out.println();

        //6.Partition Numbers into Even and Odd
        List<Integer> evenorOdd=Arrays.asList(10,15,20,25,30,35,40);
        List<Integer> evenNumbers=evenorOdd.stream().filter(n->n%2==0).toList();
        System.out.println("The even numbers are"+evenNumbers);
        List<Integer> oddNumbers=evenorOdd.stream().filter(n->n%2==1).toList();
        System.out.println("The odd numbers are"+oddNumbers);
        System.out.println();

        //7.Find Numbers Starting With Digit 1
        List<Integer> list5=Arrays.asList(10,15,23,11,45,19,30);
        list5.stream().filter(n->String.valueOf(n).startsWith("1")).forEach(System.out::println);
        System.out.println();

        //8.Find Common Elements Between Two Lists
        List<Integer> list6=Arrays.asList(10,20,30,40,50);
        List<Integer> list7=Arrays.asList(30,40,60,70);
        list6.stream().filter(list7::contains).forEach(System.out::println);
        System.out.println();

        //9.Group Numbers by Even and Odd
        List<Integer> list8=Arrays.asList(5,10,15,20,25,30);
        Map<String,List<Integer>> findEvenorOdd=list8.stream().collect(Collectors.groupingBy(n->(n%2==0) ? "Even":"Odd"));
        System.out.println(findEvenorOdd);
        System.out.println();

        //10.Find Sum of Squares of Even Numbers
        List<Integer> list9=Arrays.asList(1,2,3,4,5,6);
        int sumOfEvenNumners=list9.stream().filter(n->n%2==0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println("Sum of Squares of Even Numbers are:"+sumOfEvenNumners);





    }
}
