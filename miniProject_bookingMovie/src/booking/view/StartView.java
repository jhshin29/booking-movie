package booking.view;

import booking.controller.BookingController;
import booking.model.dto.Booker;
import booking.model.dto.Booking;
import booking.model.dto.Movie;
import booking.model.dto.Theater;

public class StartView {
	
	public static void main(String[] args) {
		
		BookingController controller = BookingController.getInstance();
		
		System.out.println("----- 1. 전체 리스트 검색 -----");
		System.out.println("----- 1-1. 상영 영화 전체 리스트 검색 -----");
		controller.getMovieList();
		
		System.out.println("\n----- 1-2. 영화관 전체 리스트 검색 -----");
		controller.getTheaterList();
		
		System.out.println("\n----- 1-3. 회원 전체 리스트 검색 -----");
		controller.getBookerList();
		
		System.out.println("\n----- 1-4. 영화 예매 전체 리스트 검색 -----");
		controller.getBookingList();
		
		System.out.println("\n----- 2. 1개 검색  -----");
		System.out.println("----- 2-1. 상영 영화 검색 -----");
		controller.getMovie("우리, 둘");
		
		System.out.println("\n----- 2-2. 영화관 검색 -----");
		controller.getTheater("아리랑시네센터");
		
		System.out.println("\n----- 2-3. 회원 검색 -----");
		controller.getBooker("이여름");
		
		System.out.println("\n----- 2-4. 예약내역 확인 -----");
		controller.getBooking(1);
		
		System.out.println("\n----- 3. 예약 추가  -----");
		Booking newBooking = new Booking("2021-08-12"
							, new Booker("엔코아", "010-0382-5921")
							, new Theater("롯데시네마 춘천", "강원도 춘천")
							, new Movie("센과 치히로의 행방불명", "미야자키 하야오", "센&하쿠", "판타지/어린이", "2002-06-28", "전체 관람가" , 125));
		Booking newBooking2 = new Booking("2021-08-09"
				, new Booker("박승철", "010-7232-1284")
				, new Theater("롯데시네마 양양", "강원도 양양")
				, new Movie("더 수어사이드 스쿼드", "제임스 건", "마고 로비", "액션/모험", "2021-08-04", "청소년 관람불가" , 132));
		System.out.println("\n----- 3-1. 추가  -----");
		controller.insertBooking(newBooking);
		controller.insertBooking(newBooking2);
		System.out.println("\n----- 3-2. 추가 뒤 예약 조회  -----");
		controller.getBookingList();
		
		System.out.println("\n----- 4. 예약 수정  -----");
		controller.updateBooking(2, "엔코아");
		System.out.println("\n----- 4-1. 수정 뒤 예약 조회  -----");
		controller.getBookingList();
		
		System.out.println("\n----- 5. 예약 삭제  -----");
		controller.deleteBooking(2, "엔코아");
		System.out.println("\n----- 5-1. 삭제 뒤 예약 확인  -----");
		controller.getBooking(2);
		System.out.println("\n----- 5-2. 삭제 뒤 예약리스트 조회  -----");
		controller.getBookingList();
		
	}

}
