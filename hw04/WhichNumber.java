/*
Liam Gamble
2/17/15
HW 4 - Which Number

 This program prompts the user to think of an integer between
 1 and 10 inclusive. Then the program proceeds to ask the user 
 questions in an attempt to guess what number the user is thinking of.

*/

import java.util.Scanner;

public class WhichNumber{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("I am going to guess a number you're thinking of.");
        System.out.println("Answer my questions using a y for \"yes,\" and n for \"no.\"");
        System.out.println("Pick an integer from 1 to 10, inclusive.");
        System.out.println("Okay, ready? Good. Is your number even?");
        
        char responseYN1 = myScanner.next(".").charAt(0);
      
        if (responseYN1 == 'y' ){
            System.out.println("Alright, your number is even. Is it divisible by 3?");
            char responseYN2 = myScanner.next(".").charAt(0);
            
            if (responseYN2 == 'y'){
                System.out.println("Alright, is your number 6?");
                char responseYN3 = myScanner.next(".").charAt(0);
                
                if(responseYN3 == 'y'){
                    System.out.println("Of course it was. I am never incorrect.");
                }else if (responseYN3 == 'n'){
                    System.out.println("Liar.");
                }else{
                    System.out.println("Please enter either \"y\" or \"n\".");
                }
                
            }else if (responseYN2 == 'n'){
                System.out.println("Is your number divisible by 4?");
                char responseYN4 = myScanner.next(".").charAt(0);
                
                if (responseYN4 == 'y'){
                    System.out.println("Is the number divided by four greater than 1?");
                    char responseYN5 = myScanner.next(".").charAt(0);
                    
                    if (responseYN5 == 'y'){
                        System.out.println("Is your number 8?");
                        char responseYN6 = myScanner.next(".").charAt(0);
                        
                        if (responseYN6 == 'y'){
                            System.out.println("Of course it was. I am never incorrect.");
                        }
                        else if (responseYN6 == 'n'){
                            System.out.println("Liar");
                            
                        }else{
                            System.out.println("Please enter either \"y\" or \"n\".");
                        }
                    }
                    else if (responseYN5 == 'n'){
                        System.out.println("Is your number 4?");
                        char responseYN10 = myScanner.next(".").charAt(0);
                        
                        if (responseYN10 == 'y'){
                            System.out.println("Of course it was. I am never incorrect.");
                        }
                        else if (responseYN10 == 'n'){
                            System.out.println("Liar.");
                        }else{
                            System.out.println("Please enter either \"y\" or \"n\".");
                        }
                        
                    }else{
                        System.out.println("Please enter either \"y\" or \"n\".");
                    }
                    
                } else if (responseYN4 == 'n'){
                    System.out.println("Is it divisible by 5?");
                    char responseYN7 =  myScanner.next(".").charAt(0);
                    
                    if (responseYN7 == 'y'){
                        System.out.println("Is your number is 5?");
                        char responseYN8 = myScanner.next(".").charAt(0);
                        
                        if (responseYN8 == 'y'){
                            System.out.println("Of course it is. I am never incorrect.");
                        }else if(responseYN8 == 'n'){
                            System.out.println("Liar.");
                        }else{
                            System.out.println("Please enter either \"y\" or \"n\".");
                        }
                        
                    } else if (responseYN7 == 'n'){
                        System.out.println("Is your number 2?");
                        char responseYN19 = myScanner.next(".").charAt(0);
                        
                        if(responseYN19 == 'y'){
                             System.out.println("Of course it is. I am never incorrect.");
                        }else if (responseYN19 == 'n'){
                            System.out.println("Liar.");
                        }else{
                            System.out.println("Please enter either \"y\" or \"n\".");}
                    }else{
                        System.out.println("Please enter either \"y\" or \"n\".");
                    }
                } else{
                    System.out.println("Please enter either \"y\" or \"n\".");
                }
                
            }else{
                System.out.println("Please enter either \"y\" or \"n\".");
            }
            
        } else if (responseYN1 == 'n'){ 
            System.out.println("Is it divisible by 3?");
            char responseYN9 = myScanner.next(".").charAt(0);
            
            if (responseYN9 == 'y'){
               System.out.println("If you divide this number by 3, is the result greater than 1?");
               char responseYN11 = myScanner.next(".").charAt(0);
                
                if (responseYN11 == 'y'){
                    System.out.println("Is your number 9?");
                    char responseYN12 = myScanner.next(".").charAt(0);
                    
                    if (responseYN12 == 'y'){
                        System.out.println("Of course it is. I am never incorrect.");
                    }else if (responseYN12 == 'n'){
                        System.out.println("Liar.");
                    }else{
                        System.out.println("Please enter either \"y\" or \"n\".");
                    }
                    
                } else if (responseYN11 == 'n'){
                    System.out.println("Is your number 3?");
                    char responseYN13 = myScanner.next(".").charAt(0);
                    
                    if (responseYN13 == 'y'){
                        System.out.println("Of course it is. I am never incorrect.");
                    }else if (responseYN13 == 'n'){
                        System.out.println("Liar.");
                    }else{
                        System.out.println("Please enter either \"y\" or \"n\"."); 
                    }
                }else{
                  System.out.println("Please enter either \"y\" or \"n\".");  
                }
           
            }else if (responseYN9 == 'n'){
                System.out.println("Is it greater than 6?");
                char responseYN14 = myScanner.next(".").charAt(0);
                
                if(responseYN14 == 'y'){
                    System.out.println("Your number is 7?");
                    char responseYN15 = myScanner.next(".").charAt(0); 
                    
                    if (responseYN15 == 'y'){
                        System.out.println("Of course it is. I am never incorrect.");
                    }else if (responseYN15 == 'n'){
                        System.out.println("Liar.");
                    }else{
                       System.out.println("Please enter either \"y\" or \"n\".");
                    }
                    
                }else if (responseYN14 == 'n'){
                    System.out.println("Is it less than 3?");
                    char responseYN16 = myScanner.next(".").charAt(0);
                    
                    if (responseYN16 == 'y'){
                       System.out.println("Is your number 1?"); 
                       char responseYN17 = myScanner.next(".").charAt(0);
                    
                        if (responseYN17 == 'y'){
                            System.out.println("Of course it is. I am never incorrect.");
                        }else if (responseYN17 == 'n'){
                            System.out.println("Liar.");
                        }else{
                            System.out.println("Please enter either \"y\" or \"n\".");
                        }
                    }else if (responseYN16 == 'n'){
                     System.out.println("Is your number 5?");
                     char responseYN18 = myScanner.next(".").charAt(0);
                     
                     if (responseYN18 == 'y'){
                         System.out.println("Of course it is. I am never incorrect.");
                     }else if (responseYN18 == 'n'){
                         System.out.println("Liar.");
                     }else{
                         System.out.println("Please enter either \"y\" or \"n\".");
                     }
                    }else{
                        System.out.println("Please enter either \"y\" or \"n\".");
                    }
                    
                    
                }else{
                    System.out.println("Please enter either \"y\" or \"n\".");
                }
                
            }else{
                System.out.println("Please enter either \"y\" or \"n\".");
            }
            
        } else{
            System.out.println("Please enter either \"y\" or \"n\".");
        }
        
    } //end main method
    
} //end class