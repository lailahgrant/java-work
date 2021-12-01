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

class Demo{
    void display1()
    {
        System.out.println("Kampala");
    }
    void display2()
    {
        System.out.println("Sai pali Institute of Technology & Management");
        display1();//nesting of methods - calling a method in another method
    }
}

public class NestingofMethods {
    public static void main(String[] args) {
        Demo obj = new Demo(); // classname objectname = new constuctor
        obj.display2(); //display2() is called since it contains both methods
    }
}
