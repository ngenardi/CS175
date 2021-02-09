import java.util.Scanner;
import java.text.DecimalFormat;

public class HousePaintingEstimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define external methods
		Scanner scan = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("##.00");
		
		// Input house dimensions
		System.out.print("Enter the length/width of the house in feet: ");
		float lengthOfHouse = scan.nextFloat();
		
		System.out.print("Enter the height of the house from the base to the base of the roof in feet: ");
		float heightToRoof = scan.nextFloat();
		
		System.out.print("Enter the height of the house from the base to the peak of the roof: ");
		float heightToPeak = scan.nextFloat();
		
		// Input number of doors and door dimensions
		System.out.print("Enter the number of doors on the house: ");
		int numberOfDoors = scan.nextInt();
		
		System.out.print("Enter the width of the doors: ");
		float widthOfDoors = scan.nextFloat();
		
		System.out.print("Enter the height of the doors:");
		float heightOfDoors = scan.nextFloat();
		
		// Input number of windows and window dimensions
		System.out.print("Enter the number of windows on the house: ");
		int numberOfWindows = scan.nextInt();
		
		System.out.print("Enter the width of the windows: ");
		float widthOfWindows = scan.nextFloat();
		
		System.out.print("Enter the height of the windows: ");
		float heightOfWindows = scan.nextFloat();
		
		// Input cost per square foot
		System.out.print("Enter the cost per square foot to paint the house: ");
		float unitCost = scan.nextFloat();
		
		// Calculate dimensions
		float areaOfDoors = widthOfDoors * heightOfDoors;
		float areaOfWindows = widthOfWindows * heightOfWindows;
		float heightOfRoof = heightToPeak - heightToRoof;
		
		float houseSurfaceArea = 4 * (lengthOfHouse*heightToRoof) + (heightOfRoof * lengthOfHouse);
		float totalSurfaceArea = houseSurfaceArea - (numberOfDoors * areaOfDoors) - (numberOfWindows * areaOfWindows);
		float totalCost = totalSurfaceArea * unitCost;
		
		if (totalSurfaceArea < 0) {
			System.out.println("Error: Area of doors and windows exceeds the house surface area.");
		}
		else {
			System.out.println("Your cost of painting " + totalSurfaceArea + "ft² is $" + money.format(totalCost) + ".");
		}
	}

}
