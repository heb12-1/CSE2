/*
Liam Gamble
3/3/15

HW 06 -- Run Factorial

This program uses a while-loop to solve factorial programs. Using scanner, it first takes an 
integer that is between 9 and 16 inclusively, then calculates the factorial of the input number.
*/

import java.util.Scanner;

public class RunFactorial{
    public static void main(String [] args){
   
        Scanner myScanner = new Scanner(System.in);
   
        int numberIn;
   
        while (true==true){ //always runs
            System.out.print("Input an integer between 9 and 16 inclusive:");
   
            if (myScanner.hasNextInt()){ //this checks to see if the input is in fact an integer
                numberIn = myScanner.nextInt();
   
                if(numberIn>=9 && numberIn<=16){ //this checks to see if the input number is in fact between 9 and 16 inclusive
                    break;
   
                }else{
                    System.out.println("This is not valid input");
                }
         
            }else{
                System.out.println("This is not valid input");
            }
            
            continue;
        }
       
        int n = numberIn-1; //this increments the input number down by one to execute the factorial equation
       
        while (n>0){ //this loop executes the factorial multiplication
         
            numberIn = numberIn*n;
           
            x--;
        }
       
        System.out.println(numberIn); //prints the final output number
   
    } //end main method

    
} //end class