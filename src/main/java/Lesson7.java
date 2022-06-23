import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Lesson7 {
    /*
    * Tính trung bình và giá trị trung bình của mảng
    input :  arr= [12, 46, 32, 64];
    Result :   { mean: 38.5, median: 32 }
    * */

    private float mean;
    private int median;

    public Lesson7() {
    }

    public Lesson7(float mean, int median) {
        this.mean = mean;
        this.median = median;
    }

    @Override
    public String toString() {
        return "Result : {" +
                "mean: " + mean +
                ", median: " + median +
                '}';
    }

    public void cachkhac(){
        System.out.println("Test Lesson 7:");
        List<Lesson7> result = new ArrayList <>();
        int[] arr = {12, 46, 32, 64};
        float mean = (float)IntStream.of(arr).sum()/arr.length;
        int median = arr[0];
        for (int i =0;i<arr.length;i++){
            if (Math.abs(median-mean)>Math.abs(arr[i]-mean)){
                median=arr[i];
            }
        }
            result.add(new Lesson7(mean,median));
             System.out.println("Cach 2: \n"+result);
    }


    public void cach1(){
        List<Lesson7> result = new ArrayList <>();
        int[] arr = {12, 46, 32, 64};
        List<Float> arr1 = new ArrayList <>();
        float mean = (float)IntStream.of(arr).sum()/arr.length;
        final float a = mean;
        for (int i: arr) {
            float b = Math.abs(a-i);
            arr1.add(b);
        }
        Float min =arr1.get(0);
        int indexMin = 0;
        for (int i = 0; i < arr1.size(); i++) {
            if(min>arr1.get(i)){
                min= arr1.get(i);
                indexMin =arr1.indexOf(min);
            }
        }
        int median = arr[indexMin];
        result.add(new Lesson7(mean,median));
        System.out.println("Cach 1: \n"+result);
    }

}
