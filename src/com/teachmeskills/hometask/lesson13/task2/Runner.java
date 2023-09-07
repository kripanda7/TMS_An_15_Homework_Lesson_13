package com.teachmeskills.hometask.lesson13.task2;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("Dmitry");
        members.add("Gleb");
        members.add("Andrew");
        members.add("Vladislav");
        members.add("Alexey");
        members.add("Dovlet");
        members.add("Andrew");
        members.add("Roman");
        members.add("Alexander");
        members.add("Tatyana");

        System.out.println("Members: " + members);
        System.out.println("Member's names witch starts with A: " +
                members.stream().filter(m -> m.toLowerCase().startsWith("a")).toList());
        System.out.println("First alphabetically: " + members.stream().sorted().findFirst().orElse(""));
    }
}
