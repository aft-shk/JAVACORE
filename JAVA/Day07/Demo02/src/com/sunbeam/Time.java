package com.sunbeam;

import java.util.Objects;

public class Time {
	int hrs;
	int mins;

	public Time() {
		this(10, 10);
	}

	public Time(int hrs, int mins) {
		this.hrs = hrs;
		this.mins = mins;
	}

	@Override
	public String toString() {
		return "Time = " + hrs + ":" + mins;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hrs, mins);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Time))
			return false;
		Time other = (Time) obj;
		return hrs == other.hrs && mins == other.mins;
	}

	// this->t1, obj->t2
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//		else if (this == obj)
//			return true;
//		else if (obj instanceof Time) {
//			Time t2 = (Time) obj;
//			if (this.hrs == t2.hrs && this.mins == t2.mins)
//				return true;
//		}
//		return false;
//	}

}
