import org.apache.commons.math3.stat.StatUtils;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
* Dùng hàm map , fiter , Reduce tình tổng  mảng arr =[1,2,3,4,5,6,7,8,9]
* */
public class Lesson1 {
    int[] arr ={1,2,3,4,5,6,7,8,9};

    public void sumArr() {
        System.out.println("Test Lesson 1:");
        int sum = IntStream.of(arr).reduce(0,((left, right) ->  + left +right));
        System.out.println("Tinh tong cach 1: " + sum);

        int sum2 = (int) Arrays.stream(arr).sum();
        System.out.println("Tinh tong cach 2: "+sum2);

        int sum3 = IntStream.of(arr).sum();
        System.out.println("Tinh tong cach 3: "+sum3);

        int sum4 =0;
        for (int i :arr) sum4=sum4+i;
        System.out.println("Tinh tong cach 4: "+sum4);

        double[] arr ={1,2,3,4,5,6,7,8,9};
        int sum5 = (int) StatUtils.sum(arr);
        System.out.println("Tinh tong cach 5: "+sum5);
    }
}
