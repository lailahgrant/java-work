/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo for exception handling*/
package com.lailah.errors;

/**
 *
 * @author Fretty
 */
public class ErrorHandling {
    public static void main(String[] args) {
        int a[] ={10,20,15,11,14,23,8};
        try{
            int x =a[10]/a[0];
            System.out.println("X is "+x);
        }
        catch(ArithmeticException ex)
        {
            System.err.println("Division by zero.....");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.err.println("Array index out of bound....");
        }
        catch(ArrayStoreException ex)
        {
            System.err.println("Wrong datatype....");
        }
        finally{
            int y = a[1]/a[0];
        System.out.println("Y = "+y);
        }
        
    }
}
