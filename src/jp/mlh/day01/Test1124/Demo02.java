package jp.mlh.day01.Test1124;

import java.util.Random;

/*
*题目的要求:
* 根据int 变量n的值 来获取随机数字,范围是[1,n], 可以获取到1也可以到n.
* 思路:
* 1.定义一个int变量n, 随意赋值
* 2.要使用Randaom:三个步骤导包 创建, 使用
* 3,如果写10 那么就是0-9 然而想要的还是1-10,可以发现:整体+1即可.
* 4,打印随机数字
*
*
* */
public class Demo02 {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        int result = r.nextInt(n)+1;
        //本来范围是[0,n),整体+1之后变成了[1,n+1)
        System.out.println(result);
    }
}
