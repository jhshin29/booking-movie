package booking.model.dto;

public class Booking {
	
	//예약일
	private String bookingDate;
	
	//예약자 정보
	private Booker bookerInfo;
	
	//영화관
	private Theater theater;
	
	//영화
	private Movie movie;

	public Booking() {}

	public Booking(String bookingDate, Booker bookerInfo, Theater theater, Movie movie) {
		super();
		this.bookingDate = bookingDate;
		this.bookerInfo = bookerInfo;
		this.theater = theater;
		this.movie = movie;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Booker getBookerInfo() {
		return bookerInfo;
	}

	public void setBookerInfo(Booker bookerInfo) {
		this.bookerInfo = bookerInfo;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("예약일자 : ");
		builder.append(bookingDate);
		builder.append("\n[예약자]");
		builder.append(bookerInfo);
		builder.append("\n[영화관]");
		builder.append(theater);
		builder.append("\n[영화 정보]");
		builder.append(movie);
		return builder.toString();
	}

}
