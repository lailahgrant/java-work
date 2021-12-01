/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.appletdemo;

import java.applet.Applet;
import java.awt.*; //declare a package

/**
 *
 * @author Fretty
 */
public class Test1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String msg=""; //initially its empty
    String mg ="";
    public void init() {
        // TODO start asynchronous download of heavy resources
        msg = "Kemigisa Lailah Grant"; //define any message
        mg = "Kampala - Uganda";
    }

    public void paint(Graphics g)
    {
        setBackground(Color.green);
        //change font
        /*
        Font f = new Font("arial", Font.BOLD,60);
        g.setFont(f);
        */
        
        //to create a newline, we only adjust cols
         //the following properties only work for msg
        g.setFont(new Font("chiller",  Font.PLAIN, 45));
        //change text color
        g.setColor(Color.YELLOW); 
        g.drawString(msg,10,100); // cols, rows respectively
        
       //the following properties only work for mg
       Font f =new Font("verdana", Font.ITALIC,45);
        g.setFont(f); 
        g.setColor(Color.PINK);
        g.drawString(mg,10,200);
      
        
        
         // TODO overwrite start(), stop() and destroy() methods
    }
}
/**
 * <applet code=Test1 width=400 height=500 ></applet>
 */