import java.util.ArrayList;
import java.util.List;

/*
* input = [ 1, 2, 3, 4, 5 ];
Result = [ 1, 4, 9, 16, 25]
* */
public class Lesson2 {
    public void luythuax2() {
        int[] input = {1, 2, 3, 4, 5 };
        List < Integer > newInput = new ArrayList <>();
        for (int i = 0; i < input.length ; i++) {
            int tich = input[i]*input[i];
            newInput.add(tich);
        };
        System.out.println("Test Lesson 2:");
        System.out.println(newInput);
        System.out.println("-------------------------------------------");
    }
}
