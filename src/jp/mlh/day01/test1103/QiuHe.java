package jp.mlh.day01.test1103;

public class QiuHe {
    public static void main(String[] args) {
        System.out.println(qiuHe(1,100));
    }
    public  static int qiuHe(int a,int b){
        int sum =0;
        for (int i=a;i<=b;i++){
            sum+=i;

        }
        return  sum;

    }
}
