package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collectionstest {
    public static void main(String[] args) {
//        List<String> nameofcities = new ArrayList<>();
//        nameofcities.add("London");
//        nameofcities.add("Brussels");
//        nameofcities.add("Tokio");
//        nameofcities.add("New york");
//
//        for (int i = 0; i < nameofcities.size(); i++) {
//            System.out.println(nameofcities.get(i));
//        }
//
//        for (String city: nameofcities) {
//            System.out.println(city);
//        }

//        Set<Integer> setofnums = new TreeSet<>();
//        setofnums.add(3);
//        setofnums.add(7);
//        setofnums.add(9);
//        setofnums.add(5);
//
//        for (int num: setofnums) {
//            System.out.println(num);
//        }

//        Map<String, Integer> mapofbooks = new HashMap<>();
//        mapofbooks.put("a", 1);
//        mapofbooks.put("b", 2);
//        mapofbooks.put("c", 4);
//        mapofbooks.put("d", 5);
//        mapofbooks.put("e", 10);
//
//        for (Map.Entry<String, Integer> entry: mapofbooks.entrySet()) {
//            System.out.println("Current key is: "+ entry.getValue());
//        }

//        String str = "apple";
//
//        Map<Character, Integer> freq = str.chars().mapToObj(c -> (char)c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
//
//        System.out.println(freq);

        String a = "a#pp@ele";

        for (int i = 0; i < a.length(); i++) {
            if(!Character.isAlphabetic(a.charAt(i))){
                System.out.println(a.charAt(i));
            }
        }







    }
}
