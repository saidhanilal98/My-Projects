using PROGPOEPart1App;
using System;

namespace PROG6221
{
    // Main class
    class PROGPOEPart1App
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
            y.homeLoan();
            y.afterdeductionsIncome(x.getIncomegross(), x.getTax());
        }
    }
}








