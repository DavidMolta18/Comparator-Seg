package model;

public class Country implements Comparable<Country> {
	
	
	String name; 
	int maleGold;
	int maleSilver;
	int maleBronze;
	int femaleGold;
	int femaleSilver;
	int femaleBronze;
	
	
	public Country(String name, int maleGold, int maleSilver, int maleBronze, int femaleGold, int femaleSilver,int femaleBronze) {

		this.name = name;
		this.maleGold = maleGold;
		this.maleSilver = maleSilver;
		this.maleBronze = maleBronze;
		this.femaleGold = femaleGold;
		this.femaleSilver = femaleSilver;
		this.femaleBronze = femaleBronze;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaleGold() {
		return maleGold;
	}


	public void setMaleGold(int maleGold) {
		this.maleGold = maleGold;
	}


	public int getMaleSilver() {
		return maleSilver;
	}


	public void setMaleSilver(int maleSilver) {
		this.maleSilver = maleSilver;
	}


	public int getMaleBronze() {
		return maleBronze;
	}


	public void setMaleBronze(int maleBronze) {
		this.maleBronze = maleBronze;
	}


	public int getFemaleGold() {
		return femaleGold;
	}


	public void setFemaleGold(int femaleGold) {
		this.femaleGold = femaleGold;
	}


	public int getFemaleSilver() {
		return femaleSilver;
	}


	public void setFemaleSilver(int femaleSilver) {
		this.femaleSilver = femaleSilver;
	}


	public int getFemaleBronze() {
		return femaleBronze;
	}


	public void setFemaleBronze(int femaleBronze) {
		this.femaleBronze = femaleBronze;
	}
	
	public String toStringMale() {
		
		String i;
		i= "Name: " +name + "---> GoldMale: " +maleGold +" SilverMale: " + maleSilver +" BronzeMale: " + maleBronze;  
		return i;
	}
	public String toStringFemale() {
		
		String i;
		i= "Name: " +name +  "---> GoldFemale: " +femaleGold +" SilverFemale: " + femaleSilver +" BronzeFemale: " + femaleBronze;  
		return i;
	}


	@Override
	public int compareTo(Country obj) {
		int a = this.femaleGold - obj.femaleGold;
		if(a==0) {
			int b= this.femaleSilver - obj.femaleSilver;
			if(b==0) {
				int c = this.femaleBronze - obj.femaleBronze;
				return -c;
			}else return -b;
		}else return -a;
		
	}
	

}
