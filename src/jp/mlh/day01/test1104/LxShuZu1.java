package jp.mlh.day01.test1104;

public class LxShuZu1 {
    public static void main(String[] args) {
        //如果是整数类型,那么默认为0;
        /*
        * 如果是浮点类型那么默认为0.0;
        * 如果是字符类型,那么默认为'\u0000'
        * 如果是布尔类型,那么默认为false;
        * 如果是引用类型是null;//String
        * */
        int []array=new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
