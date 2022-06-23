import java.util.*;
/*
* Đếm phần tử trong mảng
input :   const input = [
    ['a', 'b', 'c'],
    ['c', 'd', 'f'],
    ['d', 'f', 'g'],
  ];
Result :   { a: 1, b: 1,c: 2,d: 2,f: 2,g: 1}
* */

public class Lesson10 {
    private char t;
    private int c;

    public Lesson10() {
    }

    public Lesson10(char t, int c) {
        this.t = t;
        this.c = c;
    }

    @Override
    public String toString() {
        return "{" + t +
                ":" + c +
                '}';
    }

    public void demPhanTu(){
       char[][] input = {
               {'a', 'b', 'c'},
               {'c', 'd', 'f'},
               {'d', 'f', 'g'},
       };
        List<Lesson10> lesson10List =new ArrayList <>();
        ArrayList < Character > objects = new ArrayList <>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                    objects.add(input[i][j]);
            }
        }
        System.out.println("Mang ban dau: "+objects);
        Set<Character> list = new HashSet();
        for (int i: objects) {
            list.add((char) i);
        }
        System.out.println("Mang loc trung: "+list);

        for (char i : list) {
            int count=0;
            for (char j : objects) {
                if(i==j){
                    count++;
                }
            }
            lesson10List.add(new Lesson10(i,count));
        }
        System.out.println(lesson10List);

    }
}
