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
public class Sumdemo extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
        int a=10, b=20, sum =a+b;
        String s = "sum is = "+String.valueOf(sum);
        g.drawString(s, 10, 100);
    }

    // TODO overwrite start(), stop() and destroy() methods
    /**
     *  <applet code=Sumdemo.class width=300 height=60 ></applet>
     */
}
