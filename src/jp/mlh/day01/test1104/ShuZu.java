package jp.mlh.day01.test1104;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

public class ShuZu {
/*
* 数组是一种容器 可以同时存放多个数据
* 数组当中的多个数据  他们的类型必须统一
* 数组的长度在程序运行期间不可以改变
*
* 数组的初始化:在内存中创建一个数组,并向其中赋予一些默认值.
* 两种常见初始化
* 动态初始化(长度) 不确定内容放动态
* 静态初始化(指定内容) 确定内容静态数组
* 动态初始化数组的格式"
* 数据类型[] 数组名称 =new 数据类型[数组长度]
* */
    public static void main(String[] args) {
/*        int score = 13;
        int score1 = 23;
        int score2 = 33;
        System.out.println(score2);
        score2 = 100;
        System.out.println(score2);*/
        //创建一个数组
          int[]arrayA=new int[300];
          char[]arrayB=new char[300];
          double[]arrayC=new double[300];
          String[]arrayD=new String[300];
//          静态初始化基本格式://虽然静态初始化没有直接钙素长度 但是根据大括号里面的具体内容 也可以直接推算出长度
//          数据类型[]数组名称 = new 数据类型[]{元素1,元素2,....}
        int[]arrayE =new int[]{1,2,3,4};
        String[]arrayF =new String[]{"hello","world","java"};
/*
* 使用静态初始化数组的时候 格式还可以省略一下.
*1.静态初始化没有直接指定长度,但是仍然会自动推算出长度
* 2.静态初始化标准格式可以拆分成为两个步骤.
* */        //省略格式的静态初始化 不可以拆分为两个步骤
        int[] arrayX={10,20,30,40,50};
            //静态初始化的标准格式
        int[]arrayH;
        arrayH =new int[]{1,2,3,45,5};
        //
    }



}
