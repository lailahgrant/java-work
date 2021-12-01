/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.appletwork;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author Fretty
 */
public class Circle extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    TextField t2;
    
    public void init() {
        // TODO start asynchronous download of heavy resource
          t2 = new TextField(8);
          add(t2);
          t2.setText("0");
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        setBackground(Color.green);
        
        double r=0, area=0, per=0;
        String s1,s2,s;
        g.drawString("Input a radius of a circle ", 2, 20);
        try{
            s1=t2.getText();
            r=Double.parseDouble(s1);
            
        }catch(Exception ex){
            
        }
        area=3.142*r*r;
        s2=String.valueOf(area);
        g.setColor(Color.lightGray);
        g.drawString("The area of a circle is "+s2, 10, 50);
       // g.drawString(s2, 100, 75);
        
        per=2*3.142*r;
        s=String.valueOf(per);
        g.setColor(Color.WHITE);
        g.drawString("The perimeter of a circle is "+s, 10,70);
       // g.drawString(s,100, 90);
    }
    //activate enter
     public boolean action(Event event, Object object){
          repaint(); //refresh
          return true;
   
        }
    /**
     *  <applet code=Circle.class width=300 height=60 ></applet>
     */
}
