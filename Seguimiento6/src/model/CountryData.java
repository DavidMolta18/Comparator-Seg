package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountryData {
	
	ArrayList<Country> countries;

	public CountryData(){
		
		countries = new ArrayList<>();
	}

	public ArrayList<Country> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}
	
	public void printDataMale() {
		
		for(Country c: countries) {
			System.out.println(c.toStringMale());
		}
		
	}
	public void printDataFemale() {
		for(Country c : countries) {
			System.out.println(c.toStringFemale());
		}
	}
	
	public void compareCountry () {
		
		Comparator<Country> comparator = (o1,o2)->{
			int a = o1.getMaleGold()-o2.getMaleGold();
			if(a==0) {
				int b = o1.getMaleSilver() - o2.getMaleSilver();
				if(b==0) {
					int c = o1.getMaleSilver()- o2.getMaleSilver();
					return -c;
				} else return -b;
			}else return -a;
			
		};
		Collections.sort(countries,comparator);
	}
	
	
}
