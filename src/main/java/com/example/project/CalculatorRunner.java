package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class

        //2. call any methods of that class to test
        Calculator calc = new Calculator("calc stands for calculator by the way");
        System.out.println(calc.performOperation("*", 2, 3));
        System.out.println(calc.divisibleBy(5, 2));
        System.out.println(calc.coordinatePair(0, 1864));
        System.out.println(calc.absoluteValue(5, 10));
        System.out.println(calc.average(10, 5));
    }
}
