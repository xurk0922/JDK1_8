package cn.xurongkun.study.jdk8.interfece;

/**
 * 函数式接口的demo
 * 主要学习lambda表达式以及方法引用
 * 观察main方法中的3中写法，可以发现一种比一种简洁易读、易懂，这个就是lambda的好处
 *
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/12 21:57
 */
public class FuncationInterfaceDemo {
    public static void main(String[] args) {
        String s = "456";


        // 在jdk1.8之前，使用匿名内部类需要实现该接口
        Converter<Integer, String> converter1 = new Converter<Integer, String>() {
            @Override
            public Integer converter(String s) {
                return Integer.valueOf(s);
            }
        };
        System.out.println(converter1.converter(s));


        // jdk1.8及之后可以通过lambda表达式完成
        Converter<Integer, String> converter2 = (str) -> {
            return Integer.valueOf(str);
        };
        System.out.println(converter2.converter(s));

        // 同时，在jdk1.8之后，如果lambda表达式中的内容是一个现成的方法，那么还可以对它进行简化，也就是方法引用
        Converter<Integer, String> converter3 = Integer::valueOf;
        System.out.println(converter3.converter(s));




    }
}
