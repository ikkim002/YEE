	
public class Time {
	private int hour ; // 0 -23
	private int minute; // 0  -59
	private int second; // 0-59
	
	//첫 번째 생성자
	public Time() {
		this(0,0,0);
	}
	
	//두 번째 생성자
	public Time(int h, int m, int s ) {
		hour = (( h>=0 && h <24) ? h: 0 );
	}
}
