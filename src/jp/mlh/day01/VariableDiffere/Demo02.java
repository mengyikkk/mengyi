package jp.mlh.day01.VariableDiffere;

/*
 * 面向对象三大特征:封装 继承 多态
 * 1. 方法就是一种封装
 * 2.关键字private 也是一种封装
 * 封装就是将一些细节信息隐藏起来,对于外界不可见
 * */
public class Demo02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max =getMax(array);
        System.out.println(max);
    }
    public  static  int getMax(int[] array){
        int max = array[0];
        for (int i=0;i< array.length;i++){
            if (array[i]>max)max=array[i];
        }

       return max;
    }

}

