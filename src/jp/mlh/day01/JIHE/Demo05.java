package jp.mlh.day01.JIHE;

import java.util.ArrayList;

/*
* 如果希望向集合ArrayList当中存储基本类型数据 ,必须使用基本类型对应的包装类
* 基本类型    包装类
*
* byte          Byte
* short        Short
* int          Integer    [特殊]
* long          Long
* float         Float
* double        Double
* char          Character [特殊]
* boolean       Boolean
*
*自动装箱: 基本类型-->包装类型
* 自动拆箱:包装类型-->基本类型
*
* */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<Integer> listB= new ArrayList<>();
        listB.add(10);
        listB.add(20);
        System.out.println(listB);
        int num = listB.get(1);
        int num1 = listB.get(0);
        System.out.println(num+num1);
    }
}
