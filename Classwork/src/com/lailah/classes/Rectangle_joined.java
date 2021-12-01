/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.classes;

/**
 *
 * @author Fretty
 */
public class Rectangle_joined {
    public static void main(String[] args) {
        //reference methods of Rectangle.java
        Rectangle obj = new Rectangle();
        obj.putData(); //call fn since it has declaration
        int area = obj.length * obj.width;
        System.out.println("The area of a rectangle is "+area);
    }
}
