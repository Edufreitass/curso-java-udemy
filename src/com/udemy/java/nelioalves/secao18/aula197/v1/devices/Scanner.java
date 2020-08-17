package com.udemy.java.nelioalves.secao18.aula197.v1.devices;

public class Scanner extends Device {

	public Scanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	public String scan() {
		return "Scanned content";
	}

}
