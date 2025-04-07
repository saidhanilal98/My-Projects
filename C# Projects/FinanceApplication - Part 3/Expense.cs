using System;

namespace PROGPOEPart1App
{
    // Created a class for expense
    class Expense : HomeLoan
    {
        // Using an array to store the expenses
        static int[] expArray = new int[5];
        static int houseExpenses;

        // Created a method to prompt the user for expenses and store it in an array
        public void Expenses()
        {
            Console.Write("Please enter the estimated monthly expenditures for groceries: \n1. Groceries: R");
            int Groceries = int.Parse(Console.ReadLine());
            expArray[0] = Groceries;

            Console.Write("Please enter the estimated monthly expenditure for water and lights: \n2. Water and lights: R");
            int Waterandlights = int.Parse(Console.ReadLine());
            expArray[1] = Waterandlights;


            Console.Write("Please enter the estimated monthly expenditure for travel costs: \n3. Travel costs (including petrol): R");
            int Travelcosts = int.Parse(Console.ReadLine());
            expArray[2] = Travelcosts;


            Console.Write("Please enter the estimated monthly expenditure for cell phone and telephone: \n4. Cell phone and telephone: R");
            int Cellandtelephone = int.Parse(Console.ReadLine());
            expArray[3] = Cellandtelephone;


            Console.Write("Please enter the estimated monthly expenditure for other expenses: \n5. Other expenses: R");
            int Otherexpenses = int.Parse(Console.ReadLine());
            expArray[4] = Otherexpenses;
        }

        // Created a method for home loan 
        public override void homeLoan()
        {
            int choice;
            int ramount = 0;
            int pamount = 0;
            int tdeposit = 0;
            int intrate = 0;
            int repayPeriod = 0;

            // Created a string array to store the monthly house expenses
            string[] expenses = { "Groceries", "Water and lights", "Travel costs (including petrol)", "Cellphone and telephone", "Other expenses" };

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

            }
            else
            {
                /* or otherwise if they choose option 2 which is to buy a property 
                 * then they need to enter the purchase price, total deposit, interest rate and the number of months
                 * to repay the home loan */
                Console.WriteLine("Please enter the purchase price of the property for the home loan: ");
                pamount = Int32.Parse(Console.ReadLine());

                Console.WriteLine("Please enter the total deposit for the home loan: ");
                tdeposit = Int32.Parse(Console.ReadLine());

                Console.WriteLine("Please enter the interest rate (%) for the home loan (without the % sign): ");
                intrate = Int32.Parse(Console.ReadLine())/ 100;

                Console.WriteLine("Please enter the number of months to repay (between 240 and 360) for the home loan: ");
                repayPeriod = Int32.Parse(Console.ReadLine());

                /* Calculation for the monthly home loan repayment for 
                 * buying a propety based on the values the user has entered */
                
                // Declaring variables for the monthly home loan calculation
                int propertyPrice = 0;
                int monthlyIncome = 0;
             
                double P = propertyPrice - tdeposit;
                double i = intrate;
                double n = repayPeriod / 12;

                // Formula calculation for monthly home loan repayment
                double A = P * (1 + (i * n));
                double monthlyRepayment = A / repayPeriod;

                /*Calculation for the loan to alert the user whether
                 * the loan is likely or unlikey to be approved */
                if (monthlyRepayment > monthlyIncome / 3)
                {
                    Console.WriteLine("\nThe approval of the home loan is Unlikely of getting approved.");
                }
                else
                {
                    Console.WriteLine("\nThe approval of the home loan is Likely of getting approved.");
                }
            }
        }

        /*Created a method to calculate the available money
         * after all the specified deductions */
        public void afterdeductionsIncome(double monthlyIncome, double tax)
        {
            double Total = 0;

            // Created a for loop to calculate all the expenses together
            for (int i = 0; i < expArray.Length; i++)
            {
                Total += expArray[i];
            }
            
            // Formula calculation for the monthly net income after all the deductions
            double afterdeductionsIncome = (monthlyIncome - (tax + houseExpenses + Total));

            Console.WriteLine("Thank you for using our console application for your financial calculations and needs:)");
        }
    }
}
