package booking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import booking.model.BookingModel;
import booking.model.dto.Booker;
import booking.model.dto.Booking;
import booking.model.dto.Movie;
import booking.model.dto.Theater;

public class BookingService {
	private static BookingService instance = new BookingService();
	private BookingModel bookingData = BookingModel.getInstance();

	private BookingService() {
	}

	public static BookingService getInstance() {
		return instance;
	}

	// 1. ��ü list �˻�
	// 1-1. Movie ��ü ����Ʈ
	public ArrayList<Movie> getMovieList() {
		return bookingData.getMovieList();
	}

	// 1-2. Theater ��ü ����Ʈ
	public ArrayList<Theater> getTheaterList() {
		return bookingData.getTheaterList();
	}

	// 1-3. Booker ��ü ����Ʈ
	public ArrayList<Booker> getBookerList() {
		return bookingData.getBookerList();
	}

	// 1-4. Booking(��ȭ����) ��ü ����Ʈ
	public HashMap<Integer, Booking> getBookingList() {
		return bookingData.getBookingList();
	}

	// 2. 1�� list �˻�
	// 2-1. ��ȭ �˻�
	public Movie getMovie(String movieTitle) {
		ArrayList<Movie> movieList = bookingData.getMovieList();

		for (Movie movie : movieList) {
			if (movie.getMovieTitle().equals(movieTitle)) {
				return movie;
			}
		}
		return null;
	}

	// 2-2. ��ȭ�� �˻�
	public Theater getTheater(String theaterName) {
		ArrayList<Theater> theaterList = bookingData.getTheaterList();

		for (Theater theater : theaterList) {
			if (theater.getTheaterName().equals(theaterName)) {
				return theater;
			}
		}
		return null;
	}

	// 2-3. ������ �˻�
	public Booker getBooker(String bookerName) {
		ArrayList<Booker> bookerList = bookingData.getBookerList();

		for (Booker booker : bookerList) {
			if (booker.getBookerName().equals(bookerName)) {
				return booker;
			}
		}
		return null;
	}

	// 2-4. ���� ���� �˻� (��ȣ��)
	public Booking getBooking(int i) {
		HashMap<Integer, Booking> booking = bookingData.getBookingList();

		Set<Integer> keyAll = booking.keySet();
		Iterator<Integer> keySet = keyAll.iterator();
		int key;
		while (keySet.hasNext()) {
			key = keySet.next();
			if (key == i) {
				return booking.get(key);
			}
		}
		return null;
	}

	// ���ο� ���� �߰�
	public void bookingInsert(Booking booking) {
		bookingData.insertBooking(booking);
	}

	// 1�� ���� ����
	public void bookingUpdate(int bookingNum, String bookerName) {
		Booking booking = getBooking(bookingNum);
		booking.getMovie().setMovieTitle("�� �������Ʈ ������!!");
	}
	
	// 1�� ���� ����
	public void bookingDelete(int bookingNum, String bookerName) {
		HashMap<Integer, Booking> booking = bookingData.getBookingList();

		Set<Integer> keyAll = booking.keySet();
		Iterator<Integer> keySet = keyAll.iterator();
		int key;
		while (keySet.hasNext()) {
			key = keySet.next();
			if (key == bookingNum) {
				booking.remove(key);
				break; 
			}
		}
	}

}
