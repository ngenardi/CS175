import javax.swing.JOptionPane;

public class YearToRomanNumeral {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] romanNumeralsOnes = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] romanNumeralsTens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] romanNumeralsHundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		
		int yearInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));
		
		System.out.println(yearInput);
		
		int millenia = yearInput/1000%10; 
		int centuries = yearInput/100%10; 
		int decades = yearInput/10%10;
		int years = yearInput%10;
		
		System.out.println(millenia + " " + centuries + " " + decades + " " + years);
		
		String romanNumeralYear = "M".repeat(millenia)+romanNumeralsHundreds[centuries]+romanNumeralsTens[decades]+romanNumeralsOnes[years]; 
		
		System.out.println(romanNumeralYear);
		
		JOptionPane.showMessageDialog(null, "The roman numerals for the year " + yearInput + " is " + romanNumeralYear);
	}

}
