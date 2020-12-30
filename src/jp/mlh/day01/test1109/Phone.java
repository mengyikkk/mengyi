package jp.mlh.day01.test1109;

/*
 * 定义一个类,用来模拟"手机"事物.
 * 属性: 品牌价格,颜色
 * 行为:打电话 发短信
 *对应到类当中:
 * 成员变量(属性):
 *       String brand;
 *       double price;
 *       String color;
 *       public void call(String who){}
 *
 *
 * */
public class Phone {
    String brand;//品牌
    double price;
    String color;

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public  void sendMessage(){
        System.out.println("群发短信");
    }
}
