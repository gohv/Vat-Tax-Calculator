package taxcalculator.country.vatTax;

public class CountryVatTax {
	/**
	 * Two letter country code:
	 * Bulgaria = BG;
	 */
	private String countryID;
	/**
	 * VaT Tax rate in %
	 */
	private double vatTax;
	
	/*
	 * If a country is not loaded into the calculator the default country is initialized
	 * Boolean = true
	 */
	private boolean isDefault = true;


	public CountryVatTax(String countryID, int vatTax, boolean isDefault) {
		
		this.countryID = countryID;
		this.vatTax = vatTax;
		this.isDefault = isDefault;
	}

	public String getCountryID() {
		return countryID;
	}



	public double getVatTax() {
		return vatTax;
	}
	
	@Override
	public String toString() {
		return "CountryVatTax [countryID: " + countryID + ", vatTax: " + vatTax + ", isDefault: " + isDefault + "]";
	}
}
