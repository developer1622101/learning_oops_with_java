# learning_oops_with_java
 
# 4 April 

## Concepts applied 
   -  Defining classes , adding attributes and methods to the class.   
   -  Class BankAccount 
        -  Attributes 
            -  Public  : name 
            -  Private : accountNumber ,  balance
        -  Defined two constructors to handle the cases  , when only accountNumber is provided and another when accountNumber and initialAmount are provided.
   -  Inheritance   
        -  SavingsAccount extends BankAccount 
            - attribute : minimumBalance 
            - Constructor 
                -  Constructor cant access the private attributes of superclass directly. 
                -  When defining the constructor  super(private attributes ) must be used at the first line. 
                -  Public attributes of superclass can be accessed directly using this.name_of_attribute. 
                -  Public methods can be accessed directly. 
            - Overriding methods 
                - Withdraw method is overridden. 
                   -  It will check that after withdrawal minimumBalance is maintained.
                      -  If yes , then withdrawl method  of superclass is called using  super.withdrawal(amount).
                      -  If not it returns a statement , specifying  max. amount that can be withdrawn. 