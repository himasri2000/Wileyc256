package com.himasri.demo;

public class Sample {
	
	private int number,fact=1;
	
	

	public int getFact() {
		factorial();
		return fact;
	}

	public void setFact(int fact) {
		this.fact = fact;
	}

	public int getNumber() {
		
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int factorial() {
		for(int index=1;index<=number;index++) {
			fact*=index;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		
		Sample sample=new Sample();
		sample.setNumber(5);
		System.out.println(sample.getFact());

	}

}
