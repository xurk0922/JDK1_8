package cn.xurongkun.study.jdk8.interfece;

/**
 * 方法接口
 * jdk1.8中引入了lambda表达式、方法引用，都涉及到了方法接口
 * 都是为了函数式编程服务
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/12 22:01
 */
@FunctionalInterface
public interface Converter<F, T> {
    /**
     * 将某个类型的参数转成另一个类型
     * @param t 要转换的对象
     * @return 转换后的结果
     */
    F converter(T t);
}
