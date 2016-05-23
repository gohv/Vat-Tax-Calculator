package taxcalculator.calculator.VatTax;

import java.util.Map;

import taxcalculator.calculator.CalculateTax.CalculateTax;
import taxcalculator.country.vatTax.CountryDatabase;

public class VatTaxCalculator implements CalculateTax{

	CountryDatabase database = new CountryDatabase();
	Map<String, Double> mapDatabase = database.createMap();
	private double productPrice;

	@Override
	public void calculateTax(double productPrice, String countryID) {
		this.productPrice = productPrice;
		
	}

	
	

	}

