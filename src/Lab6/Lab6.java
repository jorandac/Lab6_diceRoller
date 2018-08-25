package Lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
        Random  rand = new Random();		
        String choice = "y";
        int i=1; 
   
     System.out.println("Welcome to Grand Circus Casino!");
     
     // User Input on how many sides of the die
     System.out.println("How many sides should each die have?");
     int sides = scnr.nextInt();  //Prompt for User Input 
       
     while (choice.equalsIgnoreCase("y")) {
   
	 System.out.println(roll (sides));
	
	 int die1 = (int)(Math.random()*6) +1;
     int die2 = (int)(Math.random()*6) +1;
    
     System.out.println("Roll 1:");
     System.out.println(die1 + "\n" + die2);
     
     System.out.print("Roll again (y/n): ");
     choice = scnr.next();
     System.out.println(); 
     
     ++i; 

    }
     
     System.out.println("Goodbye, Thanks for Playing!");
  
	}

	private static int roll(int sides) {
		Random rand = new Random();		
		rand.nextInt(sides +1);
		return sides;
	}
	
	public static String callSpecial(int die1,int die2) {
		
		int specialRoll; 

	if (die1 == 1 && die2 == 1) {
		 
		return "Snake Eyes!";
	}      
	 if (die1 == 6 && die2 ==6) {
		 
		return "Box Cars!";
	}
	if (die1 + die2 == 7 || die1 + die2 == 1 ) {
		
		return "Craps!";
		 
}
	return "";
	      }
	

 }


	

	
	