Instructions on how to compile and run the software:

1. Type out a long or short console application program. 
2. Click on the top that says 'Build'.
3. Finally, click on the green play button to run the program or click on the top that says 'Debug' and scroll down to where it says 'Start Without Debugging'.


Brief explaination of how I coded my program with the assignment requirements:

Expense.cs
I created an expense class to display all the expenses, the expenses are stored in an array like the following: 
static int[] expArray = new int[5]. 
I also created a method to prompt the user to enter each expense catergory for example water, lights, groceries etc. 
In the expense class I prompt the user to choose between the option of renting a property or buying a property. I declared an if statement, 
if the user chooses option 1 which is to rent a propety then the user only needs to enter their rental amount or otherwise 
if the user chooses option 2 which is to buy a property 
then they need to enter the purchase price, total deposit, interest rate and the number of months to repay the home loan.

The assignement required the program to calculate the monthly home loan repayment. I made use of the formula A = P * (1 + (i * n)) to calculate it, which is based on the values
that the user has entered when buying a property.
The assignment also required if the monthly home loan repayment is more than a third of the user’s gross monthly income the program shall alert 
the user that the approval of the home loan is unlikely or likely. I made use of an if statement, like the following:
if (monthlyRepayment > monthlyIncome / 3)
{
Console.WriteLine("\nThe approval of the home loan is Unlikely of getting approved.");
}
else
{
Console.WriteLine("\nThe approval of the home loan is Likely of getting approved.");

I created another method to store the available monthly money after deductions by creating a for loop that calculates all the expenses together.

HomeLoan.cs
I created a home loan class as the assignment required me to create an abstract class for the expenses where the home loan class can be derived.

Income.cs
I created an income class which allows the user to enter their earnings. I made use of private access modifiers to store the users monthly income and tax deductions 
as the private modifiers are declared a class only. I created a returning statement in the income class for the tax deductions and the users monthly income in the form of getters.

ErrorHandling.cs

I created a class to implement the error handling of the program. If the user does not enter a value and just continues to press enter, an error will occur. Therefore, 
I made use of a while loop for renting or buying a property.

Program.cs
In each class i created an object like the following: 
1. Income x = new Income();
2. Expense y = new Expense();

I called those methods that were in the expense class and income class to the main class.
At the end of the program which is the output, i have coded a small message to tell the user thank you for using the program, like the following:
Console.WriteLine("Thank you for using our console application for your financial calculations and needs!");

