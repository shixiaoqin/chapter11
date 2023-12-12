package com.hsp.edu.annotation_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 19:16
 * @Description: com.hsp.edu.annotation_
 */
public class TestFrog {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}
