/*
Liam Gamble
4/9/15

This lab will print a zigzag line according
to the lengththe user inputs.

*/
import java.util.Scanner;

public class zigzag{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        int nStars = -1;
        
        
        while (nStars < 3 || nStars > 3){
        
            while(4 == 4)
                
                System.out.println("Input an integer between 3 and 33: ");
                if (myScanner.hasNextInt() == true){
                   
                    for (int counter1 = 0; counter1 < nStars; counter1++){ //prints the character "*" nStar number of times
                        System.out.print("*");
                  }
                
                  System.out.println("");
            
                  for (int counter1 = 0; counter1 < nStars; counter1++){
                      for(int counter2 = 0; counter2 < counter1; counter2++){
                        System.out.print(" ");
                      }
                      
                      System.out.println("*"); 
                  }
                
                
                   for (int counter1 = 0; counter1 < nStars; counter1++){ //prints the character "*" nStar number of times
                       System.out.print("*");
                    }
                
                    System.out.println("");
                    System.out.println("Press y or Y to go again.");
                    
                }
        }
    }
}




        int nStars = 1;
        int i = 1;
        int j = 1;
        while (true){
            while (1==1){ //begin while loop
                System.out.print("Input an integer between 3 and 33:"); //prompt user
                if (myScanner.hasNextInt()){ //check if input is an integer
                    nStars = myScanner.nextInt(); //if it is, assign the input to a
                    if(nStars>=3 && nStars<=33){ //check if the value is between 9 and 16 inclusive
                        break; //if it is, break out of this while loop
                    }
                    else{ //if it's not between 9 and 16, give error message, then skip to continue
                        System.out.println("This is not a valid input. Please enter only integers between 3 and 33, inclusive.");
                    }
                }
                else{ //if it's not an integer
                    System.out.println("This is not a valid input. Please enter only integers between 3 and 33, inclusive."); //show error
                    myScanner.next(); //throw away input
                }
                continue; //start over loop
            }
            for (i=1; i<nStars; i++){
                System.out.print("*");
                System.out.println();
                for (j=1; j<=i; j++){
                    System.out.print(" ");
                }
            }
            System.out.print("Enter y or Y to play again:");
            char answer = myScanner.next();
            if (myScanner.hasNext("[yY]")){
                continue;
            }
            else{
                break;
            }
        }
    }
}