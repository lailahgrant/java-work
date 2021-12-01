/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo using factorial of a number*/
package com.lailah.looping;
import java.util.Scanner;
/**
 *
 * @author Fretty
 */
public class Forfactorial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int fact=1;
        try{
            System.out.println("Enter any integer number:");
            int n = obj.nextInt();
            for(int i=1; i<=n; i++)
                fact *=i;
            System.out.println("The factorial of a "+n+" is = "+fact);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
