import javax.swing.JOptionPane;

public class RoachSimulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Enter initial roach population: ");
	    int initialPop = Integer.parseInt(input);
	    int sprayPercent;
	    
		RoachPopulation house1 = new RoachPopulation (initialPop);
		System.out.println("The Initial Roach population is " + initialPop);
		JOptionPane.showMessageDialog(null, "The Initial Roach population is " + initialPop);
		
		for(int i=1; i<=4; i++) {
			house1.breed();
			System.out.println("The Roach population after cycle " + i + " breeding is " + house1.getRoaches());
			JOptionPane.showMessageDialog(null, "The Roach population after cycle " + i + " breeding is " + house1.getRoaches());
			
			input = JOptionPane.showInputDialog("Enter the spray percentage for cycle "+ i + " as a whole number: ");
		    sprayPercent = Integer.parseInt(input);
		    house1.spray(sprayPercent);
		    System.out.println("The Roach population after cycle " + i + " " + sprayPercent + " percent spraying is " + house1.getRoaches());
		    JOptionPane.showMessageDialog(null, "The Roach population after cycle " + i + " " + sprayPercent + " percent spraying is " + house1.getRoaches());
		}
	}
	
}
