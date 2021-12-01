/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.trialswork;
import java.io.*;
import java.awt.*;

/**
 *
 * @author Lailah
 */
public class FilesioFrame extends Frame {
    //graphical input and output
    //student information containing rollno,name,marks
    
  //define window components
    TextField number,name,marks;
    Button enter,done;
    Label numlabel,namelabel,markslabel;
    
    DataOutputStream dos;
    
    //initializing the frame
    
    public FilesioFrame(){
        super("Create Student File");
    }
    
    //setup the window
    public void setup(){
        resize(400,200);
        setLayout(new GridLayout(4,2));
        
        //create the components of the frame
        number = new TextField(25);
        numlabel=new Label("Enter roll number");
        name=new TextField(25);
        namelabel=new Label("Enter Student's name");
        marks=new TextField(25);
        markslabel= new Label("Enter Marks");
        enter= new Button("Enter");
        done=new Button("Done");
        
        //add the components to the frame
        add(numlabel); add(number); add(namelabel); add(name); add(markslabel); add(marks); add(enter); add(done);
    
        try{
         dos.flush();
        dos.close();   
        } catch(IOException e){}
    }
    
   //processing the event
   /* public boolean action(Event event, Object o){
        if(event.get instanceof Button){
            if(event.arg.equals("Enter")){
                addRecord();
                return true;
            }
    }
        return super.action(event, o);
    }
    
    public boolean handleEvent(Event event){
        if(event.get instanceof Button){
            if(event.arg.equals("Done")){
                cleanup();
                System.exit(0);
                return true;
            }
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FilesioFrame student = new  FilesioFrame();
        student.setup();
        
    }
    
}
