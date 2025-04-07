using PROGPart2;
using System;

namespace PROGPart2
{
    // Main class
    class PROGPOEPart2App
    {
        static void Main(string[] args)
        {
            // Using the income class to create an object 
            Income x = new Income();

            // Calling the method in the income class
            x.mIncome();

            // Using the expense class to create an object
            Expense y = new Expense();

            // Calling the methods from the expense class and income class
            y.Expenses();
            y.homeLoan(x.getIncomegross() - x.getTax());


            // Using the vehicle class to create an object
            Vehicle z = new Vehicle();

            // Calling the methods from the vehicle class
            z.BuyVehicle();
            z.ExpenseCalculation();
            y.ExpenseSum(x.getIncomegross() - x.getTax());
        }
    }
}









