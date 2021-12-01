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
public class ElseifLadder {
    public static void main(String[] args) {
        int x;
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter your marks: ");
            x = obj.nextInt();
            if(x<50)
                System.out.println("Below average");
            else if(x>=50 && x<60)
                System.out.println("D grade");
            else if(x>=60 && x<70)
                System.out.println("C grade");  
            else if(x>=70 && x<80)
                System.out.println("B grade");
            else if(x>=80 && x<90)
                System.out.println("A grade");
            else if(x>=90 && x<100)
                System.out.println("A+ grade");
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }   
    }
}
