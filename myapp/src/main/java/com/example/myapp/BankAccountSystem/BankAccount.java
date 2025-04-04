package com.example.myapp.BankAccountSystem;



public class BankAccount {
     
  
    private  int balance     ;  

    private  final  int accountNumber  ;   

    public   String  name ; 

     

    public BankAccount(  int accountNumber   ) {   

 
        this.accountNumber = accountNumber ; 

        this.balance = 0  ; 

    } 

    public BankAccount( int accountNumber  ,  int amount  ) { 
        this.accountNumber = accountNumber ; 
        this.balance = amount  ;
    } 

    public  void deposit(int a   ) {  
        balance += a ; 
    }

    public void withdraw(int a ) {  
 
        balance -= a ; 
    } 

    public  int getBalance()  { 
        return this.balance ; 
    }
    public int getAccountNumber() { 
        return this.accountNumber ; 
    }

}

