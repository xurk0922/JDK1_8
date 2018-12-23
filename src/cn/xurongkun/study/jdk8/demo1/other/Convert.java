package cn.xurongkun.study.jdk8.demo1.other;

@FunctionalInterface
public interface Convert<T, F> {
    T convert(F from);
}
