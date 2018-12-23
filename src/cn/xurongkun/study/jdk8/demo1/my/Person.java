package cn.xurongkun.study.jdk8.demo1.my;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/21
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int comapreAge(Person a, Person b) {
        return a.getAge() - b.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
