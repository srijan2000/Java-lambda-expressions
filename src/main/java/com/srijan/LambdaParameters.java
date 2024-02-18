package com.srijan;

interface Addable{
    int addition(int a, int b);
}
/*class AddableImpl implements Addable{
    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}*/
public class LambdaParameters {

    public static void main(String[] args) {
   /*     Addable addition = ( a, b )->(a+b);
        System.out.println(addition.addition(10, 20));*/
        Addable abc = (a,b) -> {
            int c = a+b;
            return c;
        };
        System.out.println(abc.addition(10,30));
    }
}
