package com.hsp.edu.annotation_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 19:01
 * @Description: com.hsp.edu.annotation_
 */
public class Car {
    double price = 10;
    static String color = "white";

    @Override
    public String toString() {
        return  price + "\t" + color;
    }

    public Car(double price) {
        this.price = price;
    }
    public Car() {
        this.price = 9;
        this.color = "red";
    }
}
