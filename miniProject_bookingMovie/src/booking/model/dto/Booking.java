package booking.model.dto;

public class Booking {
	
	//������
	private String bookingDate;
	
	//������ ����
	private Booker bookerInfo;
	
	//��ȭ��
	private Theater theater;
	
	//��ȭ
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
		builder.append("�������� : ");
		builder.append(bookingDate);
		builder.append("\n[������]");
		builder.append(bookerInfo);
		builder.append("\n[��ȭ��]");
		builder.append(theater);
		builder.append("\n[��ȭ ����]");
		builder.append(movie);
		return builder.toString();
	}

}
