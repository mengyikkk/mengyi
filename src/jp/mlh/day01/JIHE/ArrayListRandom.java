package jp.mlh.day01.JIHE;

import java.util.ArrayList;
import java.util.Random;

/*
* random 生成六个 1-33的随机整数
*
* */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Random num = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(num.nextInt(32)+1);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
