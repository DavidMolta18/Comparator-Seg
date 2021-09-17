package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import model.Country;
import model.CountryData;

public class Main {
	
	Scanner sc;
	String [] infoString;
	CountryData countryData;
	public static void main(String[] args) {
		
		Main m = new Main();
		m.mainMenu();
	}

	public Main() {
		sc = new Scanner(System.in);
		countryData = new CountryData();
		
	}
	
	
	
	public void mainMenu() {
		
		System.out.println("Enter the number of countries that you will register: ");
		int op = sc.nextInt();
		sc.nextLine();
		
		for (int i =0; i<op;i++) {
			System.out.println("Countryname;GoldMaleMedals;SilverMaleMedal;BronzeMaleMedal;GoldFemaleMedals;SilverFemaleMedal;BronzeFemaleMedal");
			String information = sc.nextLine();
			infoString = information.split(";");
			Country object = new Country(infoString[0],Integer.parseInt(infoString[1]),Integer.parseInt(infoString[2]),Integer.parseInt(infoString[3]),Integer.parseInt(infoString[4]),Integer.parseInt(infoString[5]),Integer.parseInt(infoString[6]));
			countryData.getCountries().add(object);			
		}

		printDataMale();
		printDataFemale();
		
		
		
	}
	
	public void printDataMale() {
		System.out.print("M A S C U L I N O S" + "\n");
		countryData.compareCountry();
		countryData.printDataMale();
		System.out.println("----------");
	}
	
	public void printDataFemale() {
		System.out.println("F E M E N I N O");
		Collections.sort(countryData.getCountries());
		countryData.printDataFemale();
		System.out.println("----------");
	}
	
}
