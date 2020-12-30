package jp.mlh.day01.VariableDiffere;
/*
* 局部变量和成员变量
*
* 1. 定义的位置不一样[重点]
*局部变量:在方法的内部
* 成员变量: 在方法的外部,直接写在类当中
* 2.作用范围不一样[重点]
* 局部变量: 只有方法当中才可以使用,出了方法就不能再用
*成员变量:整个类全都可以通用
* 3.默认值不一样[重点]
* 局部变量:没有默认值,如果要想使用,必须手动进行赋值
* 成员变量: 如果没有赋值,会有默认值,规则和数组一样
*
*
* */
public class Demo01VariableDifference {
        String name;
        //成员变量
        public  void methodA(){
            int num = 20;//局部变量
            System.out.println(num);
            System.out.println(name);
        }
}
