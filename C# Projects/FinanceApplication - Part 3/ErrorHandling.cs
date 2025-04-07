using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PROGPOEPart1App
{
    // Created a class for implementing error handling 
    class ErrorHandling

    {
        public int errorControl(string userInput)
        {
            int theValue;

            /* Validation for the user input to ensure that the user has entered all the
             * required values and has not left any empty spaces */
            if (string.IsNullOrEmpty(userInput))
            {
                theValue = 0;
            }
            else
            {
                theValue = Convert.ToInt32(userInput);
            }

            // Returns the value that the user has entered 
            return theValue;
        }

        public int AccommodationOption(string userInput)
        {

            // While loop to show that if the user continues to enter without entering a value, an error will occur 
            while(string.IsNullOrEmpty(userInput))
            {
                Console.WriteLine("Input cannot be blank");
                Console.WriteLine("Please choose (1) Renting Accomodation or (2) Buying A Property: ");
                Console.WriteLine("(1) Renting Accomodation: ");
                Console.WriteLine("(2) Buying A Property: ");
                userInput = Console.ReadLine();
            }
            
            int choice = Convert.ToInt32(userInput); 

            while(!(choice == 1 || choice == 2))
            {
                Console.WriteLine("Please choose (1) Renting Accomodation or (2) Buying A Property: ");
                Console.WriteLine("(1) Renting Accomodation: ");
                Console.WriteLine("(2) Buying A Property: ");
                choice = Convert.ToInt32(Console.ReadLine());
            }
            return choice;
        }

    }
}
