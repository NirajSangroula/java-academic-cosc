package cosc1047.lab1;

public class Timer {
	private int hours;
	private int minutes;
	private int seconds;

	public Timer(){
		hours = minutes = seconds = 0;
	}

	public Timer(int hours, int minutes, int seconds){
		this.hours = (hours > 0) ? hours : 0;
		this.minutes = (minutes > 0) ? minutes : 0;
		this.seconds = (seconds > 0) ? seconds : 0;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = (hours > 0) ? hours : 0;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = (minutes > 0) ? minutes : 0;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = (seconds > 0) ? seconds : 0;
	}

	public Timer addTime(Timer t){
		Timer t1 = new Timer();
		t1.setSeconds(seconds + t.seconds);
		t1.setMinutes(minutes + t.minutes);
		t1.setHours(hours + t.hours);

		if(t1.getSeconds() >= 60){
			t1.setMinutes(t1.getMinutes() + t1.getSeconds() / 60);
			t1.setSeconds(t1.getSeconds() % 60);
		}

		if(t1.getMinutes() >= 60){
			t1.setHours(t1.getHours() + t1.getMinutes() / 60);
			t1.setMinutes(t1.getMinutes() % 60);
		}

		return t1;
	}
}
