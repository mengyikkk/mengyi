package jp.mlh.day01.test1104;
/*
* 数组的名称.length 获取数组长度
* */
public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayB={1,2,3,4,5,7,8,9,10,6};
        int len =arrayB.length;
        System.out.println(len);
        for (int i=0;i<arrayB.length;i++) {
            System.out.println(arrayB[i]);
        }
    }

}
