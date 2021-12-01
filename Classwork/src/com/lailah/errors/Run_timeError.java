/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.errors;

/**
 *
 * @author Fretty
 */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
public class Run_timeError {
    public static void main(String[] args) {
        int a=10, b=5, c=5;
        //to overcome run-time error, use try & catch. for those expressions that will cause an error
        try{
             int x=a/(b-c); //divided by zero
        System.out.println(x);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       
        int y=a/(b+c);
        System.out.println(y);
    }
}
