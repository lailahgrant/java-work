/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.interfaces;

/**
 *
 * @author Fretty
 */
public class B implements ItemConstants,ItemMethods/*multiple inheritance*/ {
   @Override
    public void display() //method overriding
    {
        System.out.println("Item code = "+ITEMCODE);
        System.out.println("Item name = "+ITEMNAME);
    }
}
