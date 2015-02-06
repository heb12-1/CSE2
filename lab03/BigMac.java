/*
Liam Gamble
2/6/15
Big Mac program

This program will compute the cost of buying some Big Macs. 
It uses the Scanner class to obtain from the user how many Big Macs, 
the cost per Big Mac, and the percentage tax (which depends on the 
state; 6% in PA, 8% in MA, etc). Then it displays the total cost.

*/
import java.util.Scanner;

public class BigMac {
    
    public static void main(String[] args){
        
        Scanner myScanner;  // Set up a scanner.
        myScanner = new Scanner(System.in);  // 
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();  //

        System.out.print("Enter the cost per Big Mac as" +" a double (in the form xx.xx); " );
        double bigMac$ = myScanner.nextDouble(); // scans for user input of Big Mac cost
    	System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble(); // stores the whole number 
       
        taxRate/=100; // user enters percent, this changes it to a proportion
        
        double cost$; //whole dollar cost
        cost$ = nBigMacs*bigMac$*(1+taxRate); 
        
        int dollars, dimes, pennies; // stores digits to the right of the decimal point for the cost$
        dollars=(int)cost$; // calculates whole amount, drops decimal fraction
        dimes=(int)(cost$*10)%10; // get dimes amount
        pennies=(int)(cost$*100)%10; // get pennies amount
        
        System.out.println("The total cost of " +nBigMacs+" Big Macs, at $"+bigMac$ +" per Big Mac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);

        
        
        
    } // end of class
} // end of main method