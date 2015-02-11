/*
Liam Gamble
2/9/15
Homework 3 -- Root

This program prompts the user to enter a double, and then prints out a rough estimate
of the cube root of the number, as well as the value of this guess cubed. This is done
by creating multiple guesses of the cube root using the equation 
(guess*guess*guess+x)/(3*guess*guess) multiple times until the result is close to the
true answer.
*/

import java.util.Scanner;

public class Root{
    
    public static void main (String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter a number, and I'll tell you the cube root: ");
        double inputNumber = myScanner.nextDouble(); // recieves input number from user
        
        double guess1 = inputNumber / 3.0; // initializes a variable for the guessed numbers
        
        double guess2 = (2.0*guess1*guess1*guess1+inputNumber)/(3.0*guess1*guess1); 
        double guess3 = (2.0*guess2*guess2*guess2+inputNumber)/(3.0*guess2*guess2);
        double guess4 = (2.0*guess3*guess3*guess3+inputNumber)/(3.0*guess3*guess3);
        double guess5 = (2.0*guess4*guess4*guess4+inputNumber)/(3.0*guess4*guess4);
        double cubeRoot = (2.0*guess5*guess5*guess5+inputNumber)/(3.0*guess5*guess5);
       
            
        System.out.println("The cube root is " + cubeRoot);
        System.out.println(cubeRoot + " * " + cubeRoot + " * " + cubeRoot + " = " + (cubeRoot * cubeRoot * cubeRoot));
        
    } // end main method
} // end class