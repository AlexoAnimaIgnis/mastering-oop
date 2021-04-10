package oop.basic;

/**
 * allows us to create
 * specific human objects
 */
public class Human {
    String name;
    int age;
    int height;
    String eyeColor;

    /*
    constructor
     */
    public Human() {

    }

    public void speak() {
        System.out.println("Hello I am " + name);
        System.out.println("I am " + age + " yrs old.");
        System.out.println("I am " + height + " inches tall.");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat() {
        System.out.println("I am eating....");
    }

    public void walking() {
        System.out.println("I am walking.....");
    }
}
