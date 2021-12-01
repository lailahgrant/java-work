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

/*class Rectangle{
    int length;
    int width;
}if you want to create another class with the same name in different files, class(the one i commnented above)is removed and 
a separate class Rectangle is formed*/

public class ClassDemo {
    public static void main(String[] args) {
        //variables of a class are accessed in the main class using objects
        Rectangle obj = new Rectangle(); //classname objectname = new contructor
        obj.length =10;
        obj.width =20;
        int area = obj.length * obj.width;
        System.out.println("The area of a Rectangle is "+area);
    }
}
