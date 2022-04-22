import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassForList {


    public static void main(String[] args) {
        String[] a= new String[8];

//< Type > is called as java generic  which makes my list bound to have that type of data only
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);

        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2,8);
        System.out.println(list);
        List<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);

        list1.add(30);
        list1.add(40);
        list1.add(50);
        list.addAll(2,list1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }

}
