package com.solution01;

public class Labor implements Emp {

	private int hours;
	private double rates;

	@Override
	public double getSal() {
		return this.hours * this.rates;
	}
	
	@Override
	public double calcIncentives()
	{
		if(this.hours>300)
		{
			return 0.05*this.getSal();
		}
		return 0.0;
	}

	public Labor(int hours, double rates) {
		super();
		this.hours = hours;
		this.rates = rates;
	}
}
