/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.appletdemo;

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author Fretty
 */
public class UserInput extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    TextField t1,t2;
        
    public void init() {
        // TODO start asynchronous download of heavy resources
        t1 = new TextField(8);
        t2 = new TextField(8);
        add(t1);
        add(t2);
        t1.setText("0");
        t2.setText("0");
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g)
    {
        setBackground(Color.DARK_GRAY);
         g.setColor(Color.WHITE);
       int x=0, y=0, z=0;
       String s1, s2, s;
       g.drawString("Input a number in each box ",8,20);//cols rows
       try{
           s1=t1.getText(); //get input from user
           x=Integer.parseInt(s1); //converting string to integer
          
            s2=t2.getText();
           y=Integer.parseInt(s2);
           
            z=x+y; //z is now integer
           s=String.valueOf(z); //convert z into an String
           g.drawString("The sum is "+s,10,50);
           //g.drawString(s, 100, 75);
       }catch(Exception ex){
           ex.printStackTrace();//eception handling
       }
     
    }
     public boolean action(Event event, Object object){
          repaint(); //refresh
          return true;
   
        }
      /**
     *  <applet code=UserInput.class width=300 height=60 ></applet>
     */
}
