package cn.xurongkun.study.jdk8.demo1.other;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/21
 */
public class Demo {
    public static void main(String[] args) {
        Convert<String, String> convert = Something::startWith;

        System.out.println(convert.convert("hello"));

        Something something = new Something();

        convert = something::endWith;
        System.out.println(convert.convert("hello"));

        Convert<Something, String> convert1 = Something::new;
        convert1.convert("111");
    }
}
