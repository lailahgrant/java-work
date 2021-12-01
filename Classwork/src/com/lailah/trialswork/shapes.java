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
public class shapes extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint (Graphics g){
        g.drawLine(10,50,50,10); // g.drawLine(x1,y1,x2,y2)
        g.drawLine(10,10,50,50);
        g.drawRect(10, 60, 40, 30); //g.drawRect(x,y,width,height);
        g.fillRect(60,10,30,82);//g.fillRect(x,y,width,height);
        g.drawRoundRect(10,100,80,50,10,10);  //g.drawRoundRect(x,y,width,height,arcwidth,archeight);
       g.fillRoundRect(20,110,60,30,5,5);  //g.fillRoundRect(x,y,width,height,arcwidth,archeight);
       g.drawOval(120,20,200,120); //g.drawOval(x,y,width,height)
       g.setColor(Color.GREEN);
       g.fillOval(170,30,100,100); //this is a circle g.fillOval(x,y,width,height)
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}
