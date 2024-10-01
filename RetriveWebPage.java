import java.net.*;
import java.io.*;

//public 
class RetrieveWebPage {
  public static void main(String[] args) {
    try {
      URL url = new URL("https://www.google.co.in/");
      BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        System.out.println(inputLine);
      }
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
