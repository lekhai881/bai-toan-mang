import java.util.*;
/*
* tìm số tuổi nhỏ nhất và lớn nhất và tính số tuổi chênh lệch (tuổi chênh lệch =  tuổi lớn nhất -  tuổi bé nhất)
const input = [ {name: 'John',age: 13},{name: 'Mark',age: 56},{name: 'Rachel',age: 45,},{name: 'Nate', age: 67},{name: 'Jeniffer', age: 65}];
Result : [13, 67, 54]
* */
public class Lesson8 {

    private String name;
    private int age;

    public Lesson8() {

    }

    public int getAge() {
        return age;
    }

    public Lesson8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Lesson8(float mean, int median) {
    }

    @Override
    public String toString() {
        return "{" +
                "name:" + name  +
                ", age:" + age +
                '}';
    }

    public void minMaxAge(){
        List < Lesson8 > list =new ArrayList <>();
        list.add(new Lesson8("Join",13));
        list.add(new Lesson8("Mark",56));
        list.add(new Lesson8("Rachel",45));
        list.add( new Lesson8("Nate",67));
        list.add( new Lesson8("Jeniffer",65));
        System.out.println("Test Lesson 8: \n"+"Mang ban dau: \n"+list);

        List < Integer > result =new ArrayList <>();
        Optional < Lesson8 > min = list.stream().min(Comparator.comparing(Lesson8::getAge));
        result.add(min.get().age);

        Optional < Lesson8 > max = list.stream().max(Comparator.comparing(Lesson8::getAge));
        result.add(max.get().age);

        int chenhLechAge = max.get().getAge()-min.get().getAge();
        result.add(chenhLechAge);

        System.out.println("Result : "+result);
    }


}
