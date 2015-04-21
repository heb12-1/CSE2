/*
Liam Gamble
2/27/15

Lab 06 -- 

This program has four steps: 

1) It will print out 5 smiley faces using non-nested 
 for loops, while loops and do-while loops.

2)  It creates a second loop to print out a random 
 number of smiley faces, between 1-100, using “math.random()”.

3) It uses a third loop that limits the number of smiley 
 faces on any line to 30.

4) It creates a final loop that increases the number of smiley
 faces on each lineby one for every new line that is used.
*/

public class SmileGenerator{
    public static void main(String[] args){
        
        int x; //the counter that checks itself against a sentinel variable to determine the number of times the loop iterates.

    
        for (x=0; x<5; x++){
            System.out.print(":)");
        }
        System.out.println("");
        
        x=0; //this resets x to zero for the next loop
        while (x<5){
            System.out.print(":)");
            x++;
        }
        System.out.println("");
        
        x=0;
        do{
             System.out.print(":)");
             x++;
         }while (x<5); 
        
        System.out.println("");
    
    
    
        x=0;
        int numSmileys = (int)(Math.random()*100); //this is the randomly generated sentinel variable between 1 and 100 
        
        if (numSmileys > 30){   //Step 3
            numSmileys = 30;
        }else if (numSmileys == 0){
          numSmileys++;  
        }
        
         while (x < numSmileys){
            System.out.print(":)");
            x++;
         }
         System.out.println("");
        
        

  /*  
    
       
    
        do{
        System.out.print(":)");
        } while ();
        System.out.println("")
        */
    }
}