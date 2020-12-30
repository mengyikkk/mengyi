package jp.mlh.day01.Test1124.demo01;

public class Demo04 {
    public static void main(String[] args) {
        Person[] array =new Person[3];
        Person one = new Person("SKSK",10);
        Person two = new Person("SKSK",10);
        Person three = new Person("C",10);
        array [0]=one;
        array [0]=two;
        array [0]=three;
        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
        //数组有一个缺点一旦创建 ,程序运行期间长度不可以改变.
    }


}
