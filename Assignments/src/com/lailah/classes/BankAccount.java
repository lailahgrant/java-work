/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.classes;

/**
 *
 * @author Fretty
 */
public class BankAccount {
    String name = new String();
    int amount;
    int add;
    int sub;
   String account = new String();
    int balance;
    
    void putData()
{
    name = "lailah";
    amount = 30000;
    account = "savings";
    add = 200;
    sub = 4000;
}
    int deposit()
    {
       balance = amount + add; 
       return(balance);
    }
    int withdraw()
    {
        balance = amount - sub;
        return(balance);
    }
        
    
}

