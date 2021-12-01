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
public class BankAccount1 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.putData();
        System.out.println("name is "+obj.name);
        System.out.println("Amount is "+obj.amount);
        System.out.println("Account is "+obj.account);
        System.out.println("Deposit is "+obj.add);
        System.out.println("Balance after depositing is "+obj.deposit());
        System.out.println("Withdrawn is "+obj.sub);
        System.out.println("Balance after withdraw is "+obj.withdraw());
    }
}
