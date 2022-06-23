import java.util.*;

public class CommonUtil {

    public void checkTrung(int[][] arr){

  //      long begin = Calendar.getInstance().getTimeInMillis();
        final int arrLength = arr.length;
        List < Integer> listTong = new ArrayList <>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int count =1;
                for (int k = j+1; k < arr[i].length; k++) {
                    if (arr[i][j]==arr[i][k])
                        count++;
                        break;
                }
                if (count==1)
                    listTong.add(arr[i][j]);
            }
        }
       // System.out.println("Mang chung: \n"+listTong);
        Set <Integer> list2 = new HashSet <>();
        for (int i:listTong)
            list2.add(i);
      //  System.out.println("Mang chung khong chua phan tu trung: \n"+list2);
        List<Integer> list3 = new ArrayList <>();
        for (int i: list2) {
            int count=0;
            for (int j: listTong){
                if (i==j)
                    count++;
            }
            if (count==arrLength)
                list3.add(i);
        }
        System.out.println("Danh sách chua phan tu trung duy nhat: \n"+list3);
/*        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("Executed Time: " + (end - begin));*/
    }

    public void sapXepNoiBot(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int tam;
                    tam=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tam;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp : \n"+Arrays.toString(arr));
    }



}
