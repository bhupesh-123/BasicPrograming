package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunEmp {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
                new Emp(101, "John", 60000, List.of("Java", "Spring", "SQL")),
                new Emp(102, "Alice", 45000, List.of("HTML", "CSS", "JavaScript")),
                new Emp(103, "Bob", 70000, List.of("Java", "Microservices", "AWS"))
        );

        List<String> langList = employees.stream().filter(e -> e.getSalary() > 5000).map(l -> l.getSkills()).flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(langList);

        List<String> sentences = List.of("Java is great", "Streams are powerful");
        List<String> sentenceBreak = sentences.stream().flatMap(w -> Arrays.stream(w.split(" "))).collect(Collectors.toList());
        System.out.println("sentence Break"+sentenceBreak);

    }
}
