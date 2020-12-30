package jp.mlh.day01.test1104;

public class PaiXu {
    public static void main(String[] args) {
        int[] arrayB = {1, 2, 3, 4, 5, 7, 8, 9, 10, 6};
        int min = 0;
        int max = arrayB.length - 1;
        for (; min < max; min++, max--) {
            int temp = arrayB[min];
            arrayB[min] = arrayB[max];
            arrayB[max] = temp;
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }
}
