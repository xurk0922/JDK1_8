package cn.xurongkun.study.jdk8.interfece;

/**
 * 验证Supplier的类
 *
 * @author xu rongkun
 * @version 1.0
 * @date 2019/1/13 14:46
 */
public class SupplierDemo {
    public static void main(String[] args) {
        MySupplier<String> supplier = () -> {
            return "nihao";
        };

        supplier = () -> "hello";

        System.out.println(supplier.get());
    }
}
