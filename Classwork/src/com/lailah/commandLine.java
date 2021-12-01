/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah;

/**
 *
 * @author Fretty
 */
public class commandLine {
    public static void main(String[] lailah)
    {
          int x,y,sum;
        x = Integer.parseInt(lailah[0]);
        y= Integer.parseInt(lailah[1]);
        sum = x+y;
        System.out.println("The addition of  "+x+" and "+y+" is = "+sum);
    }
}
