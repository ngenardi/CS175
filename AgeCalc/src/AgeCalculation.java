import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] daysInMonthLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// Defining current date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate now = LocalDate.now();
		int currentMonth = Integer.parseInt(dtf.format(now).substring(0, 2));
		int currentDay = Integer.parseInt(dtf.format(now).substring(3,5));
		int currentYear = Integer.parseInt(dtf.format(now).substring(6));
		
		// Defining birthdate
		String birthdate = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY):");
		int birthMonth = Integer.parseInt(birthdate.substring(0, 2));
		int birthDay = Integer.parseInt(birthdate.substring(3,5));
		int birthYear = Integer.parseInt(birthdate.substring(6));
		
		// Calculating age
		int ageYears = currentYear - birthYear;
		int ageMonths = currentMonth - birthMonth;
		int ageDays = currentDay - birthDay;
		
		// Correct for Months
		if(currentMonth<birthMonth) {
			ageYears--;
			ageMonths+=12; 
		}
		
		// Correct for Days
		if(currentDay<birthDay) {
			ageMonths--;
			if(currentYear%4==0) {
				ageDays+=daysInMonthLeap[birthMonth-1];
			}
			else {
				ageDays+=daysInMonth[birthMonth-1];
			}
		}
		
		
		JOptionPane.showMessageDialog(null, "You are " + ageYears + " year(s), " + ageMonths + " month(s), and " + ageDays + " day(s) old.");
	}
}