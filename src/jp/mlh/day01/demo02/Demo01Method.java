package jp.mlh.day01.demo02;

/*
 * 复习方法
 * 定义格式:
 * 方法定义先后顺序无所谓
 *  方法定义必须是挨着的
 * 不能在一个方法内部定义另外一个方法
 * */
public class Demo01Method {
    public static void main(String[] args) {

        printmethod();
    }

    public static void printmethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 1; i < 20; i++) {
                System.out.print("aaa");
            }
            System.out.println();
        }
    }
}
