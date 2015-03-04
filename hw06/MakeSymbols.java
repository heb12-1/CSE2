/*
Liam Gamble
3/3/15

HW 06 -- Make Symbols

This program generates an integer between 0 and 100. It will first need to print out the number 
then, if the number is even, will print out that number of “*” characters. If the number is
odd, then it will print out that number of “&” characters
*/

public class MakeSymbols{
    public static void main(String[] args){
        
        int randomNumber = (int)(Math.random() * 101) + 1; //creates a random number from 0 to 100
        System.out.println(randomNumber); //prints the random number
        
        int x = 0; //arbitrary sentinel variable
       
        if (randomNumber%2 == 0){ //if the remainder of dividing by two is zero, then the number is even
            
            do{
                System.out.print("*");
                x++;
            }while(x < randomNumber);
        
        }else if (randomNumber%2 == 1){ //if the remainder of dividing by two is one, the number is odd
            do{
                System.out.print("&");            
                x++;
            }while(x < randomNumber);
        
        }
        System.out.println("");
    }
}