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
public class Test4 {
    public static void main(String[] lailah)
    {
        Scanner obj = new Scanner(System.in);
        try
        {
            System.out.println("Enter first real number");
            float x = obj.nextFloat();
            
            System.out.println("Enter second real number");
            float y = obj.nextFloat();
            
            float result=x+y;
            
            System.out.println("The addition of "+x+"  and "+y+" is "+result);
        }   
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
