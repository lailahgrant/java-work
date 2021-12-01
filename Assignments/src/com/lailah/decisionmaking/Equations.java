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
public class Equations {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter 1st integer number ");
            int a = obj.nextInt();
             System.out.println("Enter 2nd integer number ");
            int b = obj.nextInt();
             System.out.println("Enter3rd integer number ");
            int c = obj.nextInt();
             System.out.println("Enter 4th integer number ");
            int d = obj.nextInt();
             System.out.println("Enter 6th integer number ");
            int m = obj.nextInt();
             System.out.println("Enter 7th integer number ");
            int n = obj.nextInt();
            int x1 =((m*d)-(b*n) / (a*d)-(c*d));
            int x2 = ((n*a)-(m*c) / (a*d)-(c*d));
            if(((a*d)-(c*d)) == 0)
            {
                System.out.println("undefined error");
            }
            else{
                
                System.out.println("value of x1 is = "+x1+" and value of x2 is = "+x2);
            }
    }catch(Exception ex){
        ex.printStackTrace();
    }
}
}