package com.talfinder.assessment;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by hbhargav on 20/12/17.
 */
public class Application {
  /**
   * <p>Entry point of the application</p>
   * @param args
   *
   */
  public static void main(String[] args) throws IOException {

    Utility.println("\nWelcome to GalaxyMerchant !");
    Utility.println("-----------------------------\n");

    // Initialize a new paragraph
    Paragraph paragraph = new Paragraph();

    // Read the input from console, validate and process
    ArrayList<String> output=paragraph.read(null);

    for(int i=0;i<output.size();i++)
    {
      Utility.println(output.get(i));
    }


  }

}
