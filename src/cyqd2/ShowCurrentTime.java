package cyqd2;

public class ShowCurrentTime {

	public static void main(String[] args) {
		long totalMlliseconds = System.currentTimeMillis();
		long totalSeconds = totalMlliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.print("Current time is  "+ currentHour + ":" +
		currentMinute + ":" + currentSecond +" GMT");
		

	}

}
