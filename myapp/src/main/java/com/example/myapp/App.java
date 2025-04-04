package com.example.myapp;


 
import com.example.myapp.BankAccountSystem.BankAccount;
import com.example.myapp.BankAccountSystem.SavingsAccount;










public class App 
{
    public static void main( String[] args )
    {
     
        
   BankAccount  account1  = new BankAccount(123455 , 3333)   ;

  // BankAccount account2 = new  SavingsAccount( "Praveen" ,  23323 ,   0  ) ;   

   SavingsAccount acccount3 = new SavingsAccount("praveen2", 333,  1200 ) ; 

   acccount3.withdraw(344) ; 

   acccount3.withdraw(200) ;
   
   int account1Balance   = account1.getBalance(); 

   System.out.println(account1Balance); 
 
 }  


}
