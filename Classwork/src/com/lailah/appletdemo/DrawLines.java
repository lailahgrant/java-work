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
public class DrawLines extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        resize(1000,800); //resize the display applet window width height
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        g.drawLine(10, 10, 200, 10); //horixontal line
        g.drawLine(10,10,10,200);//vertical line
        g.drawLine(200,10,200,200);
        g.drawLine(200, 200, 10, 200);
        
        //circle
        g.setColor(Color.GREEN);
       // g.drawOval(100, 100, 100, 100);
       g.fillOval(100, 100, 100, 200);
        
        g.setColor(Color.red);
        g.fillRect(100, 100, 300, 100);
        
        
       
        
        /*recttangle Uganda Flag
        g.drawRect(200,300, 500, 300);
         g.drawRect(200,300, 500, 100);
         g.drawRect(200, 300, 500, 200);*/
        
        /*g.setColor(Color.BLACK);
       g.fillRect(200,300, 500, 300);*/
       g.setColor(Color.YELLOW);
         g.fillRect(200,300, 500, 100);
         g.setColor(Color.BLACK);
         g.fillRect(200, 300, 500, 200);  
                
    }
    /**
     * <applet code=DrawLines width=400 height=500></applet>
     */
}
