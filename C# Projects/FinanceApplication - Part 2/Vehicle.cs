using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROGPart2
{
    // Created a class for vehicle with inheritance to the expense class
    class Vehicle : Expense
    {
        // Created a method for vehicle
        public void BuyVehicle()
        {
            // Prompts the user to enter their vehicle financing requirements
            Console.WriteLine("Would you like to buy a vehicle? Y/N");
            string choice = Console.ReadLine();

            // Using an if statement to choose between buying a vehicle (Y) or not (N)
            if (choice == "Y" || choice == "y")
            {
                Console.Write("1. Please enter the model of the vehicle you would like to buy: ");
                string vehicleModel = Console.ReadLine();
                Console.Write("\n2. Please enter the make of the vehicle you would like to buy: ");
                string vehicleMake = Console.ReadLine();
                Console.Write("\n3. Please enter the purchase price of the vehicle: ");
                double purchasePrice = Convert.ToDouble(Console.ReadLine());
                Console.Write("\n4. Please enter the total deposit of the vehicle: ");
                double totalDeposit = Convert.ToDouble(Console.ReadLine());
                Console.Write("\n5. Please enter the interest rate of the vehicle(%): ");
                double interestRate = Convert.ToDouble(Console.ReadLine()) / 100;
                Console.Write("\n6. Please enter the price of the estimated insurance premium of the vehicle: ");
                double estimatedInsurance = Convert.ToDouble(Console.ReadLine());

                // Displaying the vehicle report according to what the user has entered 
                Console.WriteLine("\n\n*********************VEHICLE REPORT************************");
                Console.WriteLine("------------------------------------------------------------");
                Console.WriteLine("The vehicle model: " + vehicleModel);
                Console.WriteLine("The vehicle make: " + vehicleMake);
                Console.WriteLine("The purchase price of the vehicle: R" + purchasePrice);
                Console.WriteLine("The total deposit for the vehicle: R" + totalDeposit);
                Console.WriteLine("The interest rate for the vehicle: R" + interestRate);
                Console.WriteLine("The estimated insurance for the vehicle: R" + estimatedInsurance);
                Console.WriteLine("------------------------------------------------------------");

                // Calculation for the vehicle loan
                double vehiclepricePerMonth = Math.Round(estimatedInsurance + (purchasePrice - totalDeposit) * ((interestRate / 12) * Math.Pow((1 + (interestRate / 12)), 60)) / (Math.Pow((1 + (interestRate / 12)), 60) - 1), 2);
                financialEstimate.Add("Vehicle Monthly Payments", Convert.ToDecimal(vehiclepricePerMonth));
            }
        }


        // Created a method to calculate the total monthly costs for buying a vehicle6
        public void ExpenseCalculation()
        {
            // Displaying a report for the expenses in descending order
            Console.WriteLine("\n\n****************EXPENSES IN DESCENDING ORDER*****************");
            Console.WriteLine("------------------------------------------------------------");
            Console.WriteLine(string.Join("\n", financialEstimate.OrderByDescending(x => x.Value).Select(x => $"{x.Key}: R{x.Value}")));
            Console.WriteLine("------------------------------------------------------------\n");
        }
    }
}



