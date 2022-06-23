import java.util.ArrayList;
import java.util.List;

/*
"Cho 2 mảng
a = [1,2,3,4,5]
b = [6,7,8,9,10]
lấy ra các số chẵn đẩy vào arr1 , số lẻ vào arr 2 và tính tổng"
* */

public class Lesson3 {
    public void chanLeSum(){
       int[] a = {1,2,3,4,5};
       int[] b = {6,7,8,9,10};
        List < Integer > arr1 = new ArrayList <>();
        List<Integer> arr2 = new ArrayList <>();
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                arr1.add(a[i]);
            }else {
                arr2.add(a[i]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i]%2==0){
                arr1.add(b[i]);
            }else {
                arr2.add(b[i]);
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i: arr1) {
            sum1 = sum1+i;
        }
        for (int i: arr2) {
            sum2 = sum2+i;
        }
        System.out.println("Test Lesson 3:");
        System.out.println("Mang arr1 chua cac phan tu chan: "+arr1);
        System.out.println("Tong gia tri mang chan: "+sum1);
        System.out.println("Mang arr2 chua cac phan tu le: "+arr2);
        System.out.println("Tong gia tri mang le: "+sum2);
        System.out.println("-------------------------------------------");
    }
}
