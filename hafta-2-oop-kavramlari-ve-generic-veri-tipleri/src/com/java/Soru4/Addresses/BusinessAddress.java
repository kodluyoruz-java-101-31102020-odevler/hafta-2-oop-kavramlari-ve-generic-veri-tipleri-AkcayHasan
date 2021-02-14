package com.java.Soru4.Addresses;

public class BusinessAddress implements Address{
	
	private final String city;
    private final String district;
    private final String postCode;

    public BusinessAddress(String city, String district, String postCode) {
        this.city = city;
        this.district = district;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "BusinessAddress{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    @Override
    public void showAddress() {
        toString();
    }

}
