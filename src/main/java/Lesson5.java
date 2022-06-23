import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson5 {
    /*
Cho 2 mảng
 a = [1,2,3,4,5]
b = [6,5,4,3,9]
c= [5,2,3,6,8,5,9]
lấy ra các phần tử trùng và đẩy vào mảng
arr1 = []
các phần tử k trùng đẩy vào arr2 = []
    */

    public void checkTrung3Arr(){
        int[] a = {1,2,3,4,5,5,5};
        int[] b = {6,5,5,5,4,9};
        int[] c= {5,2,3,6,8,5,9};

        List<Integer> arr1 =new ArrayList <>();
        List <Integer> arr2 = new ArrayList <>();
        List<Integer> arr3 = new ArrayList <>();
        Set<Integer> arr4 = new HashSet <>();
        for (int i:a) arr3.add(i);
        for (int i: b) arr3.add(i);
        for(int i: c) arr3.add(i);
        System.out.println("Test Lesson 5:");
        System.out.println("Mang chung: \n"+arr3);
        for (int i: arr3) arr4.add(i);
        System.out.println("Mang chung chua cac phan tu xuat hien 1 lan :\n"+arr4);

        for(int i: arr4){
            int count = 0;
            for (int j: arr3){
                if(i==j){
                    count++;
                }
            }
            if(count>1){
                arr2.add(i);
            }else {
                arr1.add(i);
            }
        }
        System.out.println("Mang chua cac phan tu khong trung :"+arr1);
        System.out.println("Mang chua cac phan tu trung :"+arr2);
     }
}
