package jp.mlh.day01.test1109;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone sphone =new Phone();
        System.out.println(sphone.brand);
        System.out.println(sphone.color);
        System.out.println(sphone.price);
        sphone.brand="iphone";
        sphone.color="yellow";
        sphone.price=1300.0;
        System.out.println(sphone.brand);
        System.out.println(sphone.color);
        System.out.println(sphone.price);
        sphone.call("asjd");
        sphone.sendMessage();
        System.out.println("===============");
        Phone sphtwo =new Phone();
        System.out.println(sphtwo.brand);
        System.out.println(sphtwo.color);
        System.out.println(sphtwo.price);
        sphtwo.brand="三星";
        sphtwo.color="yellow";
        sphtwo.price=59999.0;
        System.out.println(sphtwo.brand);
        System.out.println(sphtwo.color);
        System.out.println(sphtwo.price);
        sphtwo.call("asjd");
    }
}
