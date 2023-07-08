package com.tasty.trade.api.rest.client.instruments.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.instruments.model.api.Equity;
import com.tasty.trade.api.rest.client.instruments.model.api.TickSize;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractInstrument;

public class EquityImpl extends AbstractInstrument implements Equity{

	@JsonProperty("is-index")
	private boolean isIndex;
	
	@JsonProperty("listed-market")
	private String listedMarket;
	
	@JsonProperty("lendability")
	private String lendability;
	
	@JsonProperty("borrow-rate")
	private Double borrowRate;
	
	//TODO: Convert to DateTime
	@JsonProperty("halted-at")
	private String haltedAt;
	
	//TODO: Convert to DateTime
	@JsonProperty("stops-trading-at")
	private String stopsTradingAt;
	
	@JsonProperty("market-time-instrument-collection")
	private String marketTimeInstrumentCollection;
	
	@JsonProperty("is-options-closing-only")
	private boolean isOptionsClosingOnly;
	
	@JsonProperty("is-fractional-quantity-eligible")
	private boolean isFractionalQuantityEligible;
	
	@JsonProperty("id-illiquid")
	private boolean isIlliquid;
	
	@JsonProperty("is-eft")
	private boolean isEtf;
	
	@JsonProperty("tick-sizes")
	private List<TickSize> tickSizes;
	
	@JsonProperty("option-tick-size")
	private List<TickSize> optionTickSizes;

	/**
	 * @return the isIndex
	 */
	public final boolean isIndex() {
		return isIndex;
	}

	/**
	 * @param isIndex the isIndex to set
	 */
	public final void setIndex(boolean isIndex) {
		this.isIndex = isIndex;
	}

	/**
	 * @return the listedMarket
	 */
	public final String getListedMarket() {
		return listedMarket;
	}

	/**
	 * @param listedMarket the listedMarket to set
	 */
	public final void setListedMarket(String listedMarket) {
		this.listedMarket = listedMarket;
	}

	/**
	 * @return the lendability
	 */
	public final String getLendability() {
		return lendability;
	}

	/**
	 * @param lendability the lendability to set
	 */
	public final void setLendability(String lendability) {
		this.lendability = lendability;
	}

	/**
	 * @return the borrowRate
	 */
	public final Double getBorrowRate() {
		return borrowRate;
	}

	/**
	 * @param borrowRate the borrowRate to set
	 */
	public final void setBorrowRate(Double borrowRate) {
		this.borrowRate = borrowRate;
	}

	/**
	 * @return the haltedAt
	 */
	public final String getHaltedAt() {
		return haltedAt;
	}

	/**
	 * @param haltedAt the haltedAt to set
	 */
	public final void setHaltedAt(String haltedAt) {
		this.haltedAt = haltedAt;
	}

	/**
	 * @return the stopsTradingAt
	 */
	public final String getStopsTradingAt() {
		return stopsTradingAt;
	}

	/**
	 * @param stopsTradingAt the stopsTradingAt to set
	 */
	public final void setStopsTradingAt(String stopsTradingAt) {
		this.stopsTradingAt = stopsTradingAt;
	}

	/**
	 * @return the marketTimeInstrumentCollection
	 */
	public final String getMarketTimeInstrumentCollection() {
		return marketTimeInstrumentCollection;
	}

	/**
	 * @param marketTimeInstrumentCollection the marketTimeInstrumentCollection to set
	 */
	public final void setMarketTimeInstrumentCollection(String marketTimeInstrumentCollection) {
		this.marketTimeInstrumentCollection = marketTimeInstrumentCollection;
	}

	/**
	 * @return the isOptionsClosingOnly
	 */
	public final boolean isOptionsClosingOnly() {
		return isOptionsClosingOnly;
	}

	/**
	 * @param isOptionsClosingOnly the isOptionsClosingOnly to set
	 */
	public final void setOptionsClosingOnly(boolean isOptionsClosingOnly) {
		this.isOptionsClosingOnly = isOptionsClosingOnly;
	}

	/**
	 * @return the isFractionalQuantityEligible
	 */
	public final boolean isFractionalQuantityEligible() {
		return isFractionalQuantityEligible;
	}

	/**
	 * @param isFractionalQuantityEligible the isFractionalQuantityEligible to set
	 */
	public final void setFractionalQuantityEligible(boolean isFractionalQuantityEligible) {
		this.isFractionalQuantityEligible = isFractionalQuantityEligible;
	}

	/**
	 * @return the isIlliquid
	 */
	public final boolean isIlliquid() {
		return isIlliquid;
	}

	/**
	 * @param isIlliquid the isIlliquid to set
	 */
	public final void setIlliquid(boolean isIlliquid) {
		this.isIlliquid = isIlliquid;
	}

	/**
	 * @return the isEtf
	 */
	public final boolean isEtf() {
		return isEtf;
	}

	/**
	 * @param isEtf the isEtf to set
	 */
	public final void setEtf(boolean isEtf) {
		this.isEtf = isEtf;
	}

	/**
	 * @return the tickSizes
	 */
	public final List<TickSize> getTickSizes() {
		return tickSizes;
	}

	/**
	 * @param tickSizes the tickSizes to set
	 */
	public final void setTickSizes(List<TickSize> tickSizes) {
		this.tickSizes = tickSizes;
	}

	/**
	 * @return the optionTickSizes
	 */
	public final List<TickSize> getOptionTickSizes() {
		return optionTickSizes;
	}

	/**
	 * @param optionTickSizes the optionTickSizes to set
	 */
	public final void setOptionTickSizes(List<TickSize> optionTickSizes) {
		this.optionTickSizes = optionTickSizes;
	}
	
	
	
	
	
}
