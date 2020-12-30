package jp.mlh.day01.Test1123;

import jp.mlh.day01.VariableDiffere.Person;

/*
* 创建对象的标准格式
* 类名称 对象名 - new 类名称();
*匿名对象就是只有右边的对象 没有左边的名字和赋值运算符.
*
* 匿名对象只能使用唯一一次 ,下次再用不得不在创建一个新对象.
* 使用建议:如果确定有一个对象只需要使用唯一的一次, 就可以用匿名的对象.
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        new Person().name="是件好事就";
    }
}
