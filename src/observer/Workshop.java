package observer;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

	public List<Bike> bikes = new ArrayList<>();
	public List<Doll> dolls = new ArrayList<>();
	
	public void createBike(List<Bike> bikes) {
	  bikes.addAll(bikes);	
	}

	public void createDoll(List<Doll> dolls) {
		dolls.addAll(dolls);
	}
}
