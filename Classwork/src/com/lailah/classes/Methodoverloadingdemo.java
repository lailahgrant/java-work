/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program deom using method overloading from Room.java*/
package com.lailah.classes;

/**
 *
 * @author Fretty
 */
public class Methodoverloadingdemo {
    public static void main(String[] args) {
        Room obj = new Room(4);
    Room obj1= new Room(4,5);
     System.out.println("The area of a square is = "+(int)obj.area());
        System.out.println("The area of a rectangle is "+(int)obj1.area());
    }
       
}
