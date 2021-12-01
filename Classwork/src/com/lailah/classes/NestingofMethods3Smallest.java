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

class Smallest
{
    int a,b;
    Smallest(int x, int y)
    {
        a=x; b=y;
    }
    int smallest()
    {
        if(a<b)
            return a;
        else
            return b;
    }
    void display()
    {
        System.out.println("The smallest of "+a+" and "+b+" is "+smallest());
    }
}

public class NestingofMethods3Smallest {
    public static void main(String[] args) {
        Smallest obj = new Smallest(11,22);
        obj.display();
    }
}
