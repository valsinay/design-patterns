package observer;

public class MagicalBoard implements Observer {

	private String name;
	private MagicalBoard board;
	
	public MagicalBoard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
	   if(this.board == null) {
		   System.out.println("No Board set");
		   return;
	   }
	   

	}

	@Override
	public void setObservable(Observable observer) {
		// TODO Auto-generated method stub

	}

}
