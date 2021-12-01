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
//no psvm
public class Rectangle {
    int length; //
    int width;
    
 //default constructor(no datatype, constructor name is same as class name
Rectangle()
{
    length=4;
    width=5;
}

//parametirized constructor
Rectangle(int a, int b)
{
    length=a;
    width=b;
}
    
    void putData() //default method
    {
        length = 10;
        width = 7;
    }
    int area() //method to calculate
    {
        return(length*width);
    }
}
