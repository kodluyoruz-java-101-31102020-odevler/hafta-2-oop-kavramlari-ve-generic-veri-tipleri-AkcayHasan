package com.java.Soru4.Addresses;

public class HomeAddress implements Address{
	
	private final String city;
    private final String district;
    private final String postCode;

    public HomeAddress(String city, String district, String postCode) {
        this.city = city;
        this.district = district;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
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
