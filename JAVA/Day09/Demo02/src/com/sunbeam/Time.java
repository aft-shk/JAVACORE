package com.sunbeam;

import java.time.DateTimeException;
import java.util.NoSuchElementException;

public class Time {
	int hours;
	int minutes;
	int seconds;

	public Time() {

	}

	public void setHours(int hours) {
		if (hours < 0 || hours > 24)
			throw new NoSuchElementException();
		// throw new RuntimeException();
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 60)
			throw new DateTimeException("minutes are incorrect");
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) throws Exception {
		if (seconds < 0 || seconds > 60)
			throw new Exception("Inavlid seconds...");
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
