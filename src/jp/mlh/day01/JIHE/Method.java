package jp.mlh.day01.JIHE;

import java.util.ArrayList;

/*
* 常用方法有哪些
* ArrayList当中的常用方法有:
* 备注:对于ArrayList 集合add 添加一定是成功的 所以返回值可用可不用  返回值代表添加成功
* public boolean add(E e): 向集合 当中添加元素,参数的类型和泛型一致;
* public E get(int index); 从集合当中获取元素,参数是索引编号,返回值就是对应元素的位置
* public E remove(int index):从集合当中删除元素,参数是索引编号,返回值就是被删除掉的元素
* public int size () ;获取集合的尺寸的长度.
*
* */
public class Method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        Boolean success = list.add("计算机但是");
        System.out.println(list);
        System.out.println(success);
        list.add("akasjdh");
        list.add("vkasjdh");
        list.add("ckasjdh");
        list.add("dkasjdh");
        list.add("skasjdh");
        System.out.println(list);
        //获取集合中的元素
        String name= list.get(2);
        System.out.println(name);
        //从集合中删除
        String whoremove = list.remove(3);
        System.out.println(whoremove);
        System.out.println(list);
        //获取集合的长度尺寸
        int size = list.size();
        System.out.println(size);
    }
}
