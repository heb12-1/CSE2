/*
Liam Gamble
2/9/15
Homework 3 -- Four Digits program

This program prompts the user to enter a double, and then prints
out the first four digits to the right of the decimal point.

*/
import java.util.Scanner; //imports necessary information to allow user input

public class FourDigits {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter a double with at least four digits after the decimal point: ");
        double inputNumber = myScanner.nextDouble(); //the input number is stored into this variable
        
        int cloneNumber = (int)(inputNumber); // variable used to help get rid of unnecessary information
        double chopChop = (inputNumber - cloneNumber) * 10000; //leaves only the numbers after the decimal point and moves the decimal point over four places
        
        int useThis = (int)(chopChop); //gets rid of any extra decimal points
        
        int onesPlace = (useThis%10); //finds the value of the one's place
        int tensPlace = (useThis%100); //finds the value of the ten's place
        int hundredsPlace = (useThis%1000); //finds the value of the hundred's place
        int thousandsPlace = (useThis%10000); //finds the value of the thousand's place
       
        System.out.println("Let's keep track of some stuff. inputNumber = " + inputNumber + ", cloneNumber = " + cloneNumber + ", chopChop = " + chopChop + ", and useThis = " + useThis);
        System.out.println("Let's keep track of some more stuff. onesPlace = " + onesPlace + ", tensPlace = " + tensPlace + ", hundredsPlace = " + hundredsPlace + ", and thousandsPlace = " + thousandsPlace);
        System.out.println("The four digits to the right of the decimal point are " + thousandsPlace + " " + hundredsPlace + " " + tensPlace + " " + onesPlace); //
        
        
        
        
    } // end of main method

} //end of class