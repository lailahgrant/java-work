/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.datatypes;
import java.util.Scanner;
/**
 *
 * @author Fretty
 */
public class Intdemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter any integer number : ");
            int a = obj.nextInt();
            System.out.println("Entered number is "+a);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
