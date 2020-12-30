package jp.mlh.day01.test1104;

public class ArrayFanHui {
    public static void main(String[] args) {
        int[] result =calculate(1,2,3);
        System.out.println("总和"+result[0]);
        System.out.println("平均"+result[1]);
    }
    public static  int[] calculate(int a,int b ,int c){//int[]数组方法地址定义
        int sum =a+b+c;
        int avg =sum/3;
        int []array =new int[2];
        array[1]=sum;
        array[2]=avg;
        return array;//返回的是地址
    }
}
