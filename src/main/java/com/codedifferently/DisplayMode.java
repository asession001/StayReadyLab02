package com.codedifferently;

import java.util.Scanner;

public class DisplayMode {

    Scanner keyboard = new Scanner (System.in);

   private String whichMode; 

    public void switchDisplayMode1(){
        
        String umode = keyboard.next();
        String whichMode = umode; 

    }

    public String switchDisplayMode2(String whichMode){

        String dismode1 = "radian";
        String dismode2 = "degree";
        return whichMode;
        
    }

    public String getMode() {
        return whichMode;
    }
    
}