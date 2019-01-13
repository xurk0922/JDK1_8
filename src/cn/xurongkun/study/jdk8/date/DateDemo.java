package cn.xurongkun.study.jdk8.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * jdk1.8中的时间表达式
 *
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/13 15:36
 */
public class DateDemo {
    public static void main(String[] args) {
        //现在的日期
        LocalDate today = LocalDate.now();

        //今天之后的一天的日期
        LocalDate tomorrow = today.plusDays(1);

        //设定时间
        LocalTime time = LocalTime.of(10, 10, 10, 358);

        //时间
        LocalTime now = LocalTime.now();

        //日期+时间
        LocalDateTime atDate = now.atDate(today);

        //当前日期和时间
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(Instant.now());
    }
}