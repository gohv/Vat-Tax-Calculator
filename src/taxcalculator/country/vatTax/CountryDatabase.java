package taxcalculator.country.vatTax;

import java.util.*;

public class CountryDatabase {

	List<CountryVatTax> database = new ArrayList<>();
	Map<String, Double> countryDatabase;
	Map<String, String> countryNames;
	public CountryDatabase() {
		fill();
	}

	private void fill() {

		database.add(new CountryVatTax("BG", 20, true));
		database.add(new CountryVatTax("CZ", 21, false));
		database.add(new CountryVatTax("FR", 20, false));

	}
	
	public Map<String, Double> createMap(){
		  countryDatabase = new HashMap<>();
		for (CountryVatTax cvt : database){
			countryDatabase.put(cvt.getCountryID(), cvt.getVatTax());
		}
		return countryDatabase;
	}
	

}
