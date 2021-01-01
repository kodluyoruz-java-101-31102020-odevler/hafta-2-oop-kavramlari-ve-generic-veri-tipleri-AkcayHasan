package com.java.Soru4.Insurance;

import java.util.Date;

public abstract class Insurance {
	
	String sigortaIsmi;
    double sigortaUcreti;
    Date sigortaBaslangic;
    Date sigortaBitis;

    public Insurance(){

    }


    public abstract void calculate();

}
