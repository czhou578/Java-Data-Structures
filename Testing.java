package src;
import java.util.regex.*;


public class Testing {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("fool\\Q.\\E"); //string to find
    String input = "fool."; 
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) {
      System.out.println("Found!");
      System.out.println(matcher.groupCount());
    } else {
      System.out.println("Not Found!");
    }
  }
}
