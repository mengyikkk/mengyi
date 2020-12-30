package jp.mlh.day01.JIHE;

import java.util.ArrayList;

public class Demo04Each {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i =0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //list.fori 自动生成

    }
}
