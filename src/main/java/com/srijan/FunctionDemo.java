package com.srijan;

import java.util.function.Function;



/*class FunctionImpl implements Function<String, Integer>{
    public Integer apply(String s){
        return s.length();
    }
}*/

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = (String s)-> s.length();

        System.out.println(function.apply("ramesh"));

    }
}
