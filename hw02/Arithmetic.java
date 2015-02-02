/*
Liam Gamble
 hw02 Arithmetic Calculations
 1/30/2105

 This program should calculate the cost of 
 purchases made at Walmart, including any 
 sales taxes.
 */
 
 public class Arithmetic {
     
     public static void main(String[] args){
       
        // Let's have some input variables
        
        int nSocks = 3;     //Number of socks needed
        double sockCost$ = 2.58;    // Cost per socks
        int nGlasses = 6;    // Number of glasses needed
        double glassCost$ = 2.29;   // Cost per glass
        int nEnvelopes = 1;     // How many envelopes we need
        double envelopeCost$ = 3.25;    // Cost per enevelope
        
        double taxPercent = 0.06;   // Tax percentage
        
        // We need a few different outputs: Total of each category of items & <-- including percent, 
        // total of everything before tax, and total amount paid.
        
        // Here are the totals of each item categories individually without tax.
       
        double socksTotalCost = sockCost$ * nSocks;     // Socks alone cost, no tax
        double glassesTotalCost = glassCost$ * nGlasses;    // Glasses alone cost, no tax
        double envelopesTotalCost = envelopeCost$ * nEnvelopes;     // Envelopes alone cost, no tax
        
        // This computes the amount of sales tax alone on the items.
        
        double temp1SocksSalesTax = sockCost$ * taxPercent;  // Temporary variable used to truncate the sales tax.
        int temp2SocksSalesTax = (int)(temp1SocksSalesTax * 100.0);  // Temporary variable used to truncate the sales tax.
        double socksSalesTax = temp2SocksSalesTax / 100.0;      // Socks tax, truncated
        
        double temp1GlassesSalesTax = glassCost$ * taxPercent;   // Temporary variable used to truncate the sales tax.
        int temp2GlassesSalesTax = (int)(temp1GlassesSalesTax * 100.0);   // Temporary variable used to truncate the sales tax.
        double glassesSalesTax = temp2GlassesSalesTax / 100.0;    // Glasses tax, truncated
        
        double temp1EnvelopesSalesTax = envelopeCost$ * taxPercent;   // Temporary variable used to truncate the sales tax.
        int temp2EnvelopesSalesTax = (int)(temp1EnvelopesSalesTax* 100.0);   // Temporary variable used to truncate the sales tax.
        double envelopesSalesTax = temp2EnvelopesSalesTax / 100.0;   // Envelopes tax, truncated
        
        // This computes the total cost of an individual items without tax.
        
        double temp1SocksTotalWithTax = socksTotalCost + socksSalesTax;   // Temporary variable used to truncate the total with tax.
        int temp2SocksTotalWithTax = (int)(temp1SocksTotalWithTax * 100.0);  // Temporary variable used to truncate the total with tax.
        double socksTotalWithTax = temp2SocksTotalWithTax / 100.0;   // Total with tax 
        
        
        double temp1GlassesTotalWithTax = glassesTotalCost + glassesSalesTax;  // Temporary variable used to truncate the total with tax.
        int temp2GlassesTotalWithTax = (int)(temp1GlassesTotalWithTax * 100.0);  // Temporary variable used to truncate the total with tax.
        double glassesTotalWithTax = temp2GlassesTotalWithTax / 100.0;   // Total with tax
        
        
        double temp1EnvelopesTotalWithTax = envelopesTotalCost + envelopesSalesTax;  // Temporary variable used to truncate the total with tax.
        int temp2EnvelopesTotalWithTax = (int)(temp1EnvelopesTotalWithTax * 100.0);  // Temporary variable used to truncate the total with tax.
        double envelopesTotalWithTax = temp2EnvelopesTotalWithTax / 100.0;   // Total with tax
        
        
       
       // This is the total sales tax alone, and all the items with and without tax, respectively.
      
        double totalCostNoTax = socksTotalCost + glassesTotalCost + envelopesTotalCost;
       
        double temp1TotalCostWithTax = socksTotalWithTax + glassesTotalWithTax + envelopesTotalWithTax; // Temporary variable used to truncate the total with tax.
        int temp2TotalCostWithTax = (int)(temp1TotalCostWithTax * 100.0);  // Temporary variable used to truncate the total with tax.
        double totalCostWithTax = temp2TotalCostWithTax / 100.0;  // Total with tax
        
        double temp1TotalSalesTax = socksSalesTax + glassesSalesTax + envelopesSalesTax;  // Temporary variable used to truncate the total tax.
        int temp2TotalSalesTax = (int)(temp1TotalSalesTax * 100.0);  // Temporary variable used to truncate the total tax.
        double totalSalesTax = temp2TotalSalesTax / 100.0;  // Total tax
        
      
        // These display what each total is along with the number itself.
        System.out.println("Items bought: Socks");
        System.out.println("Total Socks Bought: " + nSocks);
        System.out.println("Cost per Socks without tax: " + sockCost$);
        
        System.out.println("Sales tax on Sock: " + socksSalesTax);
        System.out.println("Cost per Socks with tax: " + (sockCost$ + socksSalesTax));
        System.out.println("Total cost of socks without tax: " + socksTotalCost);
        System.out.println("Total cost of Socks including tax: " + socksTotalWithTax );
        
        System.out.println("");
        
        System.out.println("Items bought: Glasses");
        System.out.println("Total Glasses Bought: " + nGlasses);
        System.out.println("Cost per Glass without tax: "+ glassCost$);
        
        System.out.println("Sales tax on Glass: " + (glassesSalesTax ));
        System.out.println("Cost per Glass with tax: " + (glassCost$ + glassesSalesTax));
        System.out.println("Total cost of Glasses without tax: " + glassesTotalCost);
        System.out.println("Total cost of Glasses including tax: " + glassesTotalWithTax);
        
        System.out.println("");
        
        System.out.println("Items bought: Envelopes");
        System.out.println("Total Envelopes bought: " + nEnvelopes);
        System.out.println("Cost per Envelope without tax: " + envelopeCost$);
        
        System.out.println("Sales tax on Envelope: " + envelopesSalesTax);
        System.out.println("Cost per Envelope with tax: " + (envelopeCost$ + envelopesSalesTax));
        System.out.println("Total cost of Envelopes without tax: " + envelopesTotalCost);
        System.out.println("Total cost of Envelopes including tax: " + envelopesTotalWithTax);
        
        System.out.println("");
        
        System.out.println("Total cost of Purchases before tax: " + totalCostNoTax);
        System.out.println("Total Sales tax: " + totalSalesTax);
        System.out.println("Total cost of Purchases: " + totalCostWithTax);
        
     }
     
     
 }