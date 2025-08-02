package com.java8;

import java.util.Optional;

public class Nullable {
    public static void main(String[] args) {
        String name = "bhupesh";
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.isPresent()); // true
        optionalName.ifPresent(n-> System.out.println(n));

        String value=null;
        String result = Optional.ofNullable(value)
                .orElseThrow(() -> new IllegalArgumentException("Name can't be null"));
    }
}
