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

class Nesting
{
    int x,y;
    Nesting(int a, int b) //parameterized Constructor
    {
        x=a; y=b;
    }
    int largest() //method to find largest of 2 nos
    {
        if(x>y)
            return x;
        else
            return y;
    }
    void display()
    {
        System.out.println("The largest of "+x+" and "+y+" is "+largest()); //call method
    }
}

public class NestingofMethods2largest {
    public static void main(String[] args) {
        Nesting obj = new Nesting(20,90); //pass values for parametrized 
        obj.display();
    }
}
