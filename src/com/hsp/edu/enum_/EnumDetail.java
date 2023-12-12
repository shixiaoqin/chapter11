package com.hsp.edu.enum_;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 15:57
 * @Description: com.hsp.edu.enum_
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSIMUSIC.playing();
    }
}
//1.使用enum关键字后,就不能再继承其他类了,因为enum会隐式继承Enum,而Java是单继承机制
class A{}
//enum Season3 extends A{} ❌
//2.枚举类和普通类一样,可以实现接口,如下形式
interface IPlaying{
    public void playing();
}
enum Music implements IPlaying{
    CLASSIMUSIC;
    public void playing(){
        System.out.println("播放好听的音乐...");
    }
}