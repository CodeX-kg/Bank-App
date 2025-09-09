 
package com.example;

 
public class BankAccount 
{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) 
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    //deposit money
    
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance +=amount;
            System.out.println("Deposited: "+ amount);
        }
        else
        {
            System.out.println("Deposit amount must be positive!");
        }
    }
    
    //withdraw money
    
    public void withdraw(double amount)
    {
        if(amount>0)
        {
            if(balance>=amount)
            {
                balance -= amount;
                System.out.println("Withdrawn:" + amount);
            }
            else
            {
                System.out.println("Insufficient balance!");
            }
        }
        else
        {
            System.out.println("Withdraw amount must be positive!");
        }
    }
    
    //get balance

    public double getBalance() {
        return balance;
    }
    
    // getaccount holder

    public String getAccountHolder() {
        return accountHolder;
    }
    
}
