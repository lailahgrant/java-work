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
public class Test extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String msg="";
    public void init() {
        // TODO start asynchronous download of heavy resources
        msg="Kemigisa Lailah Grant";
    }
    public void paint(Graphics g){
        g.drawString(msg,10, 100);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
/**
 * <applet code=Test width=400 height=500 ></applet>
 * /
 */