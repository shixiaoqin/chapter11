package com.hsp.edu.annotation_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 19:03
 * @Description: com.hsp.edu.annotation_
 */
public class Homework01 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(100);
        System.out.println(c); // 9,red
        System.out.println(c1); //100 red
    }
}
