package jp.mlh.day01.Test1119;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu= new Student();
        Student stu1=new Student("ZHAO",30);
        System.out.println("xm"+stu1.getName()+"nl"+stu1.getAge());
        //如果需要改变对象当中的成员变量的数据内容,仍然还需要使用setXxx的方法
        stu1.setAge(11);
        System.out.println("xm"+stu1.getName()+"nl"+stu1.getAge());
    }
}
