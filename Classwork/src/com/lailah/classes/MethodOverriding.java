/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo for method overriding*/
package com.lailah.classes;

/**
 *
 * @author Fretty
 */

class A
{
    void display()
    {
        System.out.println("From class A");
    }
}
class B
{
    void display()
    {
        System.out.println("From class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
