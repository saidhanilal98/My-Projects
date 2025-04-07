Instructions on how to compile and run the software:

1. Type out a long or short console application program. 
2. Click on the top that says 'Build'.
3. Finally, click on the green play button to run the program or click on the top that says 'Debug' and scroll down to where it says 'Start Without Debugging'.

I got 100% for PROG6221 Part 2 of my assignment.

MainWindow.xaml
Is the full design of Windows Presentation Foundation(WPF).

MainWindow.xaml.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ProgammingPOEPart3_ST10090106
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    /// Shows all the coding in steps according to the pages/tabs
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        /* The start button which takes the user to the expenses page to enter 
         * all their necessary expense costs.*/
        private void BtnClickStartButton(object sender, RoutedEventArgs e)
        {
            myTabControl.SelectedIndex = 1;
        }

        

        // Declaring an array for all the specified expenses
        int[] Expenses = new int[6];


        // Declaring the variables for the expenses
        int Monthlygross;
        int Monthlytax;
        int Groceries;
        int WaterandLights;
        int TravelingCosts;
        int OtherExpenses;

        // Created a button for the expenses 
        private void BtnClickExpenses(object sender, RoutedEventArgs e)
        {

        // Using if statements for error handling 
        /* Validation for the user input to ensure that the user has entered all the
         * required values and has not left any empty spaces and also if the user has entered and invalid value
         * it will prompt the user to please try again. */

        if (this.GrossMonthly.Text == null)
        {

        this.GrossMonthly.Text = ("Please try again");

        if (this.IncomeTax.Text == null)
        {
                    
        this.IncomeTax.Text = ("Please try again");

        if (this.MonthlyGroceries.Text == null)
        {
                        
        this.MonthlyGroceries.Text = ("Please try again");

        if (this.MonthlyWL.Text == null)
        {

        this.MonthlyWL.Text = ("Please try again");

        if (this.MonthlyTraveling.Text == null)
        {
                                
        this.MonthlyTraveling.Text = ("Please try again");

        if (this.MonthlyOtherExpenses.Text == null)
        {
                                   
        this.MonthlyOtherExpenses.Text = ("Please try again");

                 }
              }
           }
        }
    }
}
        else
            
            {
               // Storing all the expenses into an array and using if statements
                Expenses[0] = Int32.Parse(this.GrossMonthly.Text);
                Monthlygross = Expenses[0];

                Expenses[1] = Int32.Parse(this.IncomeTax.Text);
                Monthlytax = Expenses[1];
                
                Expenses[2] = Int32.Parse(this.MonthlyGroceries.Text);
                Groceries = Expenses[2];

                Expenses[3] = Int32.Parse(this.MonthlyWL.Text);
                WaterandLights = Expenses[3];

                Expenses[4] = Int32.Parse(this.MonthlyTraveling.Text);
                TravelingCosts = Expenses[4];

                Expenses[5] = Int32.Parse(this.MonthlyOtherExpenses.Text);
                OtherExpenses = Expenses[5];

                myTabControl.SelectedIndex = 2;
            }
        }
      
        /* The menu pages allows the user to choose which page to go on 
         * depending on the button the user enteres and each button has a different 
         * purpose to prompt the user to enter their specific details */

        // Created a rental button in the menu page so that the user has a choice to rent and not buy a property.
        public void BtnClickRental(object sender, RoutedEventArgs e) => myTabControl.SelectedIndex = 3;

        // Created a property button in the menu page so that the user has a choice to buy a property.
        private void BtnClickProperty(object sender, RoutedEventArgs e) => myTabControl.SelectedIndex = 4;

        // Created a vehicle button in the menu page so that the user has a choice to also buy vehicle.
        private void BtnClickVehicle(object sender, RoutedEventArgs e) => myTabControl.SelectedIndex = 5;

        /* Created a balance button in the menu page so that the user can check how much money 
         * is available in their account after all their deductions.*/
        private void BtnClickBalance(object sender, RoutedEventArgs e) => myTabControl.SelectedIndex = 6;

        /* Created a savings button in the menu page so that the user can save a specific amount
         * by a certain date for a specified reason */
        private void BtnClickSavings(object sender, RoutedEventArgs e) => myTabControl.SelectedIndex = 7;

        /* The rental page allows the user to enter thier rental amount if they 
         * choose to rent a property instead of buying a property */

        
        // The property page
        // Generic collection storing the property variables and declaring a list.
        List<int> Propertyinput = new List<int>();

        // Delaring the property variables
        int propertypurchasePrice;
        int proprtytotalDeposit;
        int propertyinterestRate;
        int propertyperiodMonths;

        // Declaring The monthly Repayments for the home loan
        int MonthlyRepayments = 0;

        private void BtnClickCalHomeLoan(object sender, RoutedEventArgs e)
        {
            // Storing the variables from the text boxes into a list
            propertypurchasePrice = Int32.Parse(this.PurchasePrice_TextBox.Text);
            Propertyinput.Add(propertypurchasePrice);

            proprtytotalDeposit = Int32.Parse(this.PropertyDeposit_Textbox.Text);
            Propertyinput.Add(proprtytotalDeposit);

            propertyinterestRate = Int32.Parse(this.PropertyInterestRate_Textbox.Text);
            propertyinterestRate = propertyinterestRate/100;
            Propertyinput.Add(propertyinterestRate);

            propertyperiodMonths = Int32.Parse(this.RepaymentMonths_Textbox.Text);
            Propertyinput.Add(propertyperiodMonths);


            // Formula calculation for the monthly home loan repayment
            // Calculation for the loan to alert the user whether the loan is likely or unlikey to be approved.
            Propertyinput[0] = Propertyinput[1] * 1 + (Propertyinput[2] * Propertyinput[3]);

            MonthlyRepayments = Propertyinput[1]/12;

            if (MonthlyRepayments < (1/3) * (Propertyinput[0]))
            {
                RepaymentHomeLoan_DisplayedTextbox.Text = MonthlyRepayments.ToString();
                RepaymentHomeLoan_DisplayedTextbox.Text = "The approval of the home loan is Unlikely of getting approved.";

            }
            else
            {
                RepaymentHomeLoan_DisplayedTextbox.Text = MonthlyRepayments.ToString();

            }
        }

        
        // Declaring the variables for vehicle
        string VehicleMake;
        string VehicleModel;

        int motorvehiclePurchasePrice;
        int vehicleTotalDeposit;
        int vehicleInterestRate;
        int vehicleInsurancePremium;
        int Totalmonthlycost;
        int totalInterest;
        int monthlyInterest;
        int monthlyInstallment;


        // Using a generic collection for the vehicle declrations. 
        List<String> vehicleMake_vehicleModel = new List<String>();

        List<int> vehicleExpenses = new List<int>();

        List<int> monthlyCost = new List<int>(); 

        // Created a button for vehicle so that it displays a full vehicle report on what the user has entered.
        private void BtnClickCalVehicle(object sender, RoutedEventArgs e)
        {

            // Storing the variables from the text boxes into list using generic collection 
            VehicleMake = this.vehicleMake.Text;
            vehicleMake_vehicleModel.Add(VehicleMake);

            VehicleModel = this.vehicleModel.Text;
            vehicleMake_vehicleModel.Add(VehicleModel);

            motorvehiclePurchasePrice = Int32.Parse(this.vehiclepp.Text);
            vehicleExpenses.Add(motorvehiclePurchasePrice);

            vehicleTotalDeposit = Int32.Parse(this.vehicletp.Text);
            vehicleExpenses.Add(vehicleTotalDeposit);

            vehicleInterestRate = Int32.Parse(this.vehicleir.Text);
            vehicleInterestRate = vehicleInterestRate/100;
            vehicleExpenses.Add(vehicleInterestRate);

            vehicleInsurancePremium = Int32.Parse(this.vehicleip.Text);
            vehicleExpenses.Add(vehicleInsurancePremium);

            /* Calculation for the the total monthly cost of buying the vehicle and 
             * that all the vehicles will be repaid over a period of five years. */
            totalInterest = vehicleInterestRate/100 * motorvehiclePurchasePrice*5;
            monthlyCost.Add(totalInterest);

            monthlyInterest = totalInterest /5*12;
            monthlyCost.Add(monthlyInterest);

            monthlyInstallment = (motorvehiclePurchasePrice + totalInterest) /5*12;
            monthlyCost.Add(monthlyInstallment);

            Totalmonthlycost = vehicleInsurancePremium + monthlyInstallment;

            /* The software shall notify the user when the total expenses
             * exceed 75% of their income.*/
            int totExpenses = (75/100) * Monthlygross;

            // Using an if statement to display the vehicle report 
            if ((monthlyCost[2]) > totExpenses)
            {

                vehicleReport.Text = "********************VEHICLE REPORT********************\n"
                                + "\nThe vehicle make: " + VehicleMake
                                + "\nThe vehicle model: " + VehicleModel
                                + "\nThe purchase price of the vehicle: " + "R " + motorvehiclePurchasePrice.ToString()
                                + "\nThe total deposit for the vehicle: " + "R " + vehicleTotalDeposit.ToString()
                                + "\nThe interest rate(%) for the vehicle: " + vehicleInterestRate.ToString() + "%"
                                + "\nThe estimated insurance premium for the vehicle: " + "R " + vehicleInsurancePremium.ToString()
                                + "\nThe total monthly cost for the vehicle:" + "R " + monthlyCost[2].ToString();

            }
            else
            {

                vehicleReport.Text = "********************VEHICLE REPORT********************\n"
                                + "\nThe vehicle make:" + VehicleMake
                                + "\nThe vehicle model:" + VehicleModel
                                + "\nThe purchase price of the vehicle:" + "R " + motorvehiclePurchasePrice.ToString()
                                + "\nThe total deposit for the vehicle:" + "R " + vehicleTotalDeposit.ToString()
                                + "\nThe interest rate(%) for the vehicle:" + vehicleInterestRate.ToString() + "%"
                                + "\nThe estimated insurance premium for the vehicle:" + "R " + vehicleInsurancePremium.ToString()
                                + "\nThe total monthly cost for the vehicle:" + "R " + monthlyCost[2].ToString();
            }

        }



        /*Declaring the variables to store the values for all the available money 
         * that is left after all the specified deductions.*/
        int AvailableMoney;

        // Created a button so that the user can click it and displays the availabe money to the user.
        private void BtnClickCalBalance(object sender, RoutedEventArgs e)
        {
            //Calculation for the available money that is left.
            int expenses = Monthlytax + Groceries + WaterandLights + TravelingCosts + OtherExpenses;
            AvailableMoney = Monthlygross - expenses;
            AvailableMoney_Displayed.Text = AvailableMoney.ToString();
        }

        // Option 1 choosen from the assignment 
        /* The user shall be able to choose to save up a specified amount by 
         * a certain date for a specified reason.
         * Then, given the interest rate that will be earned on the savings.
         * Calculate how much the monthly saving should be to reach the goal. */

        // Declaring the variables for the savings page
        int savingsAmount;
        int interestAmount;
        int savingsPeriod;
        int totalsavingsAmount;
        int monthlysavingsAmount;

        // Creating a list to store all the values 
        List<int> values = new List<int>();
        private void BtnClickCalSavings(object sender, RoutedEventArgs e)
        {
            // Storing the values that the user has enetered for their savings in a List
            savingsAmount = Int32.Parse(this.Amount_Saved.Text);
            values.Add(savingsAmount);

            interestAmount = Int32.Parse(this.InterestRate_Saved.Text);
            interestAmount = interestAmount/100;
            values.Add(interestAmount);

            savingsPeriod = Int32.Parse(this.Period_Years.Text);
            values.Add(savingsPeriod);

            // Calculation for the total savings amount 
            totalsavingsAmount = savingsAmount * interestAmount * savingsPeriod + savingsAmount;
            values.Add(totalsavingsAmount);
            TotalSavings_Displayed.Text = totalsavingsAmount.ToString();

            // Calculation for the monthly savings amount 
            monthlysavingsAmount = savingsAmount * interestAmount * savingsPeriod/12;
            values.Add(monthlysavingsAmount);
            MonthlySavings_Displayed.Text = monthlysavingsAmount.ToString();

            /* At the end of the savings page there is a message that says 
             * Thank you for using BeAccurate Finance Application!*/

        }

    }
}

How to use the application:
*When running the application, you will need to expand the whole presentation because everything seems zoomed in 
if its not expanded and some of the user inputs do not show too if the presentation is not expanded, I have tried to fix it but could not find a way.

The Home Page:
The user will be able to view the home page that will welcome the user to BeAccurate Financial Application, 
below that there is a button where the user will enter or click to continue, and they will be directed to the Expenses page.
When the user wants to enter their details, they can hover over each textbox, and it will highlight it in blue showing that it is ready for the user to enter their details.

The Expenses Page:
Once the user is on this page, the user will have to enter their daily expenses that they have and once they have done 
that there is a button at the bottom of that page where they will click or enter to continue to the Menu page. 
When the user wants to enter their details, they can hover over each textbox, and it will highlight it in blue showing that it is ready for the user to enter their details.

The Menu Page:
In the menu page there is five buttons called “Rental”, “Property”, “Vehicle”, “Balance” and “Savings”. 
Each of these buttons are for the user to choose which page they would like to be directed too. 
Each button will take the user to their desired page for example, if the user clicks on the “Property” button then the 
application directs the user to that specific page. 
When the user wants to enter their details, they can hover over each textbox, and it will highlight it in blue showing that it is ready for the user to enter their details.

The Rental Page:
If the user clicks on the rental button or the rental tab on the top, the user will be directed to that 
page and will be asked to enter the rental amount if they are planning to rent a property. 
If they are not they can skip that page and continue. When the user wants to enter their details, they can hover over each textbox, 
and it will highlight it in blue showing that it is ready for the user to enter their details.

The Property Page:
If the user clicks on the property button or the property tab on the top(only if the user would want to buy a property) 
the user will be directed to that page and will be asked to enter the purchase price of the property if they want to buy, 
the total deposit, the interest rate, and the number of months (between 240 and 360) for the home loan. 
The user will then be able to click a button called “Calculate Home Loan Monthly Repayments” and 
it will display the amount below the button. When the user wants to enter their details, 
hey can hover over each textbox, and it will highlight it in blue showing that it is ready for the user to enter their details.

The Vehicle Page:
If the user clicks on the vehicle button or the vehicle tab on the top(only if the user chooses to buy a vehicle) 
the user will be directed to that page and will be asked to enter the vehicle model, vehicle make, the purchase price, 
the total deposit, the interest rate, and the price of the estimated insurance premium. 
The user will then be able to click the button called “Vehicle Report ” and will display the full report depending on what the user has entered.
When the user wants to enter their details, they can hover over each textbox, and it will highlight it in blue showing that it is ready for the user to enter their details.

The Balance Page:
If the user clicks on the balance button or the balance tab on the top, the user will be directed to that page and 
the user will be able to click the button called “Calculate Your Available Money” and the amount will be displayed depending on 
what the user has entered for expenses, whether to buy a property or a vehicle. When the user wants to enter their details, 
they can hover over each textbox, and it will highlight it in blue showing that it is ready for the user to enter their details.

The Savings Page:
If the user clicks on the savings button or the savings tab on the top(only if the user chooses to save) 
the user will be directed to that page and will be asked to enter a specific amount that they would like to save, 
the interest rate and the period it will take to reach their goal. The user will be able to click the button called 
“Calculate Your Total Savings And Monthly Savings Amount” and the amount will be displayed for both total and monthly savings at the bottom. 
When the user wants to enter their details, they can hover over each textbox, and it will highlight it in blue showing that it is ready for the user to enter their details.
