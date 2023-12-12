package com.hsp.edu.enum_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 15:20
 * @Description: com.hsp.edu.enum_
 * 演示Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2 枚举类，来演示各种方法
        Season2 autumn = Season2.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal() 输出的是该枚举对象的次序/编号，从0开始编号
        //AUTUMN 枚举对象是第三个，因此输出 2
        System.out.println(autumn.ordinal());
        //从反编译可以看出 values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        for(Season2 season : values){
            System.out.println(season);
        }
        //valueOf : 将字符串转换成枚举对象.要求字符串必须为已有的常量名,否则报异常
        //执行流程
        //1. 根据你输入的 "AUTUMN" 到 Season2的枚举对象去查找
        //2. 如果找到了，就返回，如果没有找到，就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        System.out.println(autumn1 == autumn);
        //compareTo : 比较两个枚举常量,比较的就是位置号!
        //就是把 Season2.AUTUMN 枚举对象的编号 和 Season2.SUMMER 枚举对象的编号比较
        /*
        *  public final int compareTo(E o) {
            return self.ordinal - other.ordinal;
            Season2.AUTUMN的编号[2] - Season2.SUMMER的编号[3]
    }
        * */
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

    }
}
