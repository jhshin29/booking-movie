package booking.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import booking.model.dto.Booker;
import booking.model.dto.Booking;
import booking.model.dto.Movie;
import booking.model.dto.Theater;

public class EndView {
	
	public static void messageView(String message) {
		System.out.println(message);
	}
	
	//---------------- 전체 리스트 출력 --------------------
	public static void movieListView(ArrayList<Movie> movieList) {
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
	}
	
	public static void theaterListView(ArrayList<Theater> theaterList) {
		for (Theater theater : theaterList) {
			System.out.println(theater);
		}		
	}

	public static void bookerListView(ArrayList<Booker> bookerList) {
		for (Booker booker : bookerList) {
			System.out.println(booker);
		}		
	}
	
	public static void bookingListView(HashMap<Integer, Booking> booking) {
		Set<Integer> keyAll = booking.keySet();
		Iterator<Integer> ks = keyAll.iterator();
		Integer key = null;
		while(ks.hasNext()) {
			key = ks.next();
			System.out.println(key + "번째 " + booking.get(key));
		}
	}

	
	//---------------- 1개 검색 결과 출력 --------------------
	public static void movieView(Movie movie) {
		if (movie != null) {
			System.out.println(movie);
		} else {
			System.out.println("해당 영화는 존재하지 않습니다.");
		}
	}
	
	public static void theaterView(Theater theater) {
		if (theater != null) {
			System.out.println(theater);
		} else {
			System.out.println("해당 영화는 존재하지 않습니다.");
		}		
	}

	public static void bookerView(Booker booker) {
		if (booker != null) {
			System.out.println(booker);
		} else {
			System.out.println("해당 영화는 존재하지 않습니다.");
		}		
	}

	public static void bookingView(Booking booking) {
		if (booking != null) {
			System.out.println(booking);
		} else {
			System.out.println("해당 예약은 존재하지 않습니다.");
		}	
	}

}
