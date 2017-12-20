package com.talfinder.assessment;

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
  public static void main(String[] args) {

    Utility.println("Welcome to GalaxyMerchant ! please provide input below and a blank new line to finish input");

    // Initialize a new paragraph
    Paragraph paragraph = new Paragraph();

    // Read the input from console, validate and process
    ArrayList<String> output=paragraph.read();

    for(int i=0;i<output.size();i++)
    {
      Utility.println(output.get(i));
    }


  }

}
