package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Tester {
  public static void main(String[] args) {
    // int [] arr = new int[] {1, 3, 6, 4, 1, 2};
    List<Integer> list = new ArrayList<>();
    // adding 20 different names to the list
    list.add(1);
    list.add(3);
    list.add(6);
    list.add(4);
    list.add(1);
    list.add(2);
    System.out.println("list: " + list);
    list.add(2, 123);
    System.out.println("list: " + list);
    System.out.println(list.size());
    Object [] newArr = list.toArray();
    System.out.println(newArr);
    
    for (int i = 0; i < newArr.length; i++) {
      System.out.println(newArr[i]);
    }


  }
}
