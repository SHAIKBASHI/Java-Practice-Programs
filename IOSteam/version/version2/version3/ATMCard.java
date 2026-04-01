package com.version3;

import java.io.Serializable;

public class ATMCard implements Serializable{
	private String number;
	private String expiry;
	private int cvv;
	transient private int pin;
	public ATMCard(String number, String expiry, int cvv, int pin) {
		super();
		this.number = number;
		this.expiry = expiry;
		this.cvv = cvv;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "ATMCard [number=" + number + ", expiry=" + expiry + ", cvv=" + cvv + ", pin=" + pin + "]";
	}
	
}
