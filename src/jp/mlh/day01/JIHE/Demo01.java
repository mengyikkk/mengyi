package jp.mlh.day01.JIHE;

import java.util.ArrayList;

/*
* 数组的长度不可以发生改变
* 但是Arraylist集合的长度是可以随意变化的.
*对于arraylist来说 有一个尖括号<E>代表泛型
* 泛型:只能是引用类型,不是基本类型
* 注意事项:
* 对于Arraylist集合来说 直接打印得到的不是地址值 而是内容
* 如果内容是空 得到的是空的中括号:[]
* */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个Arraylist 集合,集合的名称是list 里面装的全都是String
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);//[]
        list.add("时间简史");
        System.out.println(list);
        list.add("迪丽热巴") ;
        list.add("啊啊啊啊") ; //泛型是String  那么添加必须是字符串
        System.out.println(list);
    }
}
