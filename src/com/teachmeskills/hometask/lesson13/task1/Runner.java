package com.teachmeskills.hometask.lesson13.task1;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        System.out.println("Initial numbers: " + numbers);
        System.out.println("Unique numbers from 7 to 17: " +
                numbers.stream().distinct().filter(n -> n > 7 && n < 17).toList());
        System.out.println("First 4 unique sorted multiplied by 2 numbers: " +
                numbers.stream().distinct().map(n -> n * 2).sorted().limit(4).toList());
        System.out.println("Member's count: " + numbers.stream().distinct().count());
        System.out.println("Average value: " + numbers.stream().mapToInt(Integer::intValue).average().orElse(0));
    }
}
