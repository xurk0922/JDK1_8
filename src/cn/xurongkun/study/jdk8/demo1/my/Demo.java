package cn.xurongkun.study.jdk8.demo1.my;

import java.util.Arrays;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/21
 */
public class Demo {
    public static void main(String[] args) {
        Person[] personArr = {new Person(5), new Person(1), new Person(3), new Person(9)};
        System.out.println("未排序前：" + Arrays.asList(personArr));

        /* 使用Lambda表达式实现比较方法，自己实现具体方法
        Arrays.sort(personArr, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });
        */

        /* 使用Lambda表达式实现比较方法，调用一个已经存在的方法
        Arrays.sort(personArr, (Person a, Person b) -> {
            return Person.comapreAge(a, b);
        });
        */

        // 使用方法引用代码更加清晰
        Arrays.sort(personArr, Person::comapreAge);

        System.out.println("未排序后：" + Arrays.asList(personArr));
    }
}
