package com.tasty.trade.api.rest.client.model.abstracts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbstractInstrument {

	@JsonProperty("symbol")
	private String symbol;
	
	@JsonProperty("instrument-type")
	private String instrumentType;
	
	@JsonProperty("short-description")
	private String shortDescription;
	
	@JsonProperty("is-closing-only")
	private boolean isClosingOnly;
	
	@JsonProperty("active")
	private boolean active;
	
	@JsonProperty("tick-size")
	private Double tickSize;

	@JsonProperty("streamer-symbol")
	private String streamerSymbol;
	
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

	/**
	 * @return the instrumentType
	 */
	public final String getInstrumentType() {
		return instrumentType;
	}

	/**
	 * @param instrumentType the instrumentType to set
	 */
	public final void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}

	/**
	 * @return the shortDescription
	 */
	public final String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public final void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the isClosingOnly
	 */
	public final boolean isClosingOnly() {
		return isClosingOnly;
	}

	/**
	 * @param isClosingOnly the isClosingOnly to set
	 */
	public final void setClosingOnly(boolean isClosingOnly) {
		this.isClosingOnly = isClosingOnly;
	}

	/**
	 * @return the active
	 */
	public final boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public final void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the tickSize
	 */
	public final Double getTickSize() {
		return tickSize;
	}

	/**
	 * @param tickSize the tickSize to set
	 */
	public final void setTickSize(Double tickSize) {
		this.tickSize = tickSize;
	}

	/**
	 * @return the streamerSymbol
	 */
	public final String getStreamerSymbol() {
		return streamerSymbol;
	}

	/**
	 * @param streamerSymbol the streamerSymbol to set
	 */
	public final void setStreamerSymbol(String streamerSymbol) {
		this.streamerSymbol = streamerSymbol;
	}
	
	
}
