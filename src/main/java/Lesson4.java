import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson4 {
    /*
"Cho 2 mảng
a = [1,2,3,4,5]
b = [6,5,4,3,9]
lấy ra các phần tử trùng và đẩy vào mảng arr1 = []
các phần tử k trùng đẩy vào arr2 = []"
* */

    public void checkTrung(){
        int[] a = {1,2,3,4,5,5,5};
        int[] b = {6,5,4,3,9};
        List<Integer> arr1 = new ArrayList <>();
        List<Integer> arr2 = new ArrayList <>();
        List<Integer> arr3 = new ArrayList <>();
        for (int i: a) arr3.add(i);
        for (int i: b) arr3.add(i);
        System.out.println("Mang chung: \n"+arr3);
        Set<Integer> arr4 = new HashSet <>();
        for(int i: arr3) arr4.add(i);
        System.out.println(" Mang chung khong chua phan tu lap: \n"+arr4);

        for (int i:arr4) {
            int count=0;
            for (int j: arr3){
                if(i==j){
                    count++;
                }
            }
            if (count>1){
                arr1.add(i);
            }else {
                arr2.add(i);
            }
        }
        System.out.println("Test Lesson 4:");
        System.out.println("Mang chua phan tu trung: "+arr1);
        System.out.println("Mang khong chua phan tu trung: "+arr2);
        System.out.println("-------------------------------------------");
    }
}
