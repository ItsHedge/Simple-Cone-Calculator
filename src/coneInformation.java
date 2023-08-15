
//CLASS//
public class coneInformation {
		
		private double coneRadius;
		private double height;
		private double volume;
		private double diameter;
		private double pi = Math.PI;
		
		public coneInformation(double coneRadius, double height, double volume, double diameter) {
				this.coneRadius = coneRadius;
				this.height = height;
				this.volume = volume;
				this.diameter = diameter;

		}
		
		public coneInformation(double coneRadius, double height, double diameter) {
				
		}
		
		public coneInformation(double height, double diameter) {
			
		}
		
		public double getconeRadius() {
			return coneRadius;
		}
		
		public void setConeRadius(double coneRadius) {
			this.coneRadius = coneRadius;	
		}

		public double getHeight() {
			return height;
		}
		
		public void setHeight(double height) {
			this.height = height;	
		}
		
		public double getDiameter() {
			return diameter;
		}
		
		public void setDiameter(double diameter) {
			this.diameter = diameter;	
		}
		



	//METHODS//	
	
	public static double calculateRadius(double diameter) { //Method for calculating cone Radius
        double coneRadius = diameter / 2; //Determine the radius based on the diameter
        return coneRadius; //Stores value for method to variable "radius"
    }
	
	public static double calculateVolume(double coneRadius, double height, double pi) { // Method for calculating cone Volume
		double volume = ((Math.pow(coneRadius, 2)) * height * pi) / 3; //Formula for calculating the volume of a cone
		return volume; //Stores value for method to variable "volume"
	}

	public static String finalValues(double coneRadius, double diameter, double volume) { //Method to print the calculated values
		String coneInfo = 
            " The radius of the cone is " + String.format("%,.2f", coneRadius) + " cm" + //Inform the user of the radius
          "\n The diameter of the cone is " + String.format("%,.2f", diameter) + " cm" + //Inform the user of the diameter
		  "\n The volume of the cone is " + String.format("%,.2f", volume) + " cmł"; //Inform the user of the volume
		return coneInfo; 
	}
	
	public static double calculateDiameter(double coneRadius) { //Method to calculate diameter
		double diameter = coneRadius * 2; //Formula for calculating the diameter from the radius
		return diameter; //Store the value in the variable "diameter"
		
	}
	
	public static void menuPrompt()  { //Method for prompting the menu
		System.out.println("Please select from the following using your NumPad; \n \n" + " 1. Calculate Volume with Height & Diameter \n 2. Calculate Volume with Height & Radius\n 3. Full Commitment \n 4. Exit "); //Menu
		return;
	}

	public static void roll() throws InterruptedException { //Rick Roll
		System.out.println("We're no strangers to love");
		Thread.sleep(2000);
		System.out.println("You know the rules, and so do I");
		Thread.sleep(2000);
		System.out.println("A full commitment's what I'm thinking of");
		Thread.sleep(3500);
		System.out.println("You wouldn't get this from any other guy\n");
		Thread.sleep(2000);
		System.out.println("I just wanna tell you how I'm feeling");
		Thread.sleep(2000);
		System.out.println("Gotta make you understand\n");
		Thread.sleep(2000);
		System.out.println("Never gonna give you up");
		Thread.sleep(2000);
		System.out.println("Never gonna let you down");
		Thread.sleep(2000);
		System.out.println("Never gonna run around and desert you...");
		Thread.sleep(5000);

	}
	
	
}
