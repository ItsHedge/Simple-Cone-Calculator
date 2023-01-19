import java.util.Scanner;


//CLASS//
public class main { 
	

	
	public static void main(String[] args) throws InterruptedException { //Method main
		
	//INITIALIZE//		
	 double height = 0; 
	 double volume = 0;
	 double diameter = 0;
	 double coneRadius = 0;
 	 double pi = Math.PI;
 	 
	Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Welcome to Amara's Cone Volume Calculator! \nThis program determines the volume of a cone in cubic centimeters.\n"); //Greeting
				
		coneInformation.menuPrompt(); //Print the menu to the console for the user
				
	int menuPrompt = scanner.nextInt();  //Read user input
			
			switch(menuPrompt) { //Menu Switch Statement
			
				case 1 : //Height + Diameter known values
			    	
			    	System.out.print("Please enter the height of the cone: "); //Get cone's height
						height = scanner.nextDouble();  //Read user input
		        
					System.out.println("Please enter the cone's diameter: "); //Get cone's diameter
		    			diameter = scanner.nextDouble();  //Read user input   
		        
		    			coneRadius = coneInformation.calculateRadius(diameter); //Execute method to get radius from diameter
		        
		    			volume = coneInformation.calculateVolume(coneRadius, height, pi); //Execute method to get volume from height and radius
		        
		    		System.out.println(coneInformation.finalValues(coneRadius, diameter, volume)); //Execute method to inform user of calculated values
		        
		    		break; 
		    		
			    case 2 : //Height + Radius known values
			    	
			    	System.out.print("Please enter the height of the cone: "); //Get cone's height
						height = scanner.nextDouble();  //Read user input
			    	
					System.out.println("Please enter the cone's radius: "); //Get cone's radius
		    			coneRadius = scanner.nextDouble();  //Read user input  
		    			
		    			volume = coneInformation.calculateVolume(coneRadius, height, pi); //Volume calculation using known values
		    			
		    			diameter = coneInformation.calculateDiameter(coneRadius); //Diameter calculation using known values
		    			
		    		System.out.println(coneInformation.finalValues(coneRadius, diameter, volume)); //Execute method to inform user of calculated values
		                
				    break;
				      
				case 3 :
		          
					coneInformation.roll(); //Roll method execution
					
					break;   
			}
			
			while (menuPrompt > 4)  { //If an illegal selection is made, print the menu to the console again
				System.out.println("\nInvalid menu option\n"); //User warning to use correct input
				coneInformation.menuPrompt(); //Prints the menu to the console again
				return;
	
		}
			System.out.println(" \nProgrammed by Amara Harris"); //Credits to myself as the programmer
	
}
}