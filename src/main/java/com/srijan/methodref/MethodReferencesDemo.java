package com.srijan.methodref;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class MethodReferencesDemo {

    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b){
        return (a+b);
    }
    public static void main(String[] args) {
        //Using Method reference for static methodm
        Function<Integer, Double> function = Math::sqrt;
        System.out.println(function.apply(4));

        // Using Method reference for static methodm
        BiFunction<Integer, Integer, Integer> biFunction = MethodReferencesDemo::addition;
        System.out.println(biFunction.apply(10,20));

        //2. Method reference to an instance method of an object

        MethodReferencesDemo md = new MethodReferencesDemo();

        //lambda expression
        Printable printable = msg -> md.display(msg);
        printable.print("hello world");
        // method reference to instance method
        Printable printable1 = md::display;
        printable1.print("srijan");

        Function<String, String> stringFunction = String::toLowerCase;
        System.out.println(stringFunction.apply("JAVA GUIDES"));

        String[] strArray = { "A", "E", "I", "O", "U", "a", "e","i","o","u"};
        Arrays.sort(strArray, String::compareToIgnoreCase);

        // reference to a constructor

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("watermelon");

        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));


    }
}
