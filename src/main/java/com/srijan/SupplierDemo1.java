package com.srijan;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";

        System.out.println(supplier.get());
    }
}
