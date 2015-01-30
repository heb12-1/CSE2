/* Liam Gamble
 1/30/15
 lab02-Cyclometer
 This program will: a) print the number of minutes for each trip
                    b) print the number of counts for each tirp
                    c) print the distance of each trip in miles
                    d) print the distance for the two trips combined
  
            ... given time and rotation count.
*/

public class Cyclometer {
   
    public static void main(String[] args){
        
        // This is the amount of time and counts, respectively, in Trips 1 and 2
       
        int secsTrip1 = 480;  // Time in seconds for Trip 1
       	int secsTrip2 = 3220;  // Time in second for Trip 2
		int countsTrip1 = 1561; // Counts in Trip 1
		int countsTrip2 = 9037; // Counts in Trip 2
		
		// These measurements are standard units and measurements, as well as the 
		// diameter of the wheel. They will be used to calculate distance travelled and
		// time elapsed.
		 
		
		double wheelDiameter=27.0;  // Diameter of the bicycle wheel
    	double PI=3.14159; // Measurement of pi
  	    int feetPerMile=5280;  // Number of feet in one mile
    	int inchesPerFoot=12;   // Number of inches in one foot
  	    int secondsPerMinute=60;  // Number of seconds in one minute
	      // The end distance of each individual trip, as
	                                                         // well as the total distance 
		
		// This will display how long each trip was in minutes as well as the number of counts per trip.
		
		System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
        // This calculates the distance travelled in each trip and in total, measured in miles
        
        double distanceTrip1 = countsTrip1 * wheelDiameter * PI / inchesPerFoot / feetPerMile; // Trip 1 distance in miles
    	double distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Trip 2 distance in miles
	    double totalDistance=distanceTrip1+distanceTrip2; // Total distance in Miles

        // This prints out the distances calculated above
      
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
    	System.out.println("Trip 2 was " + distanceTrip2 + " miles");
    	System.out.println("The total distance was " + totalDistance + " miles");


    } // end of main method
} // end of class