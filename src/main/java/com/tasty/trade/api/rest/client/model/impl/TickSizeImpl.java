package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.TickSize;

public class TickSizeImpl implements TickSize {

	@JsonProperty("value")
	private Double value;
	
	@JsonProperty("threashold")
	private Double threashold;
	
	@JsonProperty("symbol")
	private String symbol;

	/**
	 * @return the value
	 */
	public final Double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public final void setValue(Double value) {
		this.value = value;
	}

	/**
	 * @return the threashold
	 */
	public final Double getThreashold() {
		return threashold;
	}

	/**
	 * @param threashold the threashold to set
	 */
	public final void setThreashold(Double threashold) {
		this.threashold = threashold;
	}

	/**
	 * @return the symbol
	 */
	public final String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public final void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
}
