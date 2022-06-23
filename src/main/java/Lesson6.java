import java.util.Arrays;
import java.util.stream.IntStream;

public class Lesson6 {
    /*
    * tính tổng của mảng
    input = [ 1, -4, 12, 0, -3, 29, -150]
    Result -115
    * */

    public void sumArr(){
       int[] input = { 1, -4, 12, 0, -3, 29, -150};
       int sumArr = IntStream.of(input).sum();
        System.out.println("Test Lesson 6:");
        System.out.println("Tong gia tri cua mang: "+sumArr);
    }
}
