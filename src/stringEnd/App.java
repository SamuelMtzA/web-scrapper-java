package stringEnd;

public class App {
  public static boolean solution(String str, String ending){
    if(str.length() < ending.length()) return false;
    int i = ending.length() - 1;
    int j = str.length() - 1;
    while(i>=0){
      if(str.charAt(j) == ending.charAt(i)) {
        i--;
        j--;
      }
      System.out.println("str:" + j);
      System.out.println("end:" + i);
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(solution("samurai", "ai"));
    System.out.println(solution("sumo", "omo"));
    System.out.println(solution("abc", "bc"));
  }
}
