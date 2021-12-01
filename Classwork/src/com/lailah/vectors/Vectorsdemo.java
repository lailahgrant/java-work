/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo for vector and getting results @ runtime,, commandline arguments*/
package com.lailah.vectors;
import java.util.Vector; //class is in capital @ start eg Vector
/**
 *
 * @author Fretty
 */
public class Vectorsdemo {
    public static void main(String[] args) {
        Vector list = new Vector();
        int length = args.length;
        for(int i=0; i<length; i++)
        {
            list.addElement(args[i]); 
        }
             
        //copy elements from vector to arrays
        //ist create the array
        String s1[] = new String[length];//use same size as the that of vector
        list.copyInto(s1);
        
        //print elements
        System.out.println("The contents are ");
        for(String i:s1)
            System.out.println(i);
    }
}
