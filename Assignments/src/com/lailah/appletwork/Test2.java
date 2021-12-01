/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.appletwork;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Fretty
 */
public class Test2 extends Applet {
String actionMessage="";
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        //create buttons
        Button b1 = new Button("OK");
        Button b2 = new Button("Cancel");
        //add buttons
        add(b1); add(b2);
    }
    
    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        g.drawString(actionMessage, 10, 50);
    }
    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
