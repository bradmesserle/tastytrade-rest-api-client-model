package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.TickSizeImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = TickSizeImpl.class)
public interface TickSize {

	/**
	 * @return the value
	 */
	Double getValue();

	/**
	 * @param value the value to set
	 */
	void setValue(Double value);

	/**
	 * @return the threashold
	 */
	Double getThreashold();

	/**
	 * @param threashold the threashold to set
	 */
	void setThreashold(Double threashold);

	/**
	 * @return the symbol
	 */
	String getSymbol();

	/**
	 * @param symbol the symbol to set
	 */
	void setSymbol(String symbol);

}
