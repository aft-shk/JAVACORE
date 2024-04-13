package com.sunbeam.entity;

import com.sunbeam.exceptions.InvalidTimeException;

public class Time {
	int hours;
	int minutes;
	int seconds;

	public void setHours(int hours) throws InvalidTimeException {
		if (hours < 0 || hours > 24)
			throw new InvalidTimeException();
		this.hours = hours;
	}

	public void setMinutes(int minutes) throws InvalidTimeException {
		if (minutes < 0 || minutes > 59)
			throw new InvalidTimeException("invalid minutes");
		this.minutes = minutes;
	}

	public void setSeconds(int seconds) throws InvalidTimeException {
		if (seconds < 0 || seconds > 59)
			throw new InvalidTimeException("seconds", "value is incorrect for the given field");
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
