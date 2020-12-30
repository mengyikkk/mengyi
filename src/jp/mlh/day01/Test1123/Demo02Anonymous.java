package jp.mlh.day01.Test1123;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();*/
        //匿名对象的方式
/*        int num = new Scanner(System.in).nextInt();
        Scanner sc = new Scanner(System.in);*/
/*        methodParam(new Scanner(System.in));*/
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是"+num);

    }
    public static  void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是"+i);
    }
    public  static Scanner methodReturn(){
/*        Scanner sc = new Scanner(System.in);
        return sc;*/
        return  new Scanner(System.in);
    }
}
