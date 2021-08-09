package booking.controller;

import java.util.ArrayList;
import java.util.HashMap;

import booking.model.dto.Booker;
import booking.model.dto.Booking;
import booking.model.dto.Movie;
import booking.model.dto.Theater;
import booking.service.BookingService;
import booking.view.EndView;

public class BookingController {
	private static BookingController instance = new BookingController();
	private BookingService service = BookingService.getInstance();

	private BookingController() {}

	public static BookingController getInstance() {
		return instance;
	}

	//-------------------- ��ȭ, ��ȭ��, ������ ��ü ����Ʈ ��ȸ -------------------------
	public void getMovieList() {
		ArrayList<Movie> movieList = service.getMovieList();

		if (movieList.size() != 0) {
			EndView.movieListView(movieList);
		} else {
			EndView.messageView("��ȭ ����Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	public void getTheaterList() {
		ArrayList<Theater> theaterList = service.getTheaterList();

		if (theaterList.size() != 0) {
			EndView.theaterListView(theaterList);
		} else {
			EndView.messageView("��ȭ�� ����Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	public void getBookerList() {
		ArrayList<Booker> bookerList = service.getBookerList();

		if (bookerList.size() != 0) {
			EndView.bookerListView(bookerList);
		} else {
			EndView.messageView("������ ����Ʈ�� �������� �ʽ��ϴ�.");
		}
	}
	
	public void getBookingList() {
		HashMap<Integer, Booking> booking = service.getBookingList();
		
		if (!booking.isEmpty()) {
			EndView.bookingListView(booking);
		} else {
			EndView.messageView("��ȭ ���� ����Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	//-------------------- ��ȭ, ��ȭ��, ������ �˻��ؼ� 1�� ��ȸ -------------------------
	public void getMovie(String movieTitle) {
		Movie movie = service.getMovie(movieTitle);
		
		if (movie != null) {
			EndView.movieView(movie);
		} else {
			EndView.messageView("ã���ô� ��ȭ�� �����ϴ�.");
		}
	}

	public void getTheater(String theaterName) {
		Theater theater = service.getTheater(theaterName);
		
		if (theater != null) {
			EndView.theaterView(theater);
		} else {
			EndView.messageView("ã���ô� ��ȭ���� �����ϴ�.");
		}
	}
	
	public void getBooker(String bookerName) {
		Booker booker = service.getBooker(bookerName);
		
		if (booker != null) {
			EndView.bookerView(booker);
		} else {
			EndView.messageView("ã���ô� �����ڰ� �����ϴ�.");
		}
	}

	public void getBooking(int i) {
		Booking booking = service.getBooking(i);
		
		if (booking != null) {
			EndView.bookingView(booking);
		} else {
			EndView.messageView("ã���ô� ���� ������ �����ϴ�.");
		}
	}

	//-------------------- ���� ���� �߰� -------------------------
	public void insertBooking(Booking booking) {
		if(booking != null) {
			service.bookingInsert(booking);
			System.out.println(booking.getBookerInfo().getBookerName()+"��, "+booking.getMovie().getMovieTitle()+" ���� ����");
			
		}else {
			EndView.messageView("���� �����ϰ��� �ϴ� ���� ������ �����ϴ�. ��Ȯ�� �� �ּ���");
		}
	}

	//-------------------- ���� ���� ���� -------------------------
	public void updateBooking(int bookingNum, String bookerName) {
		if(bookerName != null) {
			service.bookingUpdate(bookingNum, bookerName);
		}else {
			EndView.messageView("�����Ϸ��� ��ȭ ������ �����ϴ�, ��Ȯ�� �� �ּ���");
		}
	}

	public void deleteBooking(int bookingNum, String bookerName) {
		if(bookerName != null) {
			service.bookingDelete(bookingNum, bookerName);
		}else {
			EndView.messageView("�����Ϸ��� ��ȭ ������ �����ϴ�, ��Ȯ�� �� �ּ���");
		}
	}
	
}
