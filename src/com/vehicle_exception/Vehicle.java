package com.vehicle_exception;

//import java.util.Date;

public class Vehicle {
	private String chasisno;

	private color colortype;
	private double price;
	//private Date manufactureDate;
	//private Date insuranceDate;
	private double pollutionLevel;


	public Vehicle(String chasisno,  color colortype2, double price, double pollutionLevel) {

		this.chasisno = chasisno;
		//this.unique_id = unique_id;
		this.colortype = colortype2;
		this.price = price;
		//this.manufactureDate = manufactureDate2;
		//this.insuranceDate = insuranceDate2;
		this.pollutionLevel = pollutionLevel;
	}


	public String getChasisno() {
		return chasisno;
	}


	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}


	public color getColortype() {
		return colortype;
	}


	public void setColortype(color colortype) {
		this.colortype = colortype;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	//	public Date getManufactureDate() {
	//		return manufactureDate;
	//	}


	//	public void setManufactureDate(Date manufactureDate) {
	//		this.manufactureDate = manufactureDate;
	//	}


	//	public Date getInsuranceDate() {
	//		return insuranceDate;
	//	}


	//	public void setInsuranceDate(Date insuranceDate) {
	//		this.insuranceDate = insuranceDate;
	//	}


	public double getPollutionLevel() {
		return pollutionLevel;
	}


	public void setPollutionLevel(double pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}


	@Override
	public String toString() {
		return "chasisno=" + this.chasisno + ", colortype=" + this.colortype + ", price="
				+ this.price + ", pollutionLevel=" + this.pollutionLevel ;
	}




}
