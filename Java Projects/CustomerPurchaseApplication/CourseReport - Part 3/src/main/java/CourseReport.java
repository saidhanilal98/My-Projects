
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CourseReport { //Class for course report

    public static void main(String[] args) { //Main class
        Course_Details report = new Course_Details();

        String course = JOptionPane.showInputDialog(null, "Select from the following course details:" + "\n1) DISD" + "\n2) DIWD" + "\n3) DIDM");
        if (course.contentEquals("1")) { //if Statement 1 for setting and getting to assign the venue to that specific course
            report.setcoursename("Diploma in Software Developement");
            report.setlecturer("Mr Jones");
            report.setstudentnumbers(35);
            System.out.println("COURSE REPORT - 2020/10/31 15:22:38" + "\nCourse Name:" + report.getcoursename() + "\nStudent Numbers:" + report.getstudenumbers() + "\nLecturer:" + report.getlecturer());
            Course_Details.AssignVenue();
        }
        if (course.contentEquals("2")) { //if Statement 2 for setting and getting to assign the venue to that specific course
            report.setcoursename("Diploma in Web Developement");
            report.setlecturer("Mrs Smith");
            report.setstudentnumbers(28);
            System.out.println("COURSE REPORT - 2020/10/31 15:22:38" + "\nCourse Name:" + report.getcoursename() + "\nStudent Numbers:" + report.getstudenumbers() + "\nLecturer:" + report.getlecturer());
            Course_Details.AssignVenue();
        }
        if (course.contentEquals("3")) { //if Statement 3 for setting and getting to assign the venue to that specific course
            report.setcoursename("Diploma in Data Metrics");
            report.setlecturer("Mr Ntsinga");
            report.setstudentnumbers(39);
            System.out.println("COURSE REPORT - 2020/10/31 15:22:38" + "\nCourse Name:" + report.getcoursename() + "\nStudent Numbers:" + report.getstudenumbers() + "\nLecturer:" + report.getlecturer());
            Course_Details.AssignVenue();
        }

        String Message;
        Message = JOptionPane.showInputDialog(null, "Would you like to exit the application? Enter (y)" + "\nto use exit or any other key to continue");
    }
}

class Course_Details { //Course details class

    public String Course_Details;

    String coursename;
    int studentnumbers;
    String lecturer;

    public void setcoursename(String coursename) { //Getters and Setters
        this.coursename = coursename;
    }

    public String getcoursename() {
        return coursename;
    }

    public void setstudentnumbers(int studentnumbers) {
        this.studentnumbers = studentnumbers;
    }

    public Integer getstudenumbers() {
        return studentnumbers;
    }

    public void setlecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getlecturer() {
        return lecturer;
    }

    public static void AssignVenue() { //Assign venue method for randomly generating the venues 
        Random rand = new Random();
        String Venue = "Venue: " + Integer.toString(rand.nextInt(3) + 1);
        System.out.println(Venue);

    }

}
