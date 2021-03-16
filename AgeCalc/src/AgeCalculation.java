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
		String[] splitCurrent = dtf.format(now).split("/");
		int currentMonth = Integer.parseInt(splitCurrent[0]);
		int currentDay = Integer.parseInt(splitCurrent[1]);
		int currentYear = Integer.parseInt(splitCurrent[2]);
		
		// Defining birthdate
		String birthdate = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY):");
		String[] splitBirthdate = birthdate.split("/");
		int birthMonth = Integer.parseInt(splitBirthdate[0]);
		int birthDay = Integer.parseInt(splitBirthdate[1]);
		int birthYear = Integer.parseInt(splitBirthdate[2]);
		
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