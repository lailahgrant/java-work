/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*inheritance of room1 & room2*/
package com.lailah.classes;

/**
 *
 * @author Fretty
 */
public class Room3 {
    public static void main(String[] args) {
        Room2 obj = new Room2(2,4,6);
        System.out.println("Area of a room is "+obj.area());
        System.out.println("Volume of a room is "+obj.volume());
    }
}
