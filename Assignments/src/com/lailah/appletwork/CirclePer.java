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
public class CirclePer extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO over00write start(), stop() and destroy() methods
    public void paint(Graphics g)
    {
        float r=7F;
        double area = 3.142*r*r;
        double perimeter = 2*3.142*r;
        String s = "Area of a circle is "+String.valueOf(area);
        g.drawString(s, 10, 100);
        String s1="Perimeter of a circle is "+String.valueOf(perimeter);
        g.drawString(s1, 20,150);
    }
     
    /**
     * <applet code=CirclePer width=700 height=400></applet>
     */
}
