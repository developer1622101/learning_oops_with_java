package com.example.myapp.BankAccountSystem;



public  class SavingsAccount extends BankAccount {   

    private final   int minimumBalance   = 1000     ;   

    public SavingsAccount( String  name   , int accountNumber ,  int  initialAmount  )  { 

        
        super(accountNumber,initialAmount) ;  

 
        this.name  = name ;  // attribute name  is public in the superclass , so it can  be accessed / modified directly, 

        // this.accountNumber   = accountNumber ; 
        //  attribute acccountNumber is private , so u cant directly access/ modify it.

        // we can  call the constructor , of  BankAccount  and pass this value to it.
    
        //  super(accountNumber) ;  // but this should be at the top.  

        if( initialAmount < minimumBalance ) {    
            throw new   IllegalArgumentException("Initial Amount must be atleast "  + minimumBalance )  ; 
        }  
    
    }  


    @Override
    public void withdraw(int amount) {  

        int balance  = getBalance() ; 

        int maxAmount = balance - minimumBalance ; 
        
        if(   amount >  maxAmount ) { 
            System.out.println("You cant withdraw that much amount,the max u can withdraw now is " + maxAmount );
        } 
        
        else {    
            super.withdraw(amount); 
            System.out.println("Amount of " + amount  + "done , remaining balance  is " +  getBalance()  );
        }
    } 
}