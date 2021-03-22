import javax.swing.JOptionPane;

public class YearToRomanNumeralNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yearInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));
		
		System.out.println(yearInput);
		
		int millenia = yearInput/1000%10; 
		int centuries = yearInput/100%10; 
		int decades = yearInput/10%10;
		int years = yearInput%10;
		
		System.out.println(millenia + " " + centuries + " " + decades + " " + years);
		
		String romanNumeralYear = "M".repeat(millenia)+"C".repeat(centuries)+"X".repeat(decades)+"I".repeat(years); 
		romanNumeralYear = romanNumeralYear.replace("IIIII", "V");
		romanNumeralYear = romanNumeralYear.replace("IIII", "IV");
		romanNumeralYear = romanNumeralYear.replace("XXXXX", "L");
		romanNumeralYear = romanNumeralYear.replace("XXXX", "XL");
		romanNumeralYear = romanNumeralYear.replace("CCCCC", "D");
		romanNumeralYear = romanNumeralYear.replace("CCCC", "CD");
		
		System.out.println(romanNumeralYear);
		
		JOptionPane.showMessageDialog(null, "The roman numerals for the year " + yearInput + " is " + romanNumeralYear);
	}

}
