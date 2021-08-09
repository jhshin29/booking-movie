package booking.model.dto;

public class Booker {
	private String bookerName;
	private String phoneNum;
	
	public Booker() {}

	public Booker(String bookerName, String phoneNum) {
		super();
		this.bookerName = bookerName;
		this.phoneNum = phoneNum;
	}

	public String getBookerName() {
		return bookerName;
	}

	public void setBookerName(String bookerName) {
		this.bookerName = bookerName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("������ : ");
		builder.append(bookerName);
		builder.append(", �ڵ��� ��ȣ : ");
		builder.append(phoneNum);
		return builder.toString();
	}
	
}
