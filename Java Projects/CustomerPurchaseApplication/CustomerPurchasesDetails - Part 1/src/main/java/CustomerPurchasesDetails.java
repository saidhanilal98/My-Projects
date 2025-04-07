
import javax.swing.JOptionPane;
import java.util.Scanner;

public class CustomerPurchasesDetails {

    public static void main(String[] args) {
        CustomerPurchases Details = new CustomerPurchases();
        String Message;
        Message = JOptionPane.showInputDialog(null, "Would you like to view the product purchase report? Enter (1)" + "\nto view the purchase report or any other key to exit");
        Printing.PrintDetails(Details);

        System.out.print("Enter the customer number >> 10111 " + Details.getcustomernumber() + "\nEnter the customer first name >> Alex" + Details.getcustomerfirstname() + "\nEnter the customer surname >> Jones" + Details.getcustomersurname() + "\nEnter the product >> Guitar"
                + Details.getproduct() + "\nEnter the product price >> 5000" + Details.getproductprice() + "\nEnter the quantity required >> 2" + Details.getproductquantity());

    }
}

class CustomerPurchases { //Class for customer purchases

    String customernumber;
    String customerfirstname;
    String customersurname;
    String product;
    String productprice;
    String productquantity;

    public void setcustomernumber(String customernumber) { //Setters
        this.customernumber = customernumber;
    }

    public String getcustomernumber() { //Getters
        return customernumber;
    }

    public void setcustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname;
    }

    public String getcustomerfirstname() {
        return customerfirstname;
    }

    public void setcustomersurname(String customersurname) {
        this.customersurname = customersurname;
    }

    public String getcustomersurname() {
        return customersurname;
    }

    public void setproduct(String product) {
        this.product = product;
    }

    public String getproduct() {
        return product;
    }

    public void setproductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getproductprice() {
        return productprice;
    }

    public void setproductquantity(String productquantity) {
        this.productquantity = productquantity;
    }

    public String getproductquantity() {
        return productquantity;
    }
}

class Printing { //Printing class to print the output to the user

    public static void PrintDetails(CustomerPurchases details) {

        int customernumber, productquantity;
        String customerfirstname, customersurname;
        double productprice;

        Scanner input = new Scanner(System.in); //Scanner of customer invoice

        System.out.println("CUSTOMER INVOICE");
        System.out.println("***************************");
        System.out.println("CUSTOMER NUMBER:");
        customernumber = input.nextInt();
        details.getcustomernumber();
        System.out.println("CUSTOMER FIRST NAME:");
        customerfirstname = input.next();
        details.getcustomerfirstname();
        System.out.println("CUSTOMER SURNAME:");
        customersurname = input.next();
        details.getcustomersurname();
        System.out.println("PRODUCT PRICE:");
        productprice = input.nextDouble();
        details.getproductprice();
        System.out.println("PRODUCT QUANTITY:");
        productquantity = input.nextInt();
        details.getproductquantity();
        System.out.println("*****************************");

        displayCustomerPurchaseReport();

    }

    public static void displayCustomerPurchaseReport() { //Calculations
        double cost = 5000;
        double tax = 15;
        double commission = 8.5;
        double discount = 10;
        double tax1 = cost / 100 * tax;
        double commission1 = cost / 100 * commission;
        double discount1 = cost * discount / 100;
        double total1 = (cost + tax) - (discount + commission);

        Scanner input = new Scanner(System.in); //Scanner of customer purchse report

        System.out.println("CUSTOMER PURCHASE REPORT");
        System.out.println("*****************************");
        System.out.println("PRODUCT PRICE: " + "R5000");
        System.out.println("TAX: " + "R" + tax1);
        System.out.println("COMMISSION: " + "R" + commission1);
        System.out.println("DISCOUNT: " + "R" + discount1);
        System.out.println("TOTAL: " + "R" + total1);
        System.out.println("*****************************");

    }
}
