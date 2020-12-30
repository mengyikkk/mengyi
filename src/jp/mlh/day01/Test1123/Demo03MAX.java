package jp.mlh.day01.Test1123;

import java.util.Scanner;

/*
* 键盘输入三个数字,然后求出其中的最大值
* */
public class Demo03MAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<b)a=b;
        if (a<c)a=c;
        System.out.println(a);
        int temp = a>b ? a:b;
        int max = temp >c ? temp: c;
        System.out.println("最大值是: "+max);
    }
}
