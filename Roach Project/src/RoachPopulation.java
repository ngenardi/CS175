
public class RoachPopulation {

	int roachPop;
	
	public RoachPopulation(int population) {
		roachPop = population;
	}
	
	public void breed() {
		roachPop*=2;
	}
	
	public void spray(int percent) {
		int roachKill = (int) (roachPop* ((double)(percent)/100));
		roachPop-=roachKill;
	}
	
	public int getRoaches() {
		return roachPop;
	}

}
