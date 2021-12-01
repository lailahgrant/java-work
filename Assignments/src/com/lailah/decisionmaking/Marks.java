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
public class Marks {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter mathmatics marks: ");
            int m = obj.nextInt();
            System.out.println("Enter Physics marks: ");
            int p = obj.nextInt();
            System.out.println("Enter Chemistry marks: ");
            int c = obj.nextInt();
            int total = m+p+c;
            int tot= m+p;
            if((m>=60 && p>=50 && c>=40) && (total>=200 || tot>=150))
                {
                    System.out.println("Candidate is eligible");
                }else 
            {
                System.out.println("candidate not eligible");
            }
            }catch(Exception ex){
            ex.printStackTrace();
        }
        }
    }

