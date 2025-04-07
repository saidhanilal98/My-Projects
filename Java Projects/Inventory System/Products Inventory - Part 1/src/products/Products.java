package products;

import java.util.Scanner;

public class Products {

    public static void DisplayMenu() { //Display menu method
        int choice;
        String capture;
        Scanner sc = new Scanner(System.in);
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION\n" + "*************************************************");

        System.out.println("Please select one of the following menu item:\n" + " (1) Capture a new product.\n" + " (2) Search a new product.\n" + " (3) Update a new product.\n"
                + " (4) Delete a new product.\n" + " (5) Print a report.\n" + " (6) Exit application.");

        choice = sc.nextInt();
        switch (choice) {  // Use of switch case
            case 1:
                CaptureProduct();
                break;

            case 2:
                SearchProduct();
                break;

            case 3:
                UpdateProduct();
                break;

            case 4:
                DeleteProduct();
                break;

            case 5:
                PrintReport();
                break;

            case 6:
                System.out.println("Thank you for using our application! ");

                break;
            default:
        }

    }

    public static void main(String[] args) { // Main method to display the menu

        DisplayMenu();

    }

    public static void CaptureProduct() { // Capture product method

        int prcode[] = {51, 52, 53, 54, 55};

        Scanner capture = new Scanner(System.in);
        String[] products = new String[3];

        System.out.println("CAPTURE A NEW PRODUCT");
        System.out.println("************************");

        System.out.println("Enter the product code: ");
        String productCode = capture.nextLine(); // To promt the user to enter details

        System.out.println("Enter the product name: ");
        String productName = capture.nextLine();

        System.out.println("Select the product category: \nDesktop Computer - 1 \nLaptop - 2 \nTablet - 3 \nPrinter - 4 \nGaming Console - 5");
        String productCategory = capture.nextLine();

        System.out.println("Indicate the product warrenty. Enter (1) for 6 months or any other key for 2 years.");
        String productWarranty = capture.nextLine();

        System.out.println("Enter the product price: ");
        String productPrice = capture.nextLine();

        System.out.println("Enter the stock level: ");
        String productstockLevel = capture.nextLine();

        System.out.println("Enter the supplier: ");
        String productSupplier = capture.nextLine();

        System.out.println("The product details have been successfully saved");

        ExitApplication();
        SearchProduct();
        DeleteProduct();
    }

    public static void SearchProduct() { // Search product method

    }

    public static void UpdateProduct() { // Update product method

        int prcode[] = {51, 52, 53, 54, 55};

        Scanner update = new Scanner(System.in);
        System.out.println("Please enter the product code to update: ");
        String yesno = update.nextLine();

        //******************************************************************************************
        System.out.println("Do you want to update the warrenty?  (y) or (n)");
        String yes = update.nextLine();

        if (yes.equalsIgnoreCase("n")) { // Use of if statement for the yes and no answers
            System.out.println("Warrenty update Complete....");
        } else if (yes.equalsIgnoreCase("y")) {
            System.out.println("Please enter  a new warranty: 6 months or 2 years? ");
            String w = update.nextLine();

        }
        //********************************************************************************************              
        System.out.println("Do you want to update the price?  (y) or (n)");
        String no = update.nextLine();
        if (no.equalsIgnoreCase("y")) { // Use of if statement for the yes and no answers
            System.out.println("Please enter a new price for " + yesno + ":");
            String answer = update.next();
        } else if (no.equalsIgnoreCase("n")) {
            System.out.println("Price update Complete....");

        }
        if (yesno.equals("yes")) {
            System.out.print("Do you want to update the stock level?  (y) or (n)");

        }
        if (yesno.equals("no")) {
            System.out.print("Stock level update Complete.... ");

        } else {
            System.out.println("Product details has been updated successfully!");
            SaveProduct();

        }
    }

    public static void DeleteProduct() { // Delete product method

        int prcode[] = {51, 52, 53, 54, 55};

        Scanner delete = new Scanner(System.in);
        System.out.println("Please enter the product code to be deleted: ");
        String yesno = delete.nextLine();

        //******************************************************************************************
        System.out.print("Would you like to delete the product? (y) or (n)");
        String yes = delete.nextLine();
        if (yes.equalsIgnoreCase("y")) { // Use of if statement for the yes and no answers
            System.out.println("Please confirm if you would like to delete the product? (y) or (n)");

        }
        if (yes.equalsIgnoreCase("n")) {
            System.out.print("You have chosen no.");

        } else {
            System.out.println("You have successfully deleted the product.");

        }
    }

    public static void ExitApplication() { // Exit application method
        Scanner exit = new Scanner(System.in);
        System.out.println("Enter 1 to launch or any other key to exit");
        String val = exit.nextLine();

        if (val.equals("1")) {
            DisplayMenu();
        } else {
            System.out.println("PROCESSED...");
        }
    }

    public static void PrintReport() { // Print report method

    }

    public static void SaveProduct() { // Save product method

        System.out.println("*********************************************************");
        int prcode[] = {51, 52, 53, 54, 55};
        Scanner save = new Scanner(System.in);
        System.out.println("Please enter the product code to save the details: ");
        String saved = save.nextLine();
        if (saved.equals("")) {
            DisplayMenu();
        } else {
            System.out.println("You have successfully saved the product details.");
            System.out.println("**********************************************************");
        }
    }

    public static void invalidCategory() { // Invalid category method
        Scanner invalid = invalid = new Scanner(System.in);
        int category;
        while (true) {
            System.out.println("Please type the category name:\nDesktop Computer\nLaptop\nTablet\nPrinter\nGaming Console");
            category = invalid.nextInt();
            switch (category) { // Use of switch case
                case 1:
                    System.out.println("Desktop Computer: ");
                    break;
                case 2:
                    System.out.println("Laptop:");
                    break;
                case 3:
                    System.out.println("Tablet: ");
                    break;
                case 4:
                    System.out.println("Printer: ");
                    break;
                case 5:
                    System.out.println("Gaming Console: ");
                    System.out.println("Category name accepted.");
                case 6:
                    System.out.println("Invalid category name. Please try again.");
                    break;
                default:

            }

        }

    }

}
