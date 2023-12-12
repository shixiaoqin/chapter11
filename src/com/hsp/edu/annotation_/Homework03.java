package com.hsp.edu.annotation_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 19:24
 * @Description: com.hsp.edu.annotation_
 */
public class Homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    public abstract void shout();
}
class Cat extends Animal{
    public void shout(){
        System.out.println("猫会喵喵叫...");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫...");
    }
}