package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("company name is Eastman Exports");
		System.out.println("Eastman Exports Global Clothing Pvt Ltd");
	}
	public void companyId() {
		System.out.println("company id is 5026");
	}
	public void companyAddress() {
		System.out.println("company address is Tiruppur-641603");
	}
	public static void main(String[]args) {
		CompanyInfo l = new CompanyInfo();
		l.companyName();
		l.companyId();
		l.companyAddress();
		}
	}
