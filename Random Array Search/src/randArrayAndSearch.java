import java.util.Random;

public class randArrayAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define objects and arrays
		int[] randArray = new int[50];
		Random rand = new Random();
		int[] numOccurance = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		// Define values of randArray
		for(int i = 0; i<randArray.length; i++) {
			randArray[i] = rand.nextInt(25)+1;
			System.out.print(randArray[i] + " ");
		}
		
		// Define largest and smallest variables
		int largest = randArray[1], smallest = randArray[1];
		// Find largest and smallest numbers
		for(int num:randArray) {
			if (num<smallest) {
				smallest = num;
			}
			if (num>largest) {
				largest = num;
			}
			numOccurance[(int)num-1]++;
		}
		
		// Define "mostOccurances" (how many times the most frequent number(s) occur) 
		int mostOccurances = 0;
		// Find how much the most frequent number(s) occur
		for(int num:numOccurance) {
			if (num>mostOccurances) {
				mostOccurances = num;
			}
		}
		
		// Define "mostOccuringNums" (a list of the most frequent number(s))
		String mostOccuringNums = "";
		for(int i = 0; i<numOccurance.length; i++) {
			if (numOccurance[i] == mostOccurances) {
				mostOccuringNums += i+1 + " ";
			}
		}
		
		// Output Information
		System.out.println("\nLargest number: " + largest + "\nSmallest number: " + smallest + "\nProduct: " + largest*smallest);
		System.out.println("The following number(s) appeared " + mostOccurances + " times: " + mostOccuringNums);
	}

}
