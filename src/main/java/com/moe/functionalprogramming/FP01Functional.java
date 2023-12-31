package com.moe.functionalprogramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printAllNumbersInListFunctional(numbers);
//        printEvenNumbersInListFunctional(numbers);
//        printOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

//        printAllCourses(courses);
//        printSpringCourses(courses);
//        printCoursesLongerThanFour(courses);
        printLengthOfCourses(courses);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    private static void printSquareEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream().filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printLengthOfCourses(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    private static void printCoursesLongerThanFour(List<String> courses) {
        courses.stream().filter(course -> course.length() > 3).forEach(System.out::println);
    }
}
