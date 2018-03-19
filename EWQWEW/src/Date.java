
public class Date {
	private int year;
	private String month;
	private int day;

	public Date() { // 기본 생성자
		this(1900, "1월", 1);
	}

	public Date(int year) { // 생성자
		this(year, "1월 ", 1);
	}

	public Date(int year, String month, int day) { //생성자
		this.month = month ; //this는 현재 객체를 가리킨다.
		this.day = day;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [year=" + year + ",month=" + month + ",day=" + day + "]";
	}
}

class DateTest {
	public static void main (String[] args) {
		Date date 1 = new Date(2015,"8월", 10);
		Date date 2 = new Date(2020);
		Date date 3 = new Date();
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
}
