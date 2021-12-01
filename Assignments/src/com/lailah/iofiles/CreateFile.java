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
public class CreateFile {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\class notes\\NetBeansProjects\\Assignments\\src\\com\\lailah\\iofiles\\sitm.txt");
            String a = "SaiPali Institute of Technology and Management,, Welcomes you all";
            byte b[] = a.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Created successfully!!!!");
        }catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
}
