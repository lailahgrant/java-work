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
public class Shapes extends Applet {
String msg="", m="", o="", c="", p="", f="", l="";
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        msg="Lines to square"; c="Circle"; l="lines & rectangles";
        m="Rectangle"; p="Polygon";
        o="Oval"; f="My Face";
       resize(3000,3000);
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        g.setFont(new Font("chiller",  Font.BOLD, 25));
        g.drawString(msg,50,20);
        
        g.drawLine(60, 60, 200, 60);
        g.drawLine(60,60,60,200);
        g.drawLine(200, 60, 200, 200);
        g.drawLine(200, 200, 60, 200);
        
        g.drawString(m,350,20);
        //g.drawRect(250,100,300,50);//right downwards width height
        g.setColor(Color.green);
        g.fillRect(250,100,300,50);
        
        g.drawString(o, 610, 20);
        //g.drawOval(600, 80, 100, 70);
         g.setColor(Color.green);
        g.fillOval(600, 80, 100, 70);
        
        g.drawString(c, 800, 20);
        //g.drawOval(750, 30, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(750, 30, 150, 150);
        
        g.drawString(p,1000,20);
       // g.drawPolygon(5);
       
       g.drawString(l,2000,20);
       g.drawString(f,100 ,300);
       g.drawOval(50,310 ,200, 250); //head
       g.drawOval(90,390,40,30); //left eye
       g.drawOval(180,390, 40, 30); //right eye
       g.drawOval(103, 397, 15, 15); //left pupil
       g.drawOval(193, 397, 15, 15); //right pupil
       g.drawOval(135, 430, 30, 30); //nose
       g.fillArc(115, 450, 80, 60, 180, 180);
    }
    /**
     * <applet code=Shapes width=500 height=400></applet>
     */
}
