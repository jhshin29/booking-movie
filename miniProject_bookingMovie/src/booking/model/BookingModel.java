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
		
		movieList.add(new Movie("�𰡵�", "���¿�", "������", "�׼�,���", "2021-07-28", "15�� ������" , 121));
		movieList.add(new Movie("���� ���̺�2" , "�� �Ʊ׶�", "�˷� ������", "�ִϸ��̼�,�ڹ̵�,����",  "2021-07-21", "��ü ������" , 107));
		movieList.add(new Movie("�� ������","����Ʈ ��Ʈ����", "��Į�� ���ڽ�", "�׼�, ����, SF", "2021-07-07",  "12�� ������" , 134));
		movieList.add(new Movie("����", "���� �ǻ�ٳ���", "������ ��������", "����, ������, ���", "2021-07-14", "û�ҳ� �����Ұ�", 131));
		movieList.add(new Movie("���� ũ����", "�ڿ� �ݷ� ����", "����� ����", "�׼�, ����", "2021-07-28", "12�� ������", 127));
		movieList.add(new Movie("�츮, ��", "�ʸ��� �޳װ�Ƽ", "�ٹٶ� ���ڹ�", "���,���/�θǽ�", "2021-07-28", "12�� ������", 95));
		movieList.add(new Movie("���̽� �ε�", "������ �����", "���� �Ͻ�", "������", "2021-07-21", "12�� ������", 110));
		movieList.add(new Movie("�ɴٹ� ���� ����� �ߴ�", "���� �������", "�Ƹ����� ī����", "���/�θǽ�", "2021-07-14", "12�� ������", 123));
		movieList.add(new Movie("�Ǵн�",  "ũ����Ƽ�� ����Ʈ", "�ϳ� ȣ��", "���/�θǽ�/���", "2021-07-22", "12�� ������", 98));
		movieList.add(new Movie("���:������","����", "������", "�̽��͸�,������",  "2021-07-28", "15�� ������" , 109));
		
		theaterList.add(new Theater("�ް��ڽ�" , "û��"));
		theaterList.add(new Theater("CGV", "�Ż絿"));
		theaterList.add(new Theater("�Ե��ó׸�", "��ġ1��"));
		theaterList.add(new Theater("����Q", "�б�����"));
		theaterList.add(new Theater("���ѱ���", "����2��"));
		theaterList.add(new Theater("���̾ؽó׸�", "������"));
		theaterList.add(new Theater("�Ƹ����ó׼���", "���"));
		theaterList.add(new Theater("��ȭ�����־�", "����1��"));
		theaterList.add(new Theater("��ȭ������", "�Ͽ�2��"));
		theaterList.add(new Theater("���ֽó׸�Ÿ��", "���ϵ�"));
		
		bookerList.add(new Booker("���ھ�", "010-1239-2383"));
		bookerList.add(new Booker("������", "010-3823-5932"));
		bookerList.add(new Booker("��Ź��", "010-2383-3834"));
		bookerList.add(new Booker("���缮", "010-2422-5813"));
		bookerList.add(new Booker("�̿���", "010-5904-2783"));
		bookerList.add(new Booker("�ڰܿ�", "010-6953-9723"));
		
		booking.setBookingDate("2021-04-21");
		booking.setBookerInfo(new Booker("������", "010-0238-4723"));
		booking.setTheater(new Theater("�Ե��ó׸� �Ǵ�", "�Ǵ�"));
		booking.setMovie(new Movie("�𰡵�", "���¿�", "������", "�׼�,���", "2021-07-28", "15�� ������" , 121));
		
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
