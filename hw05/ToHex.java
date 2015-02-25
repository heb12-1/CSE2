/*
Liam Gamble
2/23/15
HW 5 - To Hex

 This program takes three input decimal RGB values and converts them to hexadecimal. 

*/

import java.util.Scanner;

public class ToHex{
    public static void main(String[] args){
        Scanner colors = new Scanner(System.in); //this scanner takes in the RGB values the user inputs
        System.out.println("Please enter three integers from [0-255] representing RGB values, seperated by spaces.");
        
        int red = colors.nextInt();   //receives red integer value from user
        int green = colors.nextInt(); //receives green integer value from user
        int blue = colors.nextInt();  //receives blue integer value from user
        
        String hexColor = String.format("#%02X%02X%02X", red, green, blue); //converts user input to hexadecimal values 
        
        System.out.println("The decimal numbers R:"+ red +", G:"+ green +", B:" +blue+", is represented in hexadecimal as: " + hexColor + ".");
    } //end of main method
} //end of class