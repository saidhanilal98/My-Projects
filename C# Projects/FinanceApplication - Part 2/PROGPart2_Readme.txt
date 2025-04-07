Instructions on how to compile and run the software:

1. Type out a long or short console application program. 
2. Click on the top that says 'Build'.
3. Finally, click on the green play button to run the program or click on the top that says 'Debug' and scroll down to where it says 'Start Without Debugging'.

Brief explaination of what improvements I have made based on my lecturer's feedback:
1. I needed to improve my app functionality by making an improvement on my home loan calculation as it was coded but never displayed in the ouput.
Improvement 1:
In my expense class after the formula double A = P * (1 + (i * n)); and double monthlyRepayment = A / repayPeriod; i added a formula using Math.Round, like the following:
financialEstimate.Add("Home Loan Repayment", Convert.ToDecimal(Math.Round(monthlyRepayment, 2))); and when i ran the program it displayed the home loan calculation.

2. I needed to improve my app funtionality by making an improvement on available money as it was coded but not diplayed in the output.
Improvement 2:
I did not call my income class in the main class that is why it never displayed and it amounted to the number 0 even if the user entered a value.

3. I needed to use advanced C# features in my assignment that i have not implemented in my program.
Improvement 3:
I do not recall doing delegates in class, as i used it in part 2 as that was one of the requirements to implement in my program. As i created a method that 
notifies the user when their expenses have exceeded 75% of their income like the following:       
Delle Mess = Delegate;
decimal sum = 0;
foreach (var x in financialEstimate)
{
sum += x.Value;
}
if (Convert.ToDouble(sum) > income)
{
Mess("\nbYour Expenses have exceeded 75% of your income");

Brief explaination of how I coded my program with the Part 1 and 2 assignment requirements:

Expense.cs
I created an expense class to display all the expenses, the expenses are now stored in a generic collection called the dictionary: 
public static Dictionary<string, decimal> financialEstimate = new Dictionary<string, decimal>();
static int houseExpenses;
I used a delegate method that helps initiate it to notify the user that their expenses have exceeded the 75% of their income.
I also created a method to prompt the user to enter each expense catergory for example water, lights, groceries etc. 
In the expense class I prompt the user to choose between the option of renting a property or buying a property. I declared an if statement, 
if the user chooses option 1 which is to rent a propety then the user only needs to enter their rental amount or otherwise 
if the user chooses option 2 which is to buy a property 
then they need to enter the purchase price, total deposit, interest rate and the number of months to repay the home loan.

The assignment required the program to calculate the monthly home loan repayment. I made use of the formula A = P * (1 + (i * n)) to calculate it, which is based on the values
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
3. Vehicle z = new Vehicle();

Vehicle.cs
I have created another class called Vehicle.cs and created a method called BuyVehicle() where i prompt the user to enter the following:
a. Model and make.
b. Purchase price.
c. Total deposit.
d. Interest rate (percentage).
e. Estimated insurance premium.

I also did a calculation that calculated the vehicle home loan.I created a method called ExpenseCalculation() that calculated the total monthly costs for buying
a vehicle and afterwards i displayed a report showing the expenses in descending order according to what the user has entered.

