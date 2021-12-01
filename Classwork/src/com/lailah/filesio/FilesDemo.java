/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * program demo to create a file
 */
package com.lailah.filesio;
import java.io.*; //package for input/output files
/**
 *
 * @author Fretty
 */
public class FilesDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\class notes\\NetBeansProjects\\Classwork\\src\\com\\lailah\\filesio\\abc.txt");
            String s ="Kemigisa Lailah Grant,, HAppy to see you again";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        }catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
}
