package streambasic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BasicesProgram {
    public static void main(String[] args) {
        List<String> list=List.of("Bhupesh","Kumar","Vishwakarma");
        List<Integer> nums = List.of(1,2,2,3,3,4);

        List<String> listUpperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(listUpperCase);
        list.stream().filter(n->n.startsWith("B")).collect(Collectors.toList()).forEach(System.out::println);

        int compare= nums.stream().min(Integer::compare).get();
        System.out.println("compare: "+compare);

        int comparing=nums.stream().min(Comparator.comparing(Integer::intValue)).orElseThrow();
        System.out.println("comparing: "+comparing);

        // 2nd highest
        List<Integer> numbers = List.of(10,25,35,15,40,5);
        int secondHighest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondHighest: "+secondHighest);

        System.out.println("Total number: "+numbers.stream().sorted().distinct().count());
        System.out.println("Total number: "+nums.stream().sorted().distinct().count());


        //  5,10,15,25,35,40
        int secondWayHighest = numbers.stream().distinct().sorted().skip(numbers.stream().distinct().count()-2).findFirst().get();
        System.out.println("secondWayHighest: "+secondWayHighest);

        int secondLowest=numbers.stream().distinct().sorted().skip(1).findFirst().get();
        System.out.println("secondLowest: "+secondLowest);

        // max number
        int higestNumber=numbers.stream().max(Integer::compare).get();
        int lowestNumber=numbers.stream().min(Integer::compare).get();
        int lowestNumber2=numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("highest number: "+higestNumber+" lowestNumber: "+lowestNumber);

        // Longest string
        String maxLengthString= list.stream().max(Comparator.comparing(String::length)).get();
         String minLengthString=list.stream().min(Comparator.comparing(String::length)).get();
        System.out.println("maxLengthString: "+maxLengthString+" minLengthString: "+minLengthString);

    }
}
