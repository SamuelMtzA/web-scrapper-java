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
    // String linkPage = "https://www.bbc.com/";
    // getWebContent(linkPage);

    List<String> webPages = new ArrayList<>();
    webPages.add("https://www.bbc.com/news/world");
    webPages.add("https://www.bbc.com/news/uk");
    webPages.add("https://www.bbc.com/news/business");
    webPages.add("https://www.bbc.com/news/technology");
    webPages.add("https://www.bbc.com/news/entertainment_and_arts");
    // webPages.stream().forEach(page -> getWebContent(page));
    webPages.stream().parallel().forEach(page -> getWebContent(page));
    

  }
  //Downloads web pages, READ FILES OR PROCESS DATA HERE
  private static synchronized String getWebContent (String url) {
    System.out.println("Downloading: " + url);
    try {
      URL newURL = new URL(url);
      HttpURLConnection httpConnection = (HttpURLConnection) newURL.openConnection();
      String encoding = httpConnection.getContentEncoding();
  
      InputStream input = httpConnection.getInputStream();

      Stream<String> lines = new BufferedReader( new InputStreamReader(input) ).lines();
      System.out.println("End");

      String result = lines.collect(Collectors.joining());
      // System.out.println(result);
      System.out.println("End");
      return result;
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return "Nothing";
  
  } 
}
