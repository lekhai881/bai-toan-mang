/*
* const arr1 =
  [
    {id : 1 , name : 'long' , work: "leader"},
    {id : 2 , name : 'tiến' , work: "dev"},
    {id : 3 , name : 'sơn' , work: "tester"},
    {id : 4 , name : 'cường' , work: "BA"},
  ]
const arr2 =
  [
    {id : 1 , name : 'long' , work: "leader"},
    {id : 2 , name : 'thành' , work: "dev"},
    {id : 3, name : 'yên' , work: "tester"},
  ]
const arr3 =
  [
    {id : 1 , name : 'long', work: "leader"},
    {id : 2 , name : 'Điệp' , work: "dev"},
    {id : 3, name : 'yên' , work: "tester"},
  ]
loc trùng các phần tử trong 3 mảng đẩy vào arr4 = [] còn lại đẩy vào arr5 = []
* */

import java.util.*;
import java.util.stream.Collectors;

public class Lesson11 {
    private int id;
    private String name;
    private String work;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Lesson11() {
    }

    public Lesson11(int id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", work: '" + work + '\'' +
                '}'+"\n";
    }

    public void checkTrung11(){
        List<Lesson11> list1 = new ArrayList <>();
        list1.add(new Lesson11(1,"Long","Leader"));
        list1.add(new Lesson11(2,"Tiến","Dev"));
        list1.add(new Lesson11(3,"Sơn","Tester"));
        list1.add(new Lesson11(4,"Cường","BA"));
        System.out.println("arr1 = "+list1);

        List<Lesson11> list2 = new ArrayList <>();
        list2.add(new Lesson11(1,"Long","Leader"));
        list2.add(new Lesson11(2,"Thành","Dev"));
        list2.add(new Lesson11(3,"Yên","Tester"));
        System.out.println("arr2 = "+list2);

        List<Lesson11> list3 = new ArrayList <>();
        list3.add(new Lesson11(1,"Long","Leader"));
        list3.add(new Lesson11(2,"Điệp","Dev"));
        list3.add(new Lesson11(3,"Yên","Tester"));
        System.out.println("arr3 = "+list3);

        List <Lesson11> listTong = new ArrayList <>();
        for (Lesson11 i: list1) listTong.add(i);
        for (Lesson11 i: list2) listTong.add(i);
        for (Lesson11 i: list3) listTong.add(i);
        System.out.println("Mang chung: \n"+listTong);
        Set < Lesson11 > collect = listTong.stream().collect(Collectors.toCollection(() -> new TreeSet <>(Comparator.comparing(Lesson11::getName))));
        System.out.println("Mang chung chua tat ca cac phan tu không trung nhau: \n"+collect);

        System.out.println("--------------------------------------------------");
        System.out.println("Danh sách chua cac phan tu trung: ");
        List<Lesson11>arr4 = new ArrayList <>();
        List<Lesson11> arr5 =new ArrayList <>();
        for (Lesson11 i: collect) {
            int count=0;
            for (Lesson11 j: listTong){
                if (i.name==j.name){
                    count++;
                }
            }
            if (count>1){
                arr4.add(i);
            }else {
                arr5.add(i);
            }
        }
        System.out.println(arr4);
        System.out.println("Danh sach chua cac phan tu duy nhat: ");
        System.out.println(arr5);
        System.out.println("--------------------------------------------------");

    }
}
