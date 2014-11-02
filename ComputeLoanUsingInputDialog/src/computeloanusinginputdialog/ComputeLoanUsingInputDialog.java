
package computeloanusinginputdialog;

import javax.swing.JOptionPane;

/**
 * This program will use input dialog boxes to prompt user enter necessary
 * information and calculate the loan payment
 * @author MichaelWang
 */
public class ComputeLoanUsingInputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String annualInterestRateString = JOptionPane.showInputDialog(null, 
                "Enter annual interest rate, for example, 8.25:");
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        double monthlyInterestRate = annualInterestRate / 1200;
        String numberOfYearsString = JOptionPane.showInputDialog("Enter number "
                + "of years as an interger, for example, 5:");
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        String loanString = JOptionPane.showInputDialog("Enter loan amount, "
                + "for example, 120000.95:");
        double loanAmount = Double.parseDouble(loanString);
        
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment = (int)(totalPayment * 100) / 100.0;
        
        String output = "The monthly payment is  $" + monthlyPayment +
                "\nThe total payment is $" + totalPayment;
        JOptionPane.showMessageDialog(null, output);
    }
    
}
