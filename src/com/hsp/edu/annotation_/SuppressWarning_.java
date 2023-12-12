package com.hsp.edu.annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 石晓琴
 * @date 2023/12/8 - 12 - 08 - 16:31
 * @Description: com.hsp.edu.annotation_
 */
@SuppressWarnings({"rawtypes","unchecked","unused"})
public class SuppressWarning_ {
    //解读：
    //1. 当我们不希望看到这些警告的时候，可以使用 SuppressWarnings 注解来抑制警告信息
    //2. 在{""}中，可以写入你希望抑制(不显示)的警告信息
    //3. 可以指定的警告类型有很多，可以后续查阅
    //4. 关于@SuppressWarning 作用范围是和你放置的位置相关
    // 比如 @SuppressWarning 放置在 main方法,那么抑制警告的范围就是 main方法中
    // 通常我们可以放在具体的语句，方法，类
    //5. 看看 @SuppressWarnings 源码
    /*(1)放置的位置就是 TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
    （2)该注解类有数组 String[] values 设置一个数组比如 {"rawtypes","unchecked","unused"}
    * @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
        public @interface SuppressWarnings {
            String[] value();
}
     */
    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }
    @SuppressWarnings({"rawtypes",})
    public void f1(){
        @SuppressWarnings("rawtypes")
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        @SuppressWarnings({"unchecked","unused"})
        int i;
        System.out.println(list.get(1));
    }
}
