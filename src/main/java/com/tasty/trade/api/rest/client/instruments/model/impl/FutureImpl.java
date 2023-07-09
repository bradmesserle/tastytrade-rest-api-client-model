package com.tasty.trade.api.rest.client.instruments.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.instruments.model.api.Future;
import com.tasty.trade.api.rest.client.instruments.model.api.FutureProduct;
import com.tasty.trade.api.rest.client.instruments.model.api.TickSize;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractInstrument;

public class FutureImpl extends AbstractInstrument implements Future {

	@JsonProperty("product-code")
	private String productCode;
	
	@JsonProperty("contract-size")
	private Double contractSize;
	
	@JsonProperty("notional-multiplier")
	private Double notionalMultiplier;
	
	@JsonProperty("main-fraction")
	private Double mainFraction;
	
	@JsonProperty("sub-fraction")
	private Double subFraction;
	
	@JsonProperty("display-factor")
	private Double displayFactor;
	
	//TODO: convert to date
	@JsonProperty("last-trade-date")
	private String lastTradeDate;
	
	//TODO: convert to date
	@JsonProperty("expiration-date")
	private String expirationDate;
	
	//TODO: convert to date
	@JsonProperty("closing-only-date")
	private String closingOnlyDate;
	
	@JsonProperty("active-month")
	private boolean activeMonth;
	
	@JsonProperty("next-active-month")
	private boolean nextActiveMonth;
	
	//TODO: Convert to date
	@JsonProperty("first-notice-date")
	private String firstNoticeDate;
	
	//TODO: Convert to date time
	@JsonProperty("stops-trading-at")
	private String stopsTradingAt;

	//TODO: Convert to date time
	@JsonProperty("expires-at")
	private String expiresAt;
	
	@JsonProperty("product-group")
	private String productGroup;
	
	@JsonProperty("exchange")
	private String exchange;
	
	@JsonProperty("roll-target-symbol")
	private String rollTargetSymbol;
	
	@JsonProperty("streamer-exchange-code")
	private String streamerExchangeCode;
	
	@JsonProperty("back-month-first-calendar-symbol")
	private boolean backMonthFirstCalendarSymbol;
	
	@JsonProperty("is-tradeable")
	private boolean isTradeable;
	
	@JsonProperty("true-underlying-symbol")
	private String trueUnderlyingSymbol;
	
	@JsonProperty("future-etf-equivalent")
	private List<Object> futureEtfEquivalent;
	
	@JsonProperty("future-products")
	private List<FutureProduct> futureProducts;
	
	@JsonProperty("tick-sizes")
	private List<TickSize> tickSizes;
	
	@JsonProperty("option-tick-size")
	private List<TickSize> optiontickSizes;
	
	@JsonProperty("spread-tick-size")
	private List<TickSize> spreadTickSizes;

	
	/**
	 * @return the productCode
	 */
	public final String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public final void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the contractSize
	 */
	public final Double getContractSize() {
		return contractSize;
	}

	/**
	 * @param contractSize the contractSize to set
	 */
	public final void setContractSize(Double contractSize) {
		this.contractSize = contractSize;
	}

	/**
	 * @return the notionalMultiplier
	 */
	public final Double getNotionalMultiplier() {
		return notionalMultiplier;
	}

	/**
	 * @param notionalMultiplier the notionalMultiplier to set
	 */
	public final void setNotionalMultiplier(Double notionalMultiplier) {
		this.notionalMultiplier = notionalMultiplier;
	}

	/**
	 * @return the mainFraction
	 */
	public final Double getMainFraction() {
		return mainFraction;
	}

	/**
	 * @param mainFraction the mainFraction to set
	 */
	public final void setMainFraction(Double mainFraction) {
		this.mainFraction = mainFraction;
	}

	/**
	 * @return the subFraction
	 */
	public final Double getSubFraction() {
		return subFraction;
	}

	/**
	 * @param subFraction the subFraction to set
	 */
	public final void setSubFraction(Double subFraction) {
		this.subFraction = subFraction;
	}

	/**
	 * @return the displayFactor
	 */
	public final Double getDisplayFactor() {
		return displayFactor;
	}

	/**
	 * @param displayFactor the displayFactor to set
	 */
	public final void setDisplayFactor(Double displayFactor) {
		this.displayFactor = displayFactor;
	}

	/**
	 * @return the lastTradeDate
	 */
	public final String getLastTradeDate() {
		return lastTradeDate;
	}

	/**
	 * @param lastTradeDate the lastTradeDate to set
	 */
	public final void setLastTradeDate(String lastTradeDate) {
		this.lastTradeDate = lastTradeDate;
	}

	/**
	 * @return the expirationDate
	 */
	public final String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public final void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the closingOnlyDate
	 */
	public final String getClosingOnlyDate() {
		return closingOnlyDate;
	}

	/**
	 * @param closingOnlyDate the closingOnlyDate to set
	 */
	public final void setClosingOnlyDate(String closingOnlyDate) {
		this.closingOnlyDate = closingOnlyDate;
	}

	/**
	 * @return the activeMonth
	 */
	public final boolean isActiveMonth() {
		return activeMonth;
	}

	/**
	 * @param activeMonth the activeMonth to set
	 */
	public final void setActiveMonth(boolean activeMonth) {
		this.activeMonth = activeMonth;
	}

	/**
	 * @return the nextActiveMonth
	 */
	public final boolean isNextActiveMonth() {
		return nextActiveMonth;
	}

	/**
	 * @param nextActiveMonth the nextActiveMonth to set
	 */
	public final void setNextActiveMonth(boolean nextActiveMonth) {
		this.nextActiveMonth = nextActiveMonth;
	}

	/**
	 * @return the firstNoticeDate
	 */
	public final String getFirstNoticeDate() {
		return firstNoticeDate;
	}

	/**
	 * @param firstNoticeDate the firstNoticeDate to set
	 */
	public final void setFirstNoticeDate(String firstNoticeDate) {
		this.firstNoticeDate = firstNoticeDate;
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
	 * @return the expiresAt
	 */
	public final String getExpiresAt() {
		return expiresAt;
	}

	/**
	 * @param expiresAt the expiresAt to set
	 */
	public final void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}

	/**
	 * @return the productGroup
	 */
	public final String getProductGroup() {
		return productGroup;
	}

	/**
	 * @param productGroup the productGroup to set
	 */
	public final void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	/**
	 * @return the exchange
	 */
	public final String getExchange() {
		return exchange;
	}

	/**
	 * @param exchange the exchange to set
	 */
	public final void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * @return the rollTargetSymbol
	 */
	public final String getRollTargetSymbol() {
		return rollTargetSymbol;
	}

	/**
	 * @param rollTargetSymbol the rollTargetSymbol to set
	 */
	public final void setRollTargetSymbol(String rollTargetSymbol) {
		this.rollTargetSymbol = rollTargetSymbol;
	}

	/**
	 * @return the streamerExchangeCode
	 */
	public final String getStreamerExchangeCode() {
		return streamerExchangeCode;
	}

	/**
	 * @param streamerExchangeCode the streamerExchangeCode to set
	 */
	public final void setStreamerExchangeCode(String streamerExchangeCode) {
		this.streamerExchangeCode = streamerExchangeCode;
	}

	/**
	 * @return the backMonthFirstCalendarSymbol
	 */
	public final boolean isBackMonthFirstCalendarSymbol() {
		return backMonthFirstCalendarSymbol;
	}

	/**
	 * @param backMonthFirstCalendarSymbol the backMonthFirstCalendarSymbol to set
	 */
	public final void setBackMonthFirstCalendarSymbol(boolean backMonthFirstCalendarSymbol) {
		this.backMonthFirstCalendarSymbol = backMonthFirstCalendarSymbol;
	}

	/**
	 * @return the isTradeable
	 */
	public final boolean isTradeable() {
		return isTradeable;
	}

	/**
	 * @param isTradeable the isTradeable to set
	 */
	public final void setTradeable(boolean isTradeable) {
		this.isTradeable = isTradeable;
	}

	/**
	 * @return the trueUnderlyingSymbol
	 */
	public final String getTrueUnderlyingSymbol() {
		return trueUnderlyingSymbol;
	}

	/**
	 * @param trueUnderlyingSymbol the trueUnderlyingSymbol to set
	 */
	public final void setTrueUnderlyingSymbol(String trueUnderlyingSymbol) {
		this.trueUnderlyingSymbol = trueUnderlyingSymbol;
	}

	/**
	 * @return the futureEtfEquivalent
	 */
	public final List<Object> getFutureEtfEquivalent() {
		return futureEtfEquivalent;
	}

	/**
	 * @param futureEtfEquivalent the futureEtfEquivalent to set
	 */
	public final void setFutureEtfEquivalent(List<Object> futureEtfEquivalent) {
		this.futureEtfEquivalent = futureEtfEquivalent;
	}

	

	/**
	 * @return the futureProducts
	 */
	public final List<FutureProduct> getFutureProducts() {
		return futureProducts;
	}

	/**
	 * @param futureProducts the futureProducts to set
	 */
	public final void setFutureProducts(List<FutureProduct> futureProducts) {
		this.futureProducts = futureProducts;
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
	 * @return the optiontickSizes
	 */
	public final List<TickSize> getOptiontickSizes() {
		return optiontickSizes;
	}

	/**
	 * @param optiontickSizes the optiontickSizes to set
	 */
	public final void setOptiontickSizes(List<TickSize> optiontickSizes) {
		this.optiontickSizes = optiontickSizes;
	}

	/**
	 * @return the spreadTickSizes
	 */
	public final List<TickSize> getSpreadTickSizes() {
		return spreadTickSizes;
	}

	/**
	 * @param spreadTickSizes the spreadTickSizes to set
	 */
	public final void setSpreadTickSizes(List<TickSize> spreadTickSizes) {
		this.spreadTickSizes = spreadTickSizes;
	}
	
	
	
}

