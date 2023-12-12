package com.hsp.edu.annotation_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 16:09
 * @Description: com.hsp.edu.annotation_
 */
public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{ //父类
    public void fly(){
        System.out.println("Father fly...");
    }
}
class Son extends Father{ //子类
    //解读：
    //1. @Override 注解放在fly方法上，表示子类的fly方法是重写了父类的fly
    //2. 这里如果没有写 @Override 还是重写了父类fly
    //3. 如果写了@Override注解，编译器就会去检查该方法是否真的重写了父类的方法，
    //    如果的确重写了，则编译通过，否则编译错误
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
}