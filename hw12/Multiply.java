/*
Liam Gamble
HW 12
4/19/15

This program will multiply the values of two
matricies and print a result product matrix.

*/
import java.util.Scanner;
import java.util.Random;

public class Multiply{ 
    Scanner myScanner = new Scanner(System.in);
    Random randomNum = new Random();
   
    public static int[][] randomMatrix(int width, int height){ // creates a matrix of a given size filled with random values between -10 add 10
    
        Scanner myScanner = new Scanner(System.in);
        Random randomNum = new Random();
        
        int [][] array = new int[width][height];
        
        int i = 0;
        int j = 0;
        
        for (i = 0; i < width; i++ ){ //fills the matrix array with random values
            
            for (j = 0; j < height; j++){
                int random =  randomNum.nextInt(20) - 10;
                array[i][j] = random;
                
            }
            
        }
     return array;   
    }
        
    
    public static void printMatrix(int[][] matrix){ //prints the values inside a matrix
        
        int l = 0;
        int m = 0;
        
        for (l = 0; l < matrix.length; l++ ){ //moves through each cell of the matrix and prints the value
            
            for (m = 0; m < matrix[l].length; m++){ 
                System.out.print(matrix[l][m] + "\t");
                
            }
            System.out.println();
        }
        
    }
    
    
    public static int[][] matrixMultiply(int[][] array1, int[][] array2){ //method that multiplies matricies
       
        int[][] stuffArray = new int[array1.length][array2[0].length];
       
        if (array1.length != array2[0].length){ //double checks if the parameters for multiplication are met
            System.out.println("This is not right.");
            return null;
      
        }else{
            int i = 0;
            int j = 0;
            int k = 0;
            
            for ( i=0; i < stuffArray[0].length; i++){ //these nested loops moves through the array cells to multiply the values correctly
                
                for ( j=0; j < stuffArray.length; j++){
                    
                    for ( k=0; k < stuffArray.length; k++){
                      stuffArray [j][i] += array1[i][k]*array2[k][j];
                    }
                }
            }
        }
            
         return stuffArray;       
    }
    
    
    public static int Input(Scanner scan){ //method checks if the values are acceptable input, otherwise asks for better input
        int x=1;
        int input=0;
        while (x==1){
            if (scan.hasNextInt()){ //checks if input value is an integer
                input = scan.nextInt();
                
                if (input>=0 ){
                    x++;
                }
                else{
                    System.out.println("Please enter a value above 0.");
                }
            }
            else{ //if it isn't, output this message
                System.out.println("Sorry, you need to enter an integer.");
                scan.next();
            }
        }
        return input;
    }
    
    public static void main(String[] args){ //main method
        int x = 1;
        int width = 0; 
        int height = 0;
        
        while (x == 1){ //recieves input from user, checks if input is valid for matrix multiplication
            Scanner myScanner = new Scanner(System.in);
                Random randomNum = new Random();
            System.out.println("Enter the desired width of the matrix: ");
                width = Input(myScanner);
                System.out.println("Enter the desired heigth of the matrix: ");
                height = Input(myScanner);
            
            if (width == height){ //checks if the parameters are met, if they aren't input is asked for again
                x++;
           
            }else{
                System.out.println("Follow the parameters.");
            }
        }
        
        
        int [][] array1 = randomMatrix(width, height); //creates two random matricies to multiply
        int [][] array2 = randomMatrix(width, height);
    
    
        printMatrix(array1); //prints the matricies above for reference, with barrier lines for clairity
        System.out.println("==================================");
        
        printMatrix(array2);
        System.out.println("=================================="+"\n"+"==================================");
       
            
        int [][] output = matrixMultiply(array1, array2); //stores the result matrix of multiplying the two matricies
        
        printMatrix(output); //prints the result matrix
        
       
    }
    
    
    
}