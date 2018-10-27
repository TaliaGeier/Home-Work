package alarm_clock;

public class ExtendedTime extends SimpleTime {
	// ATTRIBUTES
	private boolean is24Hours; // defines whether the time is in 12-hour-format or 24-hour-format

	// DEFAULT CONSTRUCTOR
	public ExtendedTime() {
		super(0, 0, 0);
		this.is24Hours = true;
	}

	// CONSTRUCTOR
	public ExtendedTime(int hour, int minute, int second, boolean is24Hours) {
		super(hour, minute, second);
		this.is24Hours = is24Hours;
	}

	// SETTER & GETTER
	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}

	// METHOD
	// Method to print out the time in the desired format
	@Override
	public String toString() {
		if(is24Hours==true || hour<=12) {
			return super.toString();
		}else {
			return String.format("%02d:%02d:%02d", hour-12, minute, second);
		}
		
	}
}
