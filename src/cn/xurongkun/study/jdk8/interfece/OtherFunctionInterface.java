package cn.xurongkun.study.jdk8.interfece;

import java.util.function.Predicate;

/**
 * 介绍在jdk1.8中的其他函数接口
 * Predicate<T> 返回boolean
 *
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/13 13:02
 */
public class OtherFunctionInterface {
    public static void main(String[] args) {
        /*
        应用场景：有两个集合需要处理，[1, 2, 3, 5] 找出该集合中的偶数，["a", "ab", "abc", "c"] 找出元素长度是1的
        按照以前的写法会对这两个集合进行遍历，稍微封装一下，将处理的过程封装成两个方法，一个方法判断 element % 2 == 0
        另一个方法判断 element.length == 1
        但是使用了Predicate接口以后，却只要实现一个方法就行了，具体看下面例子
         */


        // Predicate 接口接受一个参数，返回boolean类型，方法具体由自己实现
        Predicate<String> predicate = (s -> s.length() > 1);

        // true
        System.out.println(predicate.test("test"));

        // false
        System.out.println(predicate.negate().test("test"));

        // 并且实现了or、and等一些默认方法以及静态方法，可以配合使用
        Predicate<String> predicate1 = s -> s.length() == 1;

        // false
        System.out.println(predicate1.test("123"));

        // false
        System.out.println(predicate.and(predicate1).test("123"));

        // true
        System.out.println(predicate.or(predicate1).test("123"));


        Integer[] integers = {1, 2, 3, 5};
        String[] strings = {"a", "ab", "abc", "c"};
        Predicate<Integer> filter1 = integer -> integer % 2 == 0;
        Predicate<String> filter2 = s -> s.length() == 1;

        filter(integers, filter1);
        filter(strings, filter2);

    }

    /**
     * 过滤
     * 使用了predicate作为参数，根据具体实现不同，过滤规则也不同
     *
     * @param arrays        要过滤的数据
     * @param predicate 过滤表达式
     * @param <T>       泛型
     */
    private static <T> void filter(T[] arrays, Predicate<T> predicate) {
        for (int i = 0; i < arrays.length; i++) {
            if (predicate.test(arrays[i])) {
                System.out.println(arrays[i]);
            }
        }
    }
}
