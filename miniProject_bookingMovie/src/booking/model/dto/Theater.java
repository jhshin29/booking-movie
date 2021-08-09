package booking.model.dto;

public class Theater {
private String theaterName;
	private String theaterLoc;
	
	public Theater() {}

	public Theater(String theaterName, String theaterLoc) {
		super();
		this.theaterName = theaterName;
		this.theaterLoc = theaterLoc;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterLoc() {
		return theaterLoc;
	}

	public void setTheaterLoc(String theaterLoc) {
		this.theaterLoc = theaterLoc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("영화관 이름 : ");
		builder.append(theaterName);
		builder.append(", 영화관 위치 : ");
		builder.append(theaterLoc);
		return builder.toString();
	}
}
