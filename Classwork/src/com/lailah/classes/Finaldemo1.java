/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo for final on  method,,, no overriding*/
package com.lailah.classes;

/**
 *
 * @author Fretty
 */

class X
{
    final void display()
    {
        System.out.println("from super class X");
    }
}
/*class Y extends X
{
    void display() //error due to final shows no overriding
    {
        System.out.println("From subclass Y");
    }
}

public class Finaldemo1 {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.display();
    }
}*/
