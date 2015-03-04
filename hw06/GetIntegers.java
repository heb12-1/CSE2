/*
Liam Gamble
3/3/15

HW 06 -- Get Integers

This program will ask the user for 5 non-negative
integers (if an invalid value is entered, it will ask
again), and then print out the sum of the 5 integers.
*/
mport java.util.Scanner;

public class GetIntegers{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
       
        System.out.println("Enter five non-negative integers for me to sum.");
        
        for (int arbitraryNumber = 1; arbitraryNumber==1; ){
            if (myScanner.hasNextInt()){
                num1 = myScanner.nextInt();
                if(num1 >= 0){
                    break;
                }
                else{
                    System.out.println("Invalid input. Enter only positive integers");
                    
                }
            }
            else{
                System.out.println("Invalid input. Enter only positive integers");
                
            }
        }
        
        
        for (int x = 1; x==1; ){
            
            if (myScanner.hasNextInt()){
                num2= myScanner.nextInt();
                if(num2>= 0){
                    break;
                }
                else{
                    System.out.println("Invalid input. Enter only positive integers");
                }
            }
            else{
                System.out.println("Invalid input. Enter only positive integers");
            }
        }
        
        
        for (int x = 1; x==1; ){
            
            if (myScanner.hasNextInt()){
                c = myScanner.nextInt();
                if( c >= 0){
                    break;
                }
                else{
                    System.out.println("Invalid input. Enter only positive integers");
                }
            }
            else{
                System.out.println("Invalid input. Enter only positive integers");
            }
        }
        
        
        for (int x = 1; x==1; ){
            
            if (myScanner.hasNextInt()){
                num4 = myScanner.nextInt();
                if(num4 >=0){
                    break;
                }
                else{
                    System.out.println("Invalid input. Enter only positive integers");
                }
            }
            else{
                System.out.println("Invalid input. Enter only positive integers");
            }
        }
        
        
        for (int x = 1; x==1; ){
            System.out.println("Please input 5 positive integers:");
            if (myScanner.hasNextInt()){
                num5 = myScanner.nextInt();
                if(num5 >= 0){
                    break;
                }
                else{
                    System.out.println("Invalid input. Enter only positive integers");
                }
            }
            else{
                System.out.println("Invalid input. Enter only positive integers.");
            }
        }
        System.out.println("The sum is " + (num1 + num2 + num3 + num4 + num5) + ".");
    }
}
       