package minInt;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static int min(int[] arr) {
    int sizeArr = arr.length;
    int min = 1;
    System.out.println("sizeArr: " + sizeArr);
    Set<Integer> set = new HashSet<>();
    // Set<Integer> set = new TreeSet<>();

    for (int a : arr) {
      if (a > 0) {
        set.add(a);
      }
    }
    System.out.println("SET " + set);
 
    for(int i = 1; i < sizeArr + 1; i++) {
      if (!set.contains(i)) {
        min = i;
        break;
      } else {
        min = sizeArr + 1;
      }
    }
    System.out.println("MIN " + min);
    return min;
  }

  public static void main(String[] args) {
    System.out.println(min(new int[] {1, 3, 6, 4, 1, 2}));
    System.out.println(min(new int[] {1,2,3}));
    System.out.println(min(new int[] {-1,-3}));
  }
}
