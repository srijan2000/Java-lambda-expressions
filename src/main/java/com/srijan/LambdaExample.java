package com.srijan;


interface Shape{
    void draw();// default public abstract

}
//traditional way of writing basically called polymorphism

/*class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method ");
    }
}
class Square implements  Shape{
    @Override
    public void draw() {
        System.out.println("Square class : draw() method");
    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Square Class : draw() method ");
    }
}*/
public class LambdaExample {

    public static void main(String[] args) {

        Shape rectangle = ()->
            System.out.println("Rectangle class : draw() method ");

        Shape square = () -> System.out.println("Square class : draw() method ");
        Shape circle = () -> System.out.println("Circle class : draw() method ");

       // circle.draw();

        //square.draw();

        //rectangle.draw();

        print(rectangle);
        print(square);
        print(circle);

    }
    private static void print(Shape shape){
        shape.draw();
    }

}
