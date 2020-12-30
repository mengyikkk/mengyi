package jp.mlh.day01.test1104;

public class LxShuZu {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10, 20, 30};
        System.out.println(array);
        //array对应的内存地址[I@1540e19d
//        访问数组元素的格式:数组名称[索引值]
//        索引值:就是一个int数字,代表数组当中元素的编号. 下标
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        int num;
        num = array[1];
        System.out.println(num);
    }

}
