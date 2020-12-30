package jp.mlh.day01.Test1124;

import java.util.Random;

/*
* 随机数
* Random类用来生成随机数字, 使用起来也是三个步骤
* 1.
* 导包
* import java.util.Random;
* 2.创建
* Random r = new Random(); //小括号当中留空即可
* 3.使用
* 获取一个随机的int 数字(范围是int 所有范围 ,有正负两种); int num =r.nextInt();
*获取一个随机的int数字 (参数代表了范围,左闭右开区间); int num =r.next(3);
* 实际上代表的含义(0-2);
* */
public class Demo01 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);//范围实际上是0-9;
            System.out.println("随及数字" + num);
        }
    }
}
