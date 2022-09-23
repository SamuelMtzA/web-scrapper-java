package scrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.IllformedLocaleException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {
    List<String> listOfPages = new ArrayList<>();
    listOfPages.add("https://www.bbc.com/news/live/world-62970683");
    listOfPages.add("https://www.bbc.com/news/world-europe-62996212");
    listOfPages.add("https://www.bbc.com/worklife/article/20220920-why-gen-zers-are-growing-up-sober-curious");
    listOfPages.add("https://www.bbc.com/news/world-middle-east-62998231");

    // Long timeStart = System.nanoTime();
    // listOfPages.stream().forEach( Main::getWebContent);
    // Long timeEnd = System.nanoTime();
    // System.out.println("Difference between: " + (timeEnd - timeStart));

    // timeStart = System.nanoTime();
    // listOfPages.stream().parallel().forEach( Main::getWebContent);
    // timeEnd = System.nanoTime();
    // System.out.println("Difference between with parallel: " + (timeEnd - timeStart));

    String linkPage = "https://www.bbc.com/";
    getWebContent(linkPage);
    
  }
  //Downloads web pages, READ FILES OR PROCESS DATA HERE
  private static String getWebContent (String url) {
    // System.out.println("init");
    // System.out.println(url);
    try {
      URL newURL = new URL(url);
      HttpURLConnection httpConnection = (HttpURLConnection) newURL.openConnection();
      String encoding = httpConnection.getContentEncoding();
  
      InputStream input = httpConnection.getInputStream();
      Stream<String> lines = new BufferedReader( new InputStreamReader(input) ).lines();
      System.out.println("End");

      String result = lines.collect(Collectors.joining());
      System.out.println(result);
      return result;
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return "Nothing";
  
  } 
}
