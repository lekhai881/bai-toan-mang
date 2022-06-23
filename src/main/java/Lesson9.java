/*
* Tính giai thừa của 1 số
input :   const input = 6;
Result : 720
* */
public class Lesson9 {
    public void giaiThua(){
        int giaiThua =1;
        int input = 6;
        for (int i = 1; i <=input ; i++) {
            giaiThua = giaiThua*i;
        }
        System.out.println("Test Lesson 9:");
        System.out.println("Giai thua cua "+input+" la: "+giaiThua);
    }
}
