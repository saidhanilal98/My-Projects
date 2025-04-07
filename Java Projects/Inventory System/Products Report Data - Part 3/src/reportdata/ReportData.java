package reportdata;

import java.util.Scanner;
import static reportdata.productDetails.displayreportData;

public class ReportData {

    public static void main(String[] args) {
        productDetails report = new productDetails();
        displayreportData(); // Display report data method

    }
}

class productDetails { // Class for product details

    public String productDetails; 
    int prcode[] = {51, 52, 53, 54, 55};
    int productCode; // Variables
    String productName;
    String productCategory;
    int productWarrenty;
    int productPrice;
    int productLevel;
    String productSupplier;
    private String getproductCode;

    public void setproductCode(int productCode) { // Setters and getters
        this.productCode = productCode;
    }

    public int getproductCode() {
        return productCode;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public String getproductName() {
        return productName;
    }

    public void setproductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getproductCategory() {
        return productCategory;
    }

    public void setproductWarrenty(int productWarrenty) {
        this.productWarrenty = productWarrenty;
    }

    public int getproductWarrenty() {
        return productWarrenty;
    }

    public void setproductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getproductPrice() {
        return productPrice;
    }

    public void setproductLevel(int productLevel) {
        this.productLevel = productLevel;
    }

    public int getproductLevel() {
        return productLevel;
    }

    public void setproductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

    public String getproductSupplier() {
        return productSupplier;
    }

    public static void displayreportData() { // Another method to display the report data

        int productCode, productWarrenty, productLevel;
        String productName, productCategory, productSupplier;
        double productPrice;

        for (int a = 0; a < 3; a++) { // Use of a for loop to make the code appear three times

        }

        productDetails report = new productDetails();
        Scanner reportdata = new Scanner(System.in); // Use of scanner

        System.out.println("PRODUCT REPORT");
        System.out.println("=======================================================");
        System.out.println("PRODUCT 1");
        System.out.println("-------------------------------------------------------");
        System.out.println("PRODUCT CODE >> \t" + report.getproductCode());
        System.out.println("PRODUCT NAME >> \t" + report.getproductName());
        System.out.println("PRODUCT CATEGORY >> \t" + report.getproductCategory());
        System.out.println("PRODUCT WARRENTY >> \t" + report.getproductWarrenty());
        System.out.println("PRODUCT PRICE >> \t" + report.getproductPrice());
        System.out.println("PRODUCT LEVEL >> \t" + report.getproductLevel());
        System.out.println("PRODUCT SUPPLIER >> \t" + report.getproductSupplier());
        System.out.println("-------------------------------------------------------");
        System.out.println("PRODUCT 2");
        System.out.println("PRODUCT CODE >> \t" + report.getproductCode());
        System.out.println("PRODUCT NAME >> \t" + report.getproductName());
        System.out.println("PRODUCT CATEGORY >> \t" + report.getproductCategory());
        System.out.println("PRODUCT WARRENTY >> \t" + report.getproductWarrenty());
        System.out.println("PRODUCT PRICE >> \t" + report.getproductPrice());
        System.out.println("PRODUCT LEVEL >> \t" + report.getproductLevel());
        System.out.println("PRODUCT SUPPLIER >> \t" + report.getproductSupplier());
        System.out.println("-------------------------------------------------------");
        System.out.println("PRODUCT 3");
        System.out.println("-------------------------------------------------------");
        System.out.println("PRODUCT CODE >> \t" + report.getproductCode());
        System.out.println("PRODUCT NAME >> \t" + report.getproductName());
        System.out.println("PRODUCT CATEGORY >> \t" + report.getproductCategory());
        System.out.println("PRODUCT WARRENTY >> \t" + report.getproductWarrenty());
        System.out.println("PRODUCT PRICE >> \t" + report.getproductPrice());
        System.out.println("PRODUCT LEVEL >> \t" + report.getproductLevel());
        System.out.println("PRODUCT SUPPLIER >> \t" + report.getproductSupplier());
        System.out.println("-------------------------------------------------------");
        System.out.println("=======================================================");
        System.out.println("TOTAL PRODUCT COUNT: ");
        System.out.println("TOTAL PRODUCT VALUE: ");
        System.out.println("AVERAGE PRODUCT VALUE: ");
        System.out.println("=======================================================");

        double totalproductCount = 3;
        double totalproductValue = 14500 + 12500 + 8500;
        double averageproductValue = totalproductCount / totalproductValue;

        Scanner calculations = new Scanner(System.in); 

        System.out.println("======================================================="); // Calculations
        System.out.println("TOTAL PRODUCT COUNT: " + totalproductCount);
        System.out.println("TOTAL PRODUCT VALUE: " + "R" + totalproductValue);
        System.out.println("AVERAGE PRODUCT VALUE: " + "R" + averageproductValue);
        System.out.println("=======================================================");
        System.out.println("Enter (1) to launch menu or any other key to exit");

    }
}
