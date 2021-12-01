/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*area of a room length * width;*/
package com.lailah.classes;

/**
 *
 * @author Fretty
 */
public class Room1//parent class to Room2
{
    int length, width;
    Room1(int a, int b)
    {
        length =a; width=b;
    }
    int area()
    {
        return(length*width);
    }
}
