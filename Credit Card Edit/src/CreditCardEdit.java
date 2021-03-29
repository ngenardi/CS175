import java.util.Scanner;
public class CreditCardEdit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String cardNum = "";
		
		while(true) {
			System.out.print("Input a card number or \"quit\" to quit: ");
			cardNum = scan.nextLine();
			if (cardNum.toLowerCase().equals("quit")) {
				System.out.println("Goodbye.");
				break;
			}
			
			for(int i=0; i<cardNum.length() ;i++) {
				if (cardNum.substring(i,i+1).equals("-") || cardNum.substring(i,i+1).equals(" ")) {
					String before = cardNum.substring(0,i);
					String after = cardNum.substring(i+1);
					cardNum = before + after;
					--i;
				}
			}
			System.out.println(cardNum);
		}
	}

}
