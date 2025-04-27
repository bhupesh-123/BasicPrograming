package com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumber=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("even number: "+evenNumber);

        //alt+Enter for returntype
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: "+sum );

        List<String> words = Arrays.asList("java", "stream", "programming");
        List<String> upperCase=words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("In uppercase: "+upperCase);

     //  4. Find the First Element in a List Greater Than 10
        List<Integer> numbers1 = Arrays.asList(5, 8, 12, 19, 3);
        numbers1.stream().filter(num -> num>10).findFirst().ifPresent(System.out::println);

        // Count Elements in a List That Match a Condition  (n>10)
        long count = numbers1.stream().filter(n -> n > 10).count();
        System.out.println("number count greter than 10: "+count);

        // Find Maximum and Minimum Numbers in a List

        numbers1.stream().max(Comparator.comparingInt(Integer::intValue)).ifPresent(System.out::println);
        numbers1.stream().min(Comparator.comparingInt(Integer::intValue)).ifPresent(System.out::println);

       // Sort a List Using Streams
        List<Integer> sortedList=numbers1.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted List: "+sortedList);

        // Given a list of strings, group them by their length.
        List<String> words1 = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        Map<Integer, List<String>> groupByLength = words1.stream().collect(Collectors.groupingBy(String::length));

        // Convert a List of Strings to a Single String (Comma Separated)
        String joiningWord=words.stream().collect(Collectors.joining(" , "));
        System.out.println("joining Word: "+joiningWord);

        //Find the Second-Highest Number in a List
        Integer secondHighest = numbers1.stream().sorted().skip(1).findFirst().get();
        System.out.println("second Highest: "+secondHighest);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> list=listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("list: "+list);

        //  Find the Longest Word in a List
        String longestWord = words.stream().max((s1, s2) -> s1.length() - s2.length()).get();
        System.out.println("longestWord: "+longestWord);

        //15. Find the Frequency of Each Character in a String
        String str="hello world";

        Map<Character, Long> countChar = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Count char: "+countChar);

        // Find Common Elements Between Two Lists
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> commonInt = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("common Int: "+commonInt);

        // Reverse a List Using Streams
        List<Integer> reverseOrder = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverse order: "+reverseOrder);

       //  Find the Average of Numbers in a List
        Double avg = list1.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println("average: "+avg);

        // 20. Find the Most Frequent Element in a List
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Integer mostFrequent = numbers3.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("mostFrequent: "+mostFrequent);

        // Convert a List of Integers to a Map (Square of Each Number as Value)
        Map<Integer, Integer> squreofList = list1.stream().collect(Collectors.toMap(n -> n, n -> n * n));
        System.out.println("squreofList: "+squreofList);

        List<Integer> mergedList= Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
        System.out.println("mergedList: "+mergedList);

        // Find Numbers That Appear More Than Once in a List
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 3, 7);
        List<Integer> moreThanOne = numbers2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(val -> val.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("moreThanOne: "+moreThanOne);

        // 34. Group Words by Their First Letter
        List<String> words2 = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado", "blueberry");
        Map<Character, List<String>> wordGroupByfirstChar = words2.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));
        System.out.println("wordGroupByfirstChar: "+wordGroupByfirstChar);

        // Find the Longest Word in a Sentence
        String sentence = "Java Streams provide powerful functional programming capabilities";
        String maxLength = Arrays.stream(sentence.split(" ")).max((s1, s2) -> s1.length() - s2.length()).get();
        System.out.println("maxLength: "+maxLength);

        // 2nd way
        String maxLength1 = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("maxLength1: "+maxLength1);

        // Find the Character with the Highest Frequency in a String
        String str1 = "successes";
        Character maxOccuranceChar = str1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("maxOccurance: "+maxOccuranceChar);

    }
}
