/*
Liam Gamble
 hw02 Arithmetic Calculations
 1/30/2105

 This program should calculate the cost of 
 purchases made at Walmart, including the 
 sales tax in the final result.
 */
 
 public class Arithmetic {
     
     public static void main(String[] args){
        // Let's have some input variables
        
        int nSocks = 6;     //Number of socks needed
       
        double sockCost$ = 3.50;    // Cost of socks
        
        int nGlasses = 7    // Number of glasses needed
        
        double glassCost$ = 2.99;   // Cost of glasses
        
        int nEnvelopes = 1;     // How many envelopes we need
        
        double envelopeCost$ = 4.44;    // How much the enevelopes cost
        
        double taxPercent = 0.06;   // Tax percentage
        
        
        // We need a few different outputs: Total of each category of items & <-- including percent, 
        // total of everything before tax, and total amount paid.
        
        // Here are the totals of each item categories individually without tax.
        double socksTotalCost = sockCost$ * nSocks;     // Socks alone cost, no tax
        double glassesTotalCost = glassCost$ * nGlasses;    // Glasses alone cost, no tax
        double envelopesTotalCost = envelopeCost$ * nEnvelopes;     // Envelopes alone cost, no tax
        
        // These values are the totals including tax.
        double socksTotalWithTax = (socksTotalCost * taxPercent) + socksTotalCost;      // Socks alone cost, with tax
        double glassesTotalWithTax = (glassesTotalCost * taxPercent) + glassesTotalCost;    // Glasses alone cost, with tax
        double envelopesTotalWithTax = (envelopesTotalCost * taxPercent) + envelopesTotalCost; // Envelopes alone cost, with tax
        
        // This is the total cost of all items with and without tax, respectively
        double totalCostNoTax = socksTotalCost + glassesTotalCost + envelopesTotalCost;
        double totalCostWithTax = socksTotalWithTax + glassesTotalWithTax + envelopesTotalWithTax;
        
        // These display what each total is along with the number itself.
        System.out.println("Item bought: Socks");
        System.out.println("Total Socks Bought:" + nSocks);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Total cost of socks without tax: " + socksTotalCost);
        System.out.println("Total cost of socks with tax");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
     }
     
     
 }