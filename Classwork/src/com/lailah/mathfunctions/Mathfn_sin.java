/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*programdemo using math functions*/
package com.lailah.mathfunctions;

/**
 *
 * @author Fretty
 */
import java.lang.Math;
public class Mathfn_sin {
    public static void main(String[] args) {
        System.out.println("sin(90)= "+Math.sin(90));
        System.out.println("sin(90) in degrees = "+(int)(Math.sin(90 * Math.PI/180)));
        System.out.println("cos(90)= "+Math.cos(90));
        System.out.println("cos(90) in degrees = "+(int)(Math.cos(90 * Math.PI/180)));
        System.out.println("tan(90)= "+Math.tan(90));
        System.out.println("tan(90) in degrees = "+(int)(Math.tan(90 * Math.PI/180)));
       // System.out.println("asin(0.8939) = "+Math.asin(0.8939));
        System.out.println("pow(5,5) = "+(int)Math.pow(5,5));
        System.out.println("sqrt(144) = "+(int)Math.sqrt(144));
        System.out.println("ceil(5.3 = "+(int)Math.ceil(5.3));
        System.out.println("floor(5.5) = "+(int)Math.floor(5.5));
        System.out.println("round(7.6) = "+Math.round(7.6));
        System.out.println("abs(-79) = "+Math.abs(-79));
        System.out.println("max(69,89) = "+Math.max(69, 89));
        System.out.println("min(78456,9634) = "+Math.min(78456, 9634));
    }
}
