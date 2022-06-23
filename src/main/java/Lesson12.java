/*int[][] arr1 ={{7,3,6,10},{9,10,3}}; => return [10, 3]
        int[][] arr2 = {{9,10,3},{7,3,6,10},{3,7,6}}; => return [3, 7, 6]
        int[][] arr3 ={{2,3},{4,5}}; => return [3]
        int[][] arr4 = {{2,3,5}}; => return []
        */
public class Lesson12 extends CommonUtil {
    int[][] arr1 ={{7,3,6,10},{9,10,3}};
    int[][] arr2 = {{9,10,3,3,4},{7,3,6,10},{3,7,6}};
    int[][] arr3 ={{2,3},{4,5}};
    int[][] arr4 = {{2,3,5}};

    @Override
    public void checkTrung(int[][] arr) {
        System.out.println("----------------\nTest lesson 12.1");
        super.checkTrung(arr1);
        System.out.println("----------------\nTest lesson 12.2");
        super.checkTrung(arr2);
        System.out.println("----------------\nTest lesson 12.3");
        super.checkTrung(arr3);
        System.out.println("----------------\nTest lesson 12.4");
        super.checkTrung(arr4);
    }

    public void showResult(){
        checkTrung(arr1);
    }
}
