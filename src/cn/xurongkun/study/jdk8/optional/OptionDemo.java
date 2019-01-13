package cn.xurongkun.study.jdk8.optional;

import java.util.Optional;

/**
 * Option<T>
 * 主要用法
 * 有效避免非空检验，较少if 判断
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/13 14:04
 */
public class OptionDemo {
    public static void main(String[] args) {
        User user = new User();

        // 把指定的值封装为Optional对象
        System.out.println(Optional.of(user));
        // 如果指定的值为null，则抛出NullPointerException
//        System.out.println(Optional.of(null));

        // 创建一个空的Optional对象
        System.out.println(Optional.empty());

        // 与of相同，将对象封装成Optional对象
        System.out.println(Optional.ofNullable(user));
        // 与of区别，如果是null将返回一个空的Optional对象
        System.out.println(Optional.ofNullable(null));

        // 如果创建的Optional中有值存在，则返回此值，否则抛出NoSuchElementException
        Optional<User> optional = Optional.of(user);
        System.out.println(optional.get());
        optional = Optional.ofNullable(null);
//        System.out.println(optional.get());

        optional = Optional.ofNullable(null);
        user.username = "test";
        // 如果创建的Optional中有值存在，则返回该值，否则返回一个默认值（入参）
        System.out.println(optional.orElse(new User()));
        System.out.println(optional.orElse(null));

        // 如果创建的Optional中有值存在，则返回此值，否则返回一个由Supplier接口生成的值
        System.out.println(optional.orElseGet(() -> new User()));

        // 如果创建的Optional中有值存在，则返回此值，否则抛出一个由指定的Supplier接口生成的异常
//        System.out.println(optional.orElseThrow(() -> new NullPointerException()));

        optional = Optional.of(user);
        user.username = "xu";
        // 如果创建的Optional中的值满足filter中的条件，则返回包含该值的Optional对象，否则返回一个空的Optional对象
        System.out.println(optional.filter((u -> u.username != null)));

        // 如果创建的Optional中的值存在，对该值执行提供的Function函数调用
        System.out.println(optional.map(u -> u.username.replace("x", "xixixi")));
        // 如果创建的Optional中的值存在，就对该值执行提供的Function函数调用，返回一个Optional类型的值，否则就返回一个空的Optional对象
        System.out.println(optional.flatMap(u -> Optional.of(new User())));


        optional = Optional.ofNullable(null);
        // 如果创建的Optional中的值存在，返回true，否则返回false
        System.out.println(optional.isPresent());

        optional = Optional.of(user);
        user.username = "x";
        // 如果创建的Optional中的值存在，则执行该方法的调用，否则什么也不做
        optional.ifPresent(s -> System.out.println(s.username));


    }
}
