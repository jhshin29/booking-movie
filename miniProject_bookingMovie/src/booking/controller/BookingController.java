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

	//-------------------- 영화, 영화관, 예약자 전체 리스트 조회 -------------------------
	public void getMovieList() {
		ArrayList<Movie> movieList = service.getMovieList();

		if (movieList.size() != 0) {
			EndView.movieListView(movieList);
		} else {
			EndView.messageView("영화 리스트가 존재하지 않습니다.");
		}
	}

	public void getTheaterList() {
		ArrayList<Theater> theaterList = service.getTheaterList();

		if (theaterList.size() != 0) {
			EndView.theaterListView(theaterList);
		} else {
			EndView.messageView("영화관 리스트가 존재하지 않습니다.");
		}
	}

	public void getBookerList() {
		ArrayList<Booker> bookerList = service.getBookerList();

		if (bookerList.size() != 0) {
			EndView.bookerListView(bookerList);
		} else {
			EndView.messageView("예약자 리스트가 존재하지 않습니다.");
		}
	}
	
	public void getBookingList() {
		HashMap<Integer, Booking> booking = service.getBookingList();
		
		if (!booking.isEmpty()) {
			EndView.bookingListView(booking);
		} else {
			EndView.messageView("영화 예매 리스트가 존재하지 않습니다.");
		}
	}

	//-------------------- 영화, 영화관, 예약자 검색해서 1개 조회 -------------------------
	public void getMovie(String movieTitle) {
		Movie movie = service.getMovie(movieTitle);
		
		if (movie != null) {
			EndView.movieView(movie);
		} else {
			EndView.messageView("찾으시는 영화가 없습니다.");
		}
	}

	public void getTheater(String theaterName) {
		Theater theater = service.getTheater(theaterName);
		
		if (theater != null) {
			EndView.theaterView(theater);
		} else {
			EndView.messageView("찾으시는 영화관이 없습니다.");
		}
	}
	
	public void getBooker(String bookerName) {
		Booker booker = service.getBooker(bookerName);
		
		if (booker != null) {
			EndView.bookerView(booker);
		} else {
			EndView.messageView("찾으시는 예약자가 없습니다.");
		}
	}

	public void getBooking(int i) {
		Booking booking = service.getBooking(i);
		
		if (booking != null) {
			EndView.bookingView(booking);
		} else {
			EndView.messageView("찾으시는 예약 내역이 없습니다.");
		}
	}

	//-------------------- 예매 내역 추가 -------------------------
	public void insertBooking(Booking booking) {
		if(booking != null) {
			service.bookingInsert(booking);
			System.out.println(booking.getBookerInfo().getBookerName()+"님, "+booking.getMovie().getMovieTitle()+" 예매 성공");
			
		}else {
			EndView.messageView("새로 저장하고자 하는 예매 정보가 없습니다. 재확인 해 주세요");
		}
	}

	//-------------------- 예애 내역 수정 -------------------------
	public void updateBooking(int bookingNum, String bookerName) {
		if(bookerName != null) {
			service.bookingUpdate(bookingNum, bookerName);
		}else {
			EndView.messageView("수정하려는 영화 정보가 없습니다, 재확인 해 주세요");
		}
	}

	public void deleteBooking(int bookingNum, String bookerName) {
		if(bookerName != null) {
			service.bookingDelete(bookingNum, bookerName);
		}else {
			EndView.messageView("삭제하려는 영화 정보가 없습니다, 재확인 해 주세요");
		}
	}
	
}
