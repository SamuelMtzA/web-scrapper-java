package Longest;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    // adding 20 different names to the list
    list.add("John");
    list.add("Paul");
    list.add("George");
    list.add("Ringo");
    findLongestString(list);

  }

  public static void findLongestString(List<String> list){
    String longest = "";
    for(String name: list){
      if(name.length() > longest.length()){
        longest = name;
      }
    }
    System.out.println(longest);
  }
}
