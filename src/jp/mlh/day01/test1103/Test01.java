package jp.mlh.day01.test1103;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(isSanme(10,10));//true
        System.out.println(isSanme(10,20));//false
    }
/*
* s三要素:
* 返回值类型:boolean
* 方法名称:issame
* 参数列表: int a, int b
* */
    public  static  boolean isSanme(int a,int b){
/*        boolean same;
        if(a == b) same=true;
        else same = false;
        return  same;*/
/*        2
        boolean same = a == b;
        return same;*/
        return  a == b ;

    }
}
