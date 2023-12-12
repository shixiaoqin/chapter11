package com.hsp.edu.annotation_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 19:30
 * @Description: com.hsp.edu.annotation_
 */
public class Homework04 {
    public static void main(String[] args) {

    }
}
interface Calculator{
    public double  work(double n1,double n2);
}
class CellPhone {

   public void testWork(Calculator calculator,double n1,double n2){
       double result = calculator.work(n1, n2);
       System.out.println("计算后的结果=" + result);


   }
}