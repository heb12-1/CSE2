/*
Liam Gamble
2/6/15
Lab 4 - Cookies

 This program uses the Scanner class to obtain from users how many cookies they want, how 
 many people they are buying for, and at least how many cookies they want each person to get. 
 So long as all inputs are valid, it then determines if the number of cookies is evenly divisible 
 among the people and if there is enough for each person. If there are not enough cookies, it 
 tells the user how many more are needed.

*/

import java.util.Scanner;

public class Cookies{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the number of people: ");
        int numPeople = myScanner.nextInt();
        
        if (myScanner.hasNextInt() == true ){
           
            if (numPeople >= 0 ) {
                System.out.println("Enter how many cookies you plan to buy: ");
                int buyCookies = myScanner.nextInt();
                
                if (myScanner.hasNextInt() == true){
                    
                    System.out.println("Enter how many cookies you want each person to get: ");
                    int haveCookies = myScanner.nextInt();
                    
                    
                    if (myScanner.hasNextInt() == true){
                       
                        if (numPeople*haveCookies >= buyCookies){
                            
                            if (buyCookies%numPeople == 0){
                                System.out.println("You have enough cookies for each person and the amount will divide evenly.");
                                return;
                            }
                           
                        }else{
                            int needMore = -1*(numPeople*haveCookies - buyCookies);
                            System.out.println("You will not have enough cookies. You will need at least " + needMore + " more.");
                            return;
                       
                        }
                        
                    } else if (haveCookies >=0){
                        System.out.println("You did not enter an integer > 0.");
                        return;
                    }else{
                        System.out.println("You did not enter an integer.");
                        return;
                    }
                    
  
                    
                } else if (buyCookies >= 0) {
                        System.out.println("You did not enter an integer > 0.");
                        return;
                
                }else{
                        System.out.println("You did not enter an integer.");
                        return;
                }
                
             }else{
                System.out.println("You did not enter an integer > 0.");
                return;
             }
            
        } else {
            System.out.println("You did not enter an integer.");
            return;
        }
        
        
        
        
    } //end main method
} //end of class