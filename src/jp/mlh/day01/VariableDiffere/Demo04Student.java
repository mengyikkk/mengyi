package jp.mlh.day01.VariableDiffere;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu =new Student();
        stu.setName("lu");
        stu.setAge(20);
        stu.setMale(true);
        System.out.println("xm"+stu.getName());
        System.out.println("nl"+stu.getAge());
        System.out.println("xb"+stu.isMale());
    }
}
