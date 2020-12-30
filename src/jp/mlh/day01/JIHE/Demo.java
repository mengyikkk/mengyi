package jp.mlh.day01.JIHE;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        Student one = new Student("CHENG ",100);
        Student two = new Student("CHENG1 ",101);
        Student three = new Student("CHENG2 ",1002);
        Student four = new Student("CHENG 3",1003);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+stu.getAge());
        }
    }
}
