package jp.mlh.day01.VariableDiffere;
/*
* 对于基本类型当中的boolean的值,getter方法一定要写成isXxx的形式,而setXxx规则则不变;
*
* */
public class Student {
    private  String name;//姓名
    private  int age;//年龄
    private boolean male;//是不是爷们儿

    public void setMale(boolean b) {
        male = b;
    }

    public String isMale() {
        if(male)return "nanxing" ;
        else return "nv ";
    }

    public  void setName(String str){
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
