/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah;
import java.util.Scanner;
/**
 *
 * @author Fretty
 */
public class Test3 {
    public static void main(String[] lailah)
    {
        Scanner obj = new Scanner(System.in);
        try
        {
            System.out.println("Enter first interger number");
            int x = obj.nextInt();
            
            System.out.println("Enter second interger number");
            int y = obj.nextInt();
            
            int result = x + y;
            System.out.println("The addition of "+x+" and "+y+" is " +result);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
