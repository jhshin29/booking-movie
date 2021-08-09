package booking.view;

import booking.controller.BookingController;
import booking.model.dto.Booker;
import booking.model.dto.Booking;
import booking.model.dto.Movie;
import booking.model.dto.Theater;

public class StartView {
	
	public static void main(String[] args) {
		
		BookingController controller = BookingController.getInstance();
		
		System.out.println("----- 1. ��ü ����Ʈ �˻� -----");
		System.out.println("----- 1-1. �� ��ȭ ��ü ����Ʈ �˻� -----");
		controller.getMovieList();
		
		System.out.println("\n----- 1-2. ��ȭ�� ��ü ����Ʈ �˻� -----");
		controller.getTheaterList();
		
		System.out.println("\n----- 1-3. ȸ�� ��ü ����Ʈ �˻� -----");
		controller.getBookerList();
		
		System.out.println("\n----- 1-4. ��ȭ ���� ��ü ����Ʈ �˻� -----");
		controller.getBookingList();
		
		System.out.println("\n----- 2. 1�� �˻�  -----");
		System.out.println("----- 2-1. �� ��ȭ �˻� -----");
		controller.getMovie("�츮, ��");
		
		System.out.println("\n----- 2-2. ��ȭ�� �˻� -----");
		controller.getTheater("�Ƹ����ó׼���");
		
		System.out.println("\n----- 2-3. ȸ�� �˻� -----");
		controller.getBooker("�̿���");
		
		System.out.println("\n----- 2-4. ���೻�� Ȯ�� -----");
		controller.getBooking(1);
		
		System.out.println("\n----- 3. ���� �߰�  -----");
		Booking newBooking = new Booking("2021-08-12"
							, new Booker("���ھ�", "010-0382-5921")
							, new Theater("�Ե��ó׸� ��õ", "������ ��õ")
							, new Movie("���� ġ������ ���Ҹ�", "�̾���Ű �Ͼ߿�", "��&����", "��Ÿ��/���", "2002-06-28", "��ü ������" , 125));
		Booking newBooking2 = new Booking("2021-08-09"
				, new Booker("�ڽ�ö", "010-7232-1284")
				, new Theater("�Ե��ó׸� ���", "������ ���")
				, new Movie("�� ������̵� ������", "���ӽ� ��", "���� �κ�", "�׼�/����", "2021-08-04", "û�ҳ� �����Ұ�" , 132));
		System.out.println("\n----- 3-1. �߰�  -----");
		controller.insertBooking(newBooking);
		controller.insertBooking(newBooking2);
		System.out.println("\n----- 3-2. �߰� �� ���� ��ȸ  -----");
		controller.getBookingList();
		
		System.out.println("\n----- 4. ���� ����  -----");
		controller.updateBooking(2, "���ھ�");
		System.out.println("\n----- 4-1. ���� �� ���� ��ȸ  -----");
		controller.getBookingList();
		
		System.out.println("\n----- 5. ���� ����  -----");
		controller.deleteBooking(2, "���ھ�");
		System.out.println("\n----- 5-1. ���� �� ���� Ȯ��  -----");
		controller.getBooking(2);
		System.out.println("\n----- 5-2. ���� �� ���ฮ��Ʈ ��ȸ  -----");
		controller.getBookingList();
		
	}

}
