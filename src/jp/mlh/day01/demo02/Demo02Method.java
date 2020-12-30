package jp.mlh.day01.demo02;
/** 方法其实就是若干语句的功能集合
* 方法好比是一个工厂
* 方法名必须是小驼峰;//
* */
public class Demo02Method {
    public static void main(String[] args) {
        int a,b;
        int num=sumAd(10,100);
        System.out.println(num);
    }
    public static  int sumAd(int a,int b){
        int result;
        result=a+b;
        return result;
    }
}
