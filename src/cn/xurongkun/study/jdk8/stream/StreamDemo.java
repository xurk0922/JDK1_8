package cn.xurongkun.study.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 流，jdk1.8中非常重要的新特性
 * Stream类似于流，单向，不可往复。可以对集合的所有元素进行筛选，过滤，修改等，但是只能对数据遍历一次，如果需要第二次操作，必须继续创建Stream流。
 * Stream操作分为三个步骤：创建Stream--》中间操作--》最终操作。
 *
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/13 15:14
 */
public class StreamDemo {
    public static void main(String[] args) {
        //直接使用静态方法，获取指定值的顺序排序流
        Stream<String> stream1 = Stream.of("aa", "bb", "cc");

        String[] strArray = {"a", "b", "c"};
        //使用的Arrays类的stream方法
        Stream<String> stream2 = Arrays.stream(strArray);

        List<String> list = Arrays.asList(strArray);
        //直接使用集合获取流
        Stream<String> stream3 = list.stream();

        // 对数据进行遍历
        stream1.forEach(s -> System.out.println(s));
        // 流只能使用一次，如果要再次使用，只能再建流
        stream1 = Stream.of("aa", "bb", "cc");
        stream1.forEach(System.out::println);

        // 对数据进行过滤
        System.out.println("------------------------------------------------");
        stream1 = Stream.of("aa", "bb", "cc");
        stream1.filter(s -> s.startsWith("a")).forEach(System.out::println);

        // 对数据进行排序
        System.out.println("------------------------------------------------");
        stream1 = Stream.of("cc", "bb", "aa");
        stream1.sorted().forEach(System.out::println);


        // 对每个元素进行操作
        System.out.println("------------------------------------------------");
        stream1 = Stream.of("cc", "bb", "aa");
        stream1.map(s -> s.toUpperCase()).forEach(System.out::println);

        // 统计，放在流操作的最后面，当使用count之后，流消失
        System.out.println("------------------------------------------------");
        stream1 = Stream.of("cc", "bb", "aa");
        System.out.println(stream1.filter(s -> s.startsWith("a")).count());

        System.out.println("------------------------------------------------");
        stream1 = Stream.of("cc", "bb", "aa");
        stream1.reduce((s1, s2) -> s1 + "-" + s2).ifPresent(System.out::println);

        // 即进行串行操作，单线程。时间长
        list.stream();

        // 并行操作，多线程同时进行。需要时间短
        list.parallelStream();

    }
}
