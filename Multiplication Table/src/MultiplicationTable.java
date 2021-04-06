import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int width,height;
		
		System.out.print("Input the width of the multiplication table: ");
		width = scan.nextInt();
		
		System.out.print("Input the height of the multiplication table: ");
		height = scan.nextInt();
		
		for(int i=1;i<=height;i++) {
			String line = "";
			for(int j=1;j<=width;j++) {
				line+= i*j+ "\t";
			}
			System.out.println(line);
		}
	}

}
