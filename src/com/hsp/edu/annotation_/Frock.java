package com.hsp.edu.annotation_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 19:13
 * @Description: com.hsp.edu.annotation_
 */
public class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }
    public Frock() {
        serialNumber = getNextNum();
    }
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
}
