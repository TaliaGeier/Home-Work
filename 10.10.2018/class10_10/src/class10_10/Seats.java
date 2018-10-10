package class10_10;

public class Seats {
	private int price;
	private boolean IsSeatTaken;
	
	
	
	public Seats(boolean isSeatTaken) {
		super();
		this.price = ((int) (Math.random() * 90 - 70) + 70);
		IsSeatTaken = isSeatTaken;
	}
	public void setPrice() {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public boolean isIsSeatTaken() {
		return IsSeatTaken;
	}
	public void setIsSeatTaken(boolean isSeatTaken) {
		IsSeatTaken = isSeatTaken;
	}
	
	
}
