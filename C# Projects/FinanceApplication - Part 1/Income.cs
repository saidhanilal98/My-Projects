using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROGPOEPart1App
{
    // Created another separate class for income
    class Income
    {
        // Created an object for the error handling class
        ErrorHandling j = new ErrorHandling();
        
        // Using a private access modifier since its declared within a class only
        private double monthlyIncome;
        private double Tax;
        public void mIncome()
        {
            // Prompts the user to enter values of their earnings 
            Console.Write("Please enter your gross monthly income: R");
            int monthlyGross = j.ErrorHandling(Console.ReadLine());

            Console.Write("Please enter the income tax amount: R");
            int tax = Int32.Parse(Console.ReadLine());
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
 
