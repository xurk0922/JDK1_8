package cn.xurongkun.study.jdk8.demo1.other;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/21
 */
public class Something {
    public Something() {
    }

    public Something(String sm) {
        System.out.println(sm);
    }

    public static String startWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    public String endWith(String s) {
        return String.valueOf(s.charAt(s.length() - 1));
    }

    public void endWith() {

    }
}
