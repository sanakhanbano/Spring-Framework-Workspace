package com.test1.spring.springcore.properties;

import java.util.Properties;

public class CountryAndLanguages {
	private Properties countryandlang;

	@Override
	public String toString() {
		return "CountryAndLanguages [countryandlang=" + countryandlang + "]";
	}

	public Properties getCountryandlang() {
		return countryandlang;
	}

	public void setCountryandlang(Properties countryandlang) {
		this.countryandlang = countryandlang;
	}
	

}
