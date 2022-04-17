package observer;
import java.util.ArrayList;
import java.util.List;

public class SantaClaus implements Observable {

	private List<Observer> observers;
	private String magicalWords;
	
	
	public SantaClaus() {
		this.observers = new ArrayList<>();
		}

	@Override
	public void subscribe(Observer observer) {
        this.observers.add(observer);

	}

	@Override
	public void unsubscribe(Observer observer) {
            this.observers.remove(observer);
	}

	@Override
	public void NotifyObservers() {
		for(Observer observer:this.observers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return magicalWords;
	}


	public void setMagicalWords(String magicalWords) {
		this.magicalWords = magicalWords;
		this.NotifyObservers();
	}

}
