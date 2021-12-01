/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo using interfaces & classes... implements keyword is used */
package com.lailah.interfaces;

/**
 *
 * @author Fretty
 */
public class A implements Item {
    public void display() //method overriding
    {
        System.out.println("Item Code is "+itemcode);
        System.out.println("Item name is "+itemname);
    }
}
