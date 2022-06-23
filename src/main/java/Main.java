import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    Lesson1 lesson1 = new Lesson1();
                    lesson1.sumArr();
                    showMenu();
                    break;
                case 2:
                    Lesson2 lesson2 = new Lesson2();
                    lesson2.luythuax2();
                    showMenu();
                    break;
                case 3:
                    Lesson3 lesson3 =new Lesson3();
                    lesson3.chanLeSum();
                    showMenu();
                    break;
                case 4:
                      Lesson4 lesson4 = new Lesson4();
                      lesson4.checkTrung();
                    showMenu();
                    break;
                case 5:
                    Lesson5 lesson5 = new Lesson5();
                    lesson5.checkTrung3Arr();
                    showMenu();
                    break;
                case 6:
                    Lesson6 lesson6 = new Lesson6();
                    lesson6.sumArr();
                    showMenu();
                    break;
                case 7:
                    Lesson7 lesson7 = new Lesson7();
                    lesson7.cachkhac();
                    lesson7.cach1();
                    showMenu();
                    break;
                case 8:
                    Lesson8 lesson8 = new Lesson8();
                    lesson8.minMaxAge();
                    showMenu();
                    break;

                case 9:
                    Lesson9 lesson9 = new Lesson9();
                    lesson9.giaiThua();
                    showMenu();
                    break;
                case 10:
                    Lesson10 lesson10 = new Lesson10();
                    lesson10.demPhanTu();
                    showMenu();
                    break;
                case 11:
                    Lesson11 lesson11= new Lesson11();
                    lesson11.checkTrung11();
                    showMenu();
                    break;
                case 12:
                    Lesson12 lesson12 = new Lesson12();
                    lesson12.showResult();
                    showMenu();
                    break;
                case 13:
                    Lesson13 lesson13 = new Lesson13();
                    lesson13.showResult();
                    showMenu();
                    break;
                case 14:
                    int[] a={2,3,4,5};
                    int[] b={7,8,9,1,3,4};
                    List<Integer> c = new ArrayList <>();
                    List<Integer> d = new ArrayList <>();
                    for (int i: a) c.add(i);
                    for (int i: b) c.add(i);
                    System.out.println(c);
                    for (int i = 0; i <c.size() ; i++) {
                        int count=1;
                        for (int j = i+1; j < c.size(); j++) {
                            if (c.get(i).equals(c.get(j))){
                                count++;
                                break;
                            }
                        }
                        if (count<=1){
                            d.add(c.get(i));
                        }
                    }
                    System.out.println(d);
                    for (int i = d.size()-1; i >=0 ; i--) {
                        for (int j = 1; j <=i ; j++) {
                            if (d.get(j-1)>d.get(j)){
                                int temp ;
                                temp = d.get(j-1);
                                d.set(j-1,d.get(j));
                                d.set(j,temp);
                            }
                        }
                    }
                    System.out.println(d);
                    break;

                case 0:
                    System.out.println("Thoat chương trình!");
                    break;
                default:
                    System.out.println("Nhap sai lua chon. Nhap lai!");
                    break;
            }
        }while (choose >0);
    }
    public static void showMenu(){
        System.out.println("\n------MENU CHUONG TRINH------");
        System.out.println("1->12. Test bài 1->14.");
        System.out.println("0.     Thoát chương trình.");
        System.out.println("-----------------------------");
        System.out.println("Nhap lựa chọn của bạn (0-14) :");
    }
}
