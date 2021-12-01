/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*inheritance volume of a room l*w*h*/
package com.lailah.classes;

/**
 *
 * @author Fretty
 */
public class Room2 extends Room1 {
    int height;
    Room2(int a, int b, int c)
    {
        super(a,b); //super - keyword used in a constructor to refer to variables in an inherited class
        height = c;
    }
    int volume()
    {
        return(length * width * height);
    }
}
