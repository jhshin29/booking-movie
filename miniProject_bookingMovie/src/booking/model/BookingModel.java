package booking.model;

import java.util.ArrayList;
import java.util.HashMap;

import booking.model.dto.Booker;
import booking.model.dto.Booking;
import booking.model.dto.Movie;
import booking.model.dto.Theater;

public class BookingModel {
	
	private static BookingModel instance = new BookingModel();
	
	private static ArrayList<Movie> movieList = new ArrayList<>();
	private static ArrayList<Theater> theaterList = new ArrayList<>();
	private static ArrayList<Booker> bookerList = new ArrayList<>();
//	private static ArrayList<Booking> bookingList = new ArrayList<>();
	private static Booking booking = new Booking();
	private static HashMap<Integer, Booking> bookingList = new HashMap<>();
	static int bookingNum = 1;
	
	static {
		
		movieList.add(new Movie("모가디슈", "류승완", "김윤석", "액션,드라마", "2021-07-28", "15세 관람가" , 121));
		movieList.add(new Movie("보스 베이비2" , "톰 맥그라스", "알렉 볼드윈", "애니메이션,코미디,모험",  "2021-07-21", "전체 관람가" , 107));
		movieList.add(new Movie("블랙 위도우","케이트 쇼트랜드", "스칼릿 조핸슨", "액션, 모험, SF", "2021-07-07",  "12세 관람가" , 134));
		movieList.add(new Movie("랑종", "반종 피산다나쿤", "나릴야 군몽콘켓", "공포, 스릴러, 드라마", "2021-07-14", "청소년 관람불가", 131));
		movieList.add(new Movie("정글 크루즈", "자움 콜렛 세라", "드웨인 존슨", "액션, 모험", "2021-07-28", "12세 관람가", 127));
		movieList.add(new Movie("우리, 둘", "필리포 메네게티", "바바라 수코바", "드라마,멜로/로맨스", "2021-07-28", "12세 관람가", 95));
		movieList.add(new Movie("아이스 로드", "조나단 헨슬레이", "리암 니슨", "스릴러", "2021-07-21", "12세 관람가", 110));
		movieList.add(new Movie("꽃다발 같은 사랑을 했다", "도이 노부히로", "아리무라 카스미", "멜로/로맨스", "2021-07-14", "12세 관람가", 123));
		movieList.add(new Movie("피닉스",  "크리스티안 펫졸트", "니나 호스", "드라마/로맨스/멜로", "2021-07-22", "12세 관람가", 98));
		movieList.add(new Movie("방법:재차의","김용완", "엄지완", "미스터리,스릴러",  "2021-07-28", "15세 관람가" , 109));
		
		theaterList.add(new Theater("메가박스" , "청담"));
		theaterList.add(new Theater("CGV", "신사동"));
		theaterList.add(new Theater("롯데시네마", "대치1동"));
		theaterList.add(new Theater("씨네Q", "압구정동"));
		theaterList.add(new Theater("대한극장", "논현2동"));
		theaterList.add(new Theater("조이앤시네마", "모현동"));
		theaterList.add(new Theater("아리랑시네센터", "세곡동"));
		theaterList.add(new Theater("영화공간주안", "논현1동"));
		theaterList.add(new Theater("영화의전당", "일원2동"));
		theaterList.add(new Theater("전주시네마타운", "전북동"));
		
		bookerList.add(new Booker("엔코아", "010-1239-2383"));
		bookerList.add(new Booker("제빵왕", "010-3823-5932"));
		bookerList.add(new Booker("김탁구", "010-2383-3834"));
		bookerList.add(new Booker("유재석", "010-2422-5813"));
		bookerList.add(new Booker("이여름", "010-5904-2783"));
		bookerList.add(new Booker("박겨울", "010-6953-9723"));
		
		booking.setBookingDate("2021-04-21");
		booking.setBookerInfo(new Booker("박정훈", "010-0238-4723"));
		booking.setTheater(new Theater("롯데시네마 건대", "건대"));
		booking.setMovie(new Movie("모가디슈", "류승완", "김윤석", "액션,드라마", "2021-07-28", "15세 관람가" , 121));
		
		bookingList.put(bookingNum++ , booking);
	
	}
	
	public static BookingModel getInstance() {
		return instance;
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public static void setMovieList(ArrayList<Movie> movieList) {
		BookingModel.movieList = movieList;
	}

	public ArrayList<Theater> getTheaterList() {
		return theaterList;
	}

	public static void setTheaterList(ArrayList<Theater> theaterList) {
		BookingModel.theaterList = theaterList;
	}

	public ArrayList<Booker> getBookerList() {
		return bookerList;
	}

	public static void setBookerList(ArrayList<Booker> bookerList) {
		BookingModel.bookerList = bookerList;
	}

	public static Booking getBooking() {
		return booking;
	}

	public static void setBooking(Booking booking) {
		BookingModel.booking = booking;
	}

	public HashMap<Integer, Booking> getBookingList() {
		return bookingList;
	}

	public static void setBookingList(HashMap<Integer, Booking> bookingList) {
		BookingModel.bookingList = bookingList;
	}

	public static void setInstance(BookingModel instance) {
		BookingModel.instance = instance;
	}

	public void insertBooking(Booking booking2) {
		bookingList.put(bookingNum++ , booking2);
	}

}
