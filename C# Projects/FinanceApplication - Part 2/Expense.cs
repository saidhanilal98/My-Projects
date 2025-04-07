using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PROGPart2
{
    // Created a delegate method
    public delegate void Delle(string message);

    // Created a class for expense with inheritance to the home loan class
    class Expense : HomeLoan
    {
        // Generic collection used to store the expenses 
        // Used a specific generic collection which is called the dictonary generic collection 
        public static Dictionary<string, decimal> financialEstimate = new Dictionary<string, decimal>();
        static int houseExpenses;

        // Created a method to prompt the user for expenses 
        public void Expenses()
        {
            // Using the dictionary generic collection to input the expenses
            decimal Groceries = Read("\n1. Please enter your estimated monthly expenditure for groceries: R");
            decimal WaterandLights = Read("\n2. Please enter your estimated monthly expenditure for water and lights: R");
            decimal Travelcosts = Read("\n3. Please enter your estimated monthly expenditure for traveling: R");
            decimal Otherexpenses = Read("\n4. Please enter other expenses that you may have: R");

            financialEstimate.Add("Groceries", Groceries);
            financialEstimate.Add("Water and Lights", WaterandLights);
            financialEstimate.Add("Traveling", Travelcosts);
            financialEstimate.Add("Other", Otherexpenses);

            // Displaying the message 
            static decimal Read(string Message)
            {
                Console.Write(Message);
                return decimal.Parse(Console.ReadLine());
            }
        }

        // Created a method for home loan 
        public override void homeLoan(double monthlyIncome)
        {
            int choice;
            int ramount = 0;
            int pamount = 0;
            int tdeposit = 0;
            int intrate = 0;
            int repayPeriod = 0;


            // Prompts the user to choose between renting a property or buying a property
            Console.WriteLine("Please choose (1) Renting Accomodation or (2) Buying A Property: ");
            Console.WriteLine("(1) Renting Accomodation: ");
            Console.WriteLine("(2) Buying A Property: ");
            choice = Int32.Parse(Console.ReadLine());

            if (choice == 1)
            {
                /* if the user chooses option 1 which is to rent a propety 
                then they need to enter only their rental amount */
                Console.WriteLine("Please enter the rental amount: ");
                ramount = Int32.Parse(Console.ReadLine());
                financialEstimate.Add("Home Rent", Convert.ToDecimal(ramount));
            }
            if (choice == 2)
            {
                /* or otherwise if they choose option 2 which is to buy a property 
                 * then they need to enter the purchase price, total deposit, interest rate and the number of months
                 * to repay the home loan */
                Console.WriteLine("Please enter the purchase price of the property for the home loan: ");
                pamount = Int32.Parse(Console.ReadLine());

                Console.WriteLine("Please enter the total deposit for the home loan: ");
                tdeposit = Int32.Parse(Console.ReadLine());

                Console.WriteLine("Please enter the interest rate (%) for the home loan (without the % sign): ");
                intrate = Int32.Parse(Console.ReadLine()) / 100;

                Console.WriteLine("Please enter the number of months to repay (between 240 and 360) for the home loan: ");
                repayPeriod = Int32.Parse(Console.ReadLine());

                /* Calculation for the monthly home loan repayment for 
                 * buying a propety based on the values the user has entered */
                double P = pamount - tdeposit;
                double i = intrate;
                double n = repayPeriod / 12;

                // Formula calculation for monthly home loan repayment
                double A = P * (1 + (i * n));
                double monthlyRepayment = A / repayPeriod;

                financialEstimate.Add("Home Loan Repayment", Convert.ToDecimal(Math.Round(monthlyRepayment, 2)));

                /*Calculation for the loan to alert the user whether
                 * the loan is likely or unlikey to be approved */
                if (monthlyRepayment > monthlyIncome / 3)
                {
                    Console.WriteLine("\nThe approval of the home loan is Unlikely.\n");
                }
                else
                {
                    Console.WriteLine("\nThe approval of the home loan is Likely.\n");
                }
            }
        }

        public void ExpenseSum(double income)
        {
            // Instantiating the delegate for the expenses 
            Delle Mess = Delegate;
            decimal sum = 0;

            // Adding the values
            foreach (var x in financialEstimate)
            {
                sum += x.Value;
            }
            if (Convert.ToDouble(sum) > income)
            {
                Mess("\nbYour Expenses have exceeded 75% of your income");
            }
        }
        public static void Delegate(string message)
        {
            Console.WriteLine(message);
        }
    }
}

