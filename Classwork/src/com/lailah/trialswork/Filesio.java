/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.trialswork;

import java.io.*;

/**
 *
 * @author Lailah
 */
public class Filesio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // String s ="Lailah";
       
        byte city[] = {'K','A','M','P','A','L','A','\n','B','U','K','O','M','A','N','S','I','M','B','I','\n','K','A','L','E','R','W','E'};
        
        //declare and create input & output files
        
        //FileReader ins=null; //creates file stream ins object
        FileWriter outs=null; //creates file stream outs object
               
        try{
            
            //  File inFile = new File("D:\\class notes\\NetBeansProjects\\Classwork\\src\\com\\lailah\\trialswork\\input.dat"); //object infile of File class
       File outFile = new File("D:\\class notes\\NetBeansProjects\\Classwork\\src\\com\\lailah\\trialswork\\output.dat");  //object outFile of File class
        
            
          //  ins = new FileReader(inFile); //opens inFile
            outs = new FileWriter(outFile); //opens outFile
            
             //write data to the stream
            //outs.write(s);
            //outs.write(byte[] city);
                        
            //read and write till the end
            /*int ch;
            while((ch = ins.read()) != -1){
                outs.write(ch);
            }*/
        }catch(IOException i){
            System.out.println(i);
            System.exit(-1);
        }
        finally   //close files
        {
            try{
              //  ins.close();
                outs.close();
            }catch(IOException i){
                
            }
        }
    }
    
}
