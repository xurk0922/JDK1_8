package cn.xurongkun.study.jdk8.interfece;

/**
 * 一个函数接口
 * JDK1.8对接口增加的新特性：可以存在以static或者default修饰的非静态方法
 * 这么做的好处有：
 * 1.减少了代码量；比如：当一个接口有多个实现类时，提取公共方法到接口中，不用再编写公共类给实现类继承了。
 * 2.对既有的类进行功能扩展， 且不必对这些类重新进行设计。 比如， 只需在Collection接口中
 * 增加default Stream stream(), 相应的Set和List接口以及它们的子类都包含此的方法， 不必为每个子类都重新copy这个方法。
 *
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/12 22:05
 */
public interface UserService {
    /**
     * 在jdk1.8之前，接口中只能存在抽象方法
     */
    void fun1();

    /**
     * jdk1.8之后可以存在以static修饰的非抽象方法，实现了该接口的实现类对象都可以调用次方法
     */
    static void fun2() {
        // dosomething
    }

    /**
     * jdk1.8之后可以存在以关键字default修饰的非抽象方法，实现了该接口的实现类对象都可以调用次方法
     */
    default void fun3() {
        // dosomething
    }
}
