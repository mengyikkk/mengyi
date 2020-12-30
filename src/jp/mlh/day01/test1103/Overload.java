package jp.mlh.day01.test1103;

public class Overload {
    public static void main(String[] args) {
/*        System.out.println(sumTwo(10,20));
        System.out.println(sumThree(10,20,30));
        System.out.println(sumFour(10,20,30,40));*/
        System.out.println(sum(10,02));
    }
    /*
    *Overload/方法重载  :方法名称一样 但是参数列表不一样
    * 方法重载与下列因素相关:
    *参数个数不同
    * 参数类型不同
    * 参数多类型顺序不同
    * */
    public static  int sum(int a,int b){
            return a+b;
    }
    public static  int sum(int a,int b,int c){
        return a+b+c;
    }
    public static  int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

}
