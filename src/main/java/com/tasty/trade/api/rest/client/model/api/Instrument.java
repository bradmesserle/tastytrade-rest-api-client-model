package com.tasty.trade.api.rest.client.model.api;

public interface Instrument {

	/**
	 * @return the symbol
	 */
	String getSymbol();

	/**
	 * @param symbol the symbol to set
	 */
	void setSymbol(String symbol);

	/**
	 * @return the instrumentType
	 */
	String getInstrumentType();

	/**
	 * @param instrumentType the instrumentType to set
	 */
	void setInstrumentType(String instrumentType);

	/**
	 * @return the shortDescription
	 */
	String getShortDescription();

	/**
	 * @param shortDescription the shortDescription to set
	 */
	void setShortDescription(String shortDescription);

	/**
	 * @return the isClosingOnly
	 */
	boolean isClosingOnly();

	/**
	 * @param isClosingOnly the isClosingOnly to set
	 */
	void setClosingOnly(boolean isClosingOnly);

	/**
	 * @return the active
	 */
	boolean isActive();

	/**
	 * @param active the active to set
	 */
	void setActive(boolean active);

	/**
	 * @return the tickSize
	 */
	Double getTickSize();

	/**
	 * @param tickSize the tickSize to set
	 */
	void setTickSize(Double tickSize);

	/**
	 * @return the streamerSymbol
	 */
	String getStreamerSymbol();

	/**
	 * @param streamerSymbol the streamerSymbol to set
	 */
	void setStreamerSymbol(String streamerSymbol);

}
