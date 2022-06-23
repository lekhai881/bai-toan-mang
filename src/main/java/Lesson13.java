import java.util.Arrays;
import java.util.Scanner;

/*
* Thêm phần tử vào mảng.
* Sắp xếp phần tử theo thứ tự tăng dần.
* */
public class Lesson13 extends CommonUtil{
    /*
     * Ý tưởng:
     * b1. Tạo mảng chung có độ dài bằng mảng cho sẵn + mảng nhập tay (arrChung)
     * b2. Nhập vị trí(index) cần chèn mảng nhập tay(arr2) vào mảng cho sẵn(arr1).
     * b3. Copy phần tử của mảng cho sẵn(arr1) nằm trước vị trí chèn(index) đưa
           vào mảng chung(arrChung).
     * b4. Thêm phần tử của mảng nhập tay(arr2) vào vị trí chèn(index) trong mảng
           chung(arrChung).
     * b5. Copy phần tử còn lại của mảng cho sẵn(arr1) thêm vào sau phần tử cuối
           của mảng nhập tay(arr2) trong mảng chung(arrChung)
     * b6. Sắp xếp lại mảng.
     * */

    //b1.
    int[] arr1 ={1,3,5,6};
    public int n;
    int[] arr2 = new int[n];
    int index;
    Scanner scanner = new Scanner(System.in);

    public void showResult() {
        System.out.println("Mang cho sẵn: \n"+Arrays.toString(arr1));
        System.out.println("--------------------------\n Nhập độ dài mảng cần thêm: ");
        while (n<1){
            System.out.println("Nhập một số nguyên!");
            n = scanner.nextInt();
            arr2 = new int[n];
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu " + (i + 1)+":");
            arr2[i] = scanner.nextInt();
        }
        System.out.println("-----------------------\n Mảng vừa nhập: \n"+Arrays.toString(arr2));
        int[] arrChung = new int[arr2.length+arr1.length];
        //b2.
        System.out.println("-------------------\n Nhập vị trí chèn mảng:");
        index=-1;
        while (index<0 || index> arr1.length){
            System.out.println("Nhập giá trị 0<= index =< "+arr1.length+":");
            index = scanner.nextInt();
        }

        //b3.
        System.arraycopy(arr1,0,arrChung,0,index);

        //b4.
        int k = index;
        for (int i:arr2) {
            arrChung[k++]=i;
        }
        System.out.println(Arrays.toString(arrChung));
        System.out.println("Thêm mảng vừa nhập vào vị trí chèn: \n"+Arrays.toString(arrChung));

        //b5.
        System.arraycopy(arr1,index,arrChung,arr2.length+index,arr1.length-index);
        System.out.println("Thêm phần tử còn lại của mảng cho sẵn vào mảng chung: \n"+Arrays.toString(arrChung));

        //b6.
        sapXepNoiBot(arrChung);
    }

    @Override
    public void sapXepNoiBot(int[] arr) {
        super.sapXepNoiBot(arr);
    }

}
