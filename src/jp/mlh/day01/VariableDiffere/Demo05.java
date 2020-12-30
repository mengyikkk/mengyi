package jp.mlh.day01.VariableDiffere;
//定义一个标准类
//alt +insert  用shift全选
public class Demo05 {
    private String name;//姓名

    private int age;//年龄

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//this 是成员变量
    }

    public int getAge() {
        return age;
    }

    public Demo05() {
    }

    public Demo05(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
