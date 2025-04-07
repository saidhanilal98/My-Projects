using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROGPart2
{
    // Created another separate class for income
    class Income
    {
        // Created an object for the error handling class
        ErrorHandling j = new ErrorHandling();

        // Using a private access modifier since its declared within a class only
        private double monthlyIncome;
        private double Tax;

        // Created a method for income
        public void mIncome()
        {
            // Prompts the user to enter values of their earnings 
            Console.Write("Please enter your gross monthly income: R");
            this.monthlyIncome = double.Parse(Console.ReadLine());

            Console.Write("Please enter the income tax amount: R");
            this.Tax = double.Parse(Console.ReadLine());
        }

        // Created a returning statement for tax and gross income in the form of getters
        public double getTax()
        {
            return Tax;
        }
        public double getIncomegross()
        {
            return monthlyIncome;
        }
    }
}

