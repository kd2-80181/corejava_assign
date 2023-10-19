package com.sunbeam;

public class Labor implements Emp {

	private double hrs;
	private double rate;
	
	public Labor() {
	}

	public Labor(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return this.hrs * this.rate;
	}
	
	@Override
	public double calcIncentives() {
		if(this.hrs > 300) {
			return 0.05*this.hrs*this.rate;
		}
		return 0.0;
	}
	
	
}
