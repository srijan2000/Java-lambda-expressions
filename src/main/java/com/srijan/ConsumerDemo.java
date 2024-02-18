package com.srijan;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> con = ( a )-> System.out.println(a);
        con.accept(6);
    }
}
