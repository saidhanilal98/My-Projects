package question2;

import java.util.Scanner;

public class Question2 {

    String name; // Variables
    String surname;
    int cellNumber;
    int studentNumber;
    int temperature;

    Question2(String stName, String stSurname, int stcellNumber, int ststNumber, int stTemperature) {

        name = stName;
        surname = stSurname;
        cellNumber = stcellNumber;
        studentNumber = ststNumber;
        temperature = stTemperature;

    }

    public String getName() { // Getters and setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getTemperature() {
        return temperature;

    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public static void main(String[] args) {

        int i;
        int temp[] = {35, 38, 34, 37, 36}; // Array for the student temperature readings
        Question2[] Covid19app = new Question2[100];

        for (i = 0; i <= 100; ++i) { // Use of a for loop for the 100 students to enter for the covid 19 screening

            Scanner Covidapp = new Scanner(System.in);
            System.out.println("COVID 19 SCREENING APPLICATION");
            System.out.println("**********************************************************************************");

            System.out.println("1. Please enter your name: ");
            String name = Covidapp.nextLine(); // To promt the user to enter details

            System.out.println("2. Please enter your surname: ");
            String surname = Covidapp.nextLine();

            System.out.println("3. Please enter your cell number: ");
            int cellNumber = Covidapp.nextInt();

            System.out.println("4. Please enter your student number: ");
            int studentNumber = Covidapp.nextInt();

            System.out.println("5. Please enter your temperature: ");
            int temperature = Covidapp.nextInt();
            System.out.println("**********************************************************************************");

            System.out.println("COVID 19 SCREENING APPLICATION REPORT FOR STUDENT NUMBER: " + studentNumber);
            System.out.println("**********************************************************************************");

            System.out.println("• NAME: " + name);
            System.out.println("• SURNAME: " + surname);
            System.out.println("• CELL NUMBER: " + cellNumber);
            System.out.println("• STUDENT NUMBER: " + studentNumber);
            System.out.println("• STUDENT TEMPERATURE: " + temperature);
            System.out.println("**********************************************************************************");

            studentScreeningQuestions();
            studentTemperatureReadings();

        }

    }

    public static void studentTemperatureReadings() { // Student temperature readings method
        int j;
        int temp[] = {35, 38, 34, 37, 36};

        for (j = 0; j <= 100; ++j) { // Use of a for loop for temperature readings for the 100 students
            Scanner stTemp = new Scanner(System.in);
            System.out.println("Please enter student temperature to continue: " + " ");
            String ststNumber = stTemp.nextLine();

            int studentTemp = stTemp.nextInt();

            if (studentTemp >= 37 && studentTemp <= 38) { // Use of if statement for the readings
                System.out.println("Student temperature reading" + "is high! " + "Please stand in the shade to cool off for a bit.");
            } else if (studentTemp >= 36 && studentTemp <= 37) {
                System.out.println("Student temperature reading " + " is normal! " + "You may proceed towards class.");
            } else if (studentTemp >= 35 && studentTemp <= 36) {
                System.out.println("Student temperature reading " + " is average! " + "You may proceed towards class.");
            } else if (studentTemp >= 34 && studentTemp <= 35) {
                System.out.println("Student temperature reading" + " is low! " + " Please stand in the sun for a bit to warm up or you may proceed towards class.");
            } else {
                System.out.println("The infrared thermometer is not working. ");
            }

        }
    }

    public static void studentScreeningQuestions() { // Student screening Questions method
        int a;
        int temp[] = {35, 38, 34, 37, 36};
        for (a = 0; a <= 100; ++a) { // Use of a for loop for screening questions for the 100 students
            
        }
        Scanner covidQuestions = new Scanner(System.in);
        System.out.println("Please type (y) to complete the following covid 19 screening questions: ");
        String yesno = covidQuestions.nextLine();

        //******************************************************************************************
        System.out.println("1. Where you expriencing any covid symptoms in the past 48 hours? (y) or (no)  ");
        String yes = covidQuestions.nextLine();

        if (yes.equalsIgnoreCase("y")) { // Use of if statement for the yes and no answers
            System.out.println("You may not proceed!");

        } else if (yes.equalsIgnoreCase("n")) {
            System.out.println("You may proceed towards class!");

        }
        //********************************************************************************************              
        System.out.println("2. Were you in contact with anyone over the past 14 days who had covid?  (y) or (n)");
        String no = covidQuestions.nextLine();

        if (yes.equalsIgnoreCase("y")) { // Use of if statement for the yes and no answers
            System.out.println("You may not proceed!");

        } else if (yes.equalsIgnoreCase("n")) {
            System.out.println("You may proceed towards class!");

        }

        //******************************************************************************************
        System.out.println("3. In the past two weeks, have any of your household members received a positive COVID-19 test? (y) or (no)  ");
        String y = covidQuestions.nextLine();

        if (y.equalsIgnoreCase("y")) { // Use of if statement for the yes and no answers
            System.out.println("You may not proceed!");

        } else if (y.equalsIgnoreCase("n")) {
            System.out.println("You may proceed towards class!");

        }

        //******************************************************************************************
        System.out.println("4. Did you get vaccinated? (y) or (no)  ");
        String n = covidQuestions.nextLine();

        if (no.equalsIgnoreCase("y")) { // Use of if statement for the yes and no answers
            System.out.println("Thank you for getting vaccinated!");

        } else if (no.equalsIgnoreCase("n")) {
            System.out.println("Please get vaccinated soon!");

        } else {
            System.out.println("Thank you for your submission!");

            studentTemperatureReadings();

        }
        
    }
}
