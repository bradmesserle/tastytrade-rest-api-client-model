package com.tasty.trade.api.rest.client.model.enums;

public enum InstrumentType {

	Bond("Bond"),
	Cryptocurrency("Cryptocurrency"),
	CurrencyPair("Currency Pair"),
	Equity("Equity"),
	EquityOffering("Equity Offering"),
	EquityOption("Equity Option"),
	Future("Future"),
	FutureOption("Future Option"),
	Index("Index"),
	Unknown("Unknown"),
	Warrant("Warrant");
	
	
	private final String value;


	InstrumentType(final String aValue){
		value = aValue;
	}

	/**
	 * @return the value
	 */
	public final String getValue() {
		return value;
	}

	
	
	
}
