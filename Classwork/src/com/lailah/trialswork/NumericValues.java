/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.trialswork;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author Lailah
 */
public class NumericValues extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
     int x=10, y=23, sum;
      
    public void init() {
        // TODO start asynchronous download of heavy resources
          sum=x+y;
    
    }

    public void paint(Graphics g){
       
        /*in applets,we can display numeric values by 1st converting them to Strings and then use drawString() method
        of Graphics class
        We can do this easily by using the valueOf() method of String class
        */
        
        String s ="Sum of "+x+" and "+y+" is = "+String.valueOf(sum);
        g.drawString(s, 100, 100);
        
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}
