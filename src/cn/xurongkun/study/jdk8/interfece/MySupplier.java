package cn.xurongkun.study.jdk8.interfece;

/**
 * 研究Supplier用
 *
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/13 14:45
 */
@FunctionalInterface
public interface MySupplier<T> {
    T get();
}
