package com.hsp.edu.enum_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 13:13
 * @Description: com.hsp.edu.enum_
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
    }
}
//演示使用enum关键字来实现枚举类
enum Season2 {
    //使用enum来实现枚举类
    //1.使用关键enum 替代 class
    //2.public static final Season SPRING = new Season("春天","温暖"); 直接使用
    // SPRING("春天","温暖"); 解读 常量名(实参列表)
    //3.如果有多个常量(对象)。使用 , 号间隔即可
    //4.如果使用enum 来实现枚举，要求将定义常量对象，写在前面
    //5.如果使用的是无参构造器,创建常量对象，则可以省略()
    SPRING("春天","温暖"),WINTER("冬天","寒冷"),
    AUTUMN("秋天","凉爽"),SUMMER("夏天","炎热");
    private String name;
    private String desc;

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    //无参构造器
    Season2() {
    }

    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}