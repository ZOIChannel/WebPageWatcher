package net.zoizoi.java.webpagewatcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {


  public static void main(String[] args) {
    Boolean Running = true;
    List<Integer> CodeList = new ArrayList<Integer>();
    List<String> URLList = new ArrayList<String>();
    while (Running) {
    }
  }

  public static String GetURL() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please Write URL...");
    String url = reader.readLine();
    System.out.println("Start watching " + url + " ...");
    return url;
  }

  public static boolean WriteTable(int Code, String URL) {
    String Line_Row = " +-----+---------------";
    String Line_Column = " | ";
    System.out.println(Line_Row);
    System.out.println(Line_Column + Code + Line_Column + URL);
    System.out.println(Line_Row);
    return true;
  }
}
