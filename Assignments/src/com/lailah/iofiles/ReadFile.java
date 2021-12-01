/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.iofiles;
import java.io.*;
/**
 *
 * @author Fretty
 */
public class ReadFile {
    public static void main(String[] args) {
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\Fretty\\Documents\\NetBeansProjects\\Assignments\\src\\com\\lailah\\iofiles\\sitm.txt");
            int i=0;
            while((i=fin.read()) != -1)
            {
                System.out.println((char)i);
            }
            System.out.println();
        }catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
}
