package jp.mlh.day01.test1104;

public class ShuZuDemo2 {
    public static void main(String[] args) {
        int[] array = new int[30];
        System.out.println(array);//地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("====================");//0
        array[1]=10;
        array[2]=30;
        System.out.println(array);//地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//10
        System.out.println(array[2]);//30
    }
}
