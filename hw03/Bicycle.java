/*
Liam Gamble
2/9/15
Homework 3 -- Bicycle program

This program prompts the user to enter two digits, the first giving the number of 
counts on a cyclometer and the second giving the number of seconds during which the
counts occurred, and then prints out the distance traveled and the average miles per hour. 


*/
import java.util.Scanner; // imports necessary information to allow user input


public class Bicycle {
    
    public static void main(String[] args){
    
    
        Scanner myScanner = new Scanner(System.in); // creates a scanner to enable user input
        
        int wheelDiameter = 27; // assumed diameter of wheel
    
        System.out.println("Enter the number of seconds it took to complete counts: ");
        double seconds = myScanner.nextDouble(); // reads number of seconds, stores it in variable numberOfSeconds
    
        System.out.println("Enter the count of how many time the wheel went around: ");
        double nCounts = myScanner.nextDouble(); // reads number of counts, stores it in variable numberOfCounts
    
         
        double minutes = seconds / 60.0; // more precise value to be used for calculations 
        int temp1Minutes = (int)(seconds / 60.0 * 100.0); // temporary variable used to truncate lenght of output
        double minutesOutput = temp1Minutes / 100.0; // output of minute length
        
        double hours = minutes / 60.0; // there are 60 minutes in one hour
        double inches = nCounts * 27.0 * Math.PI; // calculates number of inches travelled using formula circumfrence = diameter*pi
        double feet = inches / 12.0;
       
       
        double miles = feet / 5280.0; // more precise value to be used for calculations
        int temp1Miles = (int)(feet / 5280.0 * 100.0); // temporary variable used to truncate the distance of miles
        double milesOutput = temp1Miles / 100.0; // output of number of miles
        
        int temp1MPH = (int)(miles / hours * 100.0) ; // temporary variable used to truncate the speed in mph
        double mph = temp1MPH / 100.0; // output speed in mph
        
        System.out.println("The distance travelled was " + milesOutput + " miles and took " + minutesOutput + " minutes.");
        System.out.println("The average speed in mph was " + mph + ".");
    
    
    } //end main method
} //end class