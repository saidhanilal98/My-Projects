
import java.util.Random;
import javax.swing.JOptionPane;

public class CellPhoneNumberGenerator {

    public static void main(String[] args) {
        String[] CustomerNames = new String[3];
        String ServiceProvider[] = {"Vodacom", "CellC", "MTN"}; //Arrays for the three network providers
        String thedisplay = ""; //Variables declared
        int aHolder1;
        int bHolder2;

        for (int i = 0; i < CustomerNames.length; i++) { //for loop

            CustomerNames[i] = JOptionPane.showInputDialog(null, "Enter the customer name:");
            aHolder1 = 100 + (int) (Math.random() * (999)); //Random generator calculations for randomly generating the phone numbers
            bHolder2 = 1000 + (int) (Math.random() * (9999));

            int Random = (int) (Math.random() * ServiceProvider.length);
            String RandomServiceProvider = ServiceProvider[Random];

            if (Random == 0) { //if Statement 1
                thedisplay = thedisplay + CustomerNames[i] + " will be on the " + RandomServiceProvider + " network with the phone number " + " 072 " + aHolder1 + "-(" + bHolder2 + ")\n";

            }

            if (Random == 1) { //if Statement 2
                thedisplay = thedisplay + CustomerNames[i] + " will be on the " + RandomServiceProvider + " network with the phone number " + " 084 " + aHolder1 + "-(" + bHolder2 + ")\n";
            }

            if (Random == 2) { //if Statement 3
                thedisplay = thedisplay + CustomerNames[i] + " will be on the " + RandomServiceProvider + " network with the phone number " + " 083 " + aHolder1 + "-(" + bHolder2 + ")\n";
            }

            JOptionPane.showMessageDialog(null, "CELL PHONE NUMBER GENERATOR\n ****************************************\n" + thedisplay); //To display the message dialog box to the user

        }

    }

}
