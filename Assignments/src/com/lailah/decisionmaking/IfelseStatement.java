/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.decisionmaking;
import java.util.Scanner;
/**
 *
 * @author Fretty
 */
public class IfelseStatement {
    public static void main(String[] args) {
        int x;
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter any integer number");
            x= obj.nextInt();
            if(x % 2 == 0)
            System.out.println(x+" is an even number");
            else
                System.out.println(x+" is an odd number");
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
