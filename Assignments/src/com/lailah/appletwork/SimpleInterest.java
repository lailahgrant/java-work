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
public class SimpleInterest extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        int p=20000;
        double r=0.2;
        int t=2;
        double SI=p*r*t;
        String s ="Simple interest is "+String.valueOf(SI);
        g.drawString(s, 10, 100);
    }
         
       
}
