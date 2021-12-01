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
public class Applet1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String m ="";
    public void init() {
        // TODO start asynchronous download of heavy resources
        m = "hello lailah";
    }
    public void paint(Graphics g){
        g.drawString(m,10,100);//cols,rows
    }

    // TODO overwrite start(), stop() and destroy() methods
    /**
     *  <applet code=Applet1.class width=500 height=50 >
     * </applet>
     * /
     */
}
