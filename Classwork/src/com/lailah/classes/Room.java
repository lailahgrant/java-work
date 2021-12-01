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
public class Room {
    float length;
    float width;
    Room(float a) //square
    {
        length = width = a;
    }
    Room(float a, float b) //rectangle
    {
        length=a;
        width=b;
    }
    float area()
    {
        return(length * width);
    }
}
