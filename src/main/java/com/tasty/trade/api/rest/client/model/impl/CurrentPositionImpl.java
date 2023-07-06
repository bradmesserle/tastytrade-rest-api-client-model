package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.CurrentPosition;

public class CurrentPositionImpl implements CurrentPosition{

	@JsonProperty("account-number")
	private String accountNumber;
	
	@JsonProperty("symbol")
	private String symbol;
	
	@JsonProperty("instrument-type")
	private String instrumentType;
	
	//private String quanity;
	
	@JsonProperty("quantity-direction")
	private String quantityDirection;
	
	@JsonProperty("close-price")
	private Double closePrice;
	
	@JsonProperty("average-open-price")
	private Double averageOpenPrice;
	
	@JsonProperty("average-year-market-close-price")
	private Double averageYearlyMarketClosePrice;
	
	@JsonProperty("average-daily-market-close-price")
	private Double averageDailyMarketClosePrice;
	
	@JsonProperty("mark")
	private Double mark;
	
	@JsonProperty("mark-price")
	private Double markPrice;
	
	@JsonProperty("multiplier")
	private Integer multiplier;
	
	@JsonProperty("cost-effect")
	private String costEffect;
	
	@JsonProperty("is-suppressed")
	private boolean isSuppressed;
	
	@JsonProperty("is-frozen")
	private boolean isFrozen;
	
	//private Object restrictedQuantity;
	
	//TODO: Covert to datetime
	@JsonProperty("expires-at")
	private String expiresAt;
	
	@JsonProperty("fixing-price")
	private Double fixingPrice;
	
	@JsonProperty("deliverable-type")
	private String deliverableType;
	
	@JsonProperty("realized-day-gain")
	private Double realizedDayGain;
	
	@JsonProperty("realized-day-gain-effect")
	private String realizedDayGainEffect;
	
	//TODO: Covert to datetime
	@JsonProperty("realized-day-gain-date")
	private String realizedDayGainDate;
	
	@JsonProperty("realized-today")
	private Double realizedToday;
	
	@JsonProperty("realized-today-effect")
	private String realizedTodayEffect;
	
	//TODO: Covert to datetime
	@JsonProperty("realized-today-date")
	private String realizedTodayDate;
	
	//TODO: Covert to datetime
	@JsonProperty("created-at")
	private String createdAt;
	
	//TODO: Covert to datetime
	@JsonProperty("updated-at")
	private String updatedAt;

	/**
	 * @return the accountNumber
	 */
	public final String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public final void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	 * @return the quantityDirection
	 */
	public final String getQuantityDirection() {
		return quantityDirection;
	}

	/**
	 * @param quantityDirection the quantityDirection to set
	 */
	public final void setQuantityDirection(String quantityDirection) {
		this.quantityDirection = quantityDirection;
	}

	/**
	 * @return the closePrice
	 */
	public final Double getClosePrice() {
		return closePrice;
	}

	/**
	 * @param closePrice the closePrice to set
	 */
	public final void setClosePrice(Double closePrice) {
		this.closePrice = closePrice;
	}

	/**
	 * @return the averageOpenPrice
	 */
	public final Double getAverageOpenPrice() {
		return averageOpenPrice;
	}

	/**
	 * @param averageOpenPrice the averageOpenPrice to set
	 */
	public final void setAverageOpenPrice(Double averageOpenPrice) {
		this.averageOpenPrice = averageOpenPrice;
	}

	/**
	 * @return the averageYearlyMarketClosePrice
	 */
	public final Double getAverageYearlyMarketClosePrice() {
		return averageYearlyMarketClosePrice;
	}

	/**
	 * @param averageYearlyMarketClosePrice the averageYearlyMarketClosePrice to set
	 */
	public final void setAverageYearlyMarketClosePrice(Double averageYearlyMarketClosePrice) {
		this.averageYearlyMarketClosePrice = averageYearlyMarketClosePrice;
	}

	/**
	 * @return the averageDailyMarketClosePrice
	 */
	public final Double getAverageDailyMarketClosePrice() {
		return averageDailyMarketClosePrice;
	}

	/**
	 * @param averageDailyMarketClosePrice the averageDailyMarketClosePrice to set
	 */
	public final void setAverageDailyMarketClosePrice(Double averageDailyMarketClosePrice) {
		this.averageDailyMarketClosePrice = averageDailyMarketClosePrice;
	}

	/**
	 * @return the mark
	 */
	public final Double getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public final void setMark(Double mark) {
		this.mark = mark;
	}

	/**
	 * @return the markPrice
	 */
	public final Double getMarkPrice() {
		return markPrice;
	}

	/**
	 * @param markPrice the markPrice to set
	 */
	public final void setMarkPrice(Double markPrice) {
		this.markPrice = markPrice;
	}

	/**
	 * @return the multiplier
	 */
	public final Integer getMultiplier() {
		return multiplier;
	}

	/**
	 * @param multiplier the multiplier to set
	 */
	public final void setMultiplier(Integer multiplier) {
		this.multiplier = multiplier;
	}

	/**
	 * @return the costEffect
	 */
	public final String getCostEffect() {
		return costEffect;
	}

	/**
	 * @param costEffect the costEffect to set
	 */
	public final void setCostEffect(String costEffect) {
		this.costEffect = costEffect;
	}

	/**
	 * @return the isSuppressed
	 */
	public final boolean isSuppressed() {
		return isSuppressed;
	}

	/**
	 * @param isSuppressed the isSuppressed to set
	 */
	public final void setSuppressed(boolean isSuppressed) {
		this.isSuppressed = isSuppressed;
	}

	/**
	 * @return the isFrozen
	 */
	public final boolean isFrozen() {
		return isFrozen;
	}

	/**
	 * @param isFrozen the isFrozen to set
	 */
	public final void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
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
	 * @return the fixingPrice
	 */
	public final Double getFixingPrice() {
		return fixingPrice;
	}

	/**
	 * @param fixingPrice the fixingPrice to set
	 */
	public final void setFixingPrice(Double fixingPrice) {
		this.fixingPrice = fixingPrice;
	}

	/**
	 * @return the deliverableType
	 */
	public final String getDeliverableType() {
		return deliverableType;
	}

	/**
	 * @param deliverableType the deliverableType to set
	 */
	public final void setDeliverableType(String deliverableType) {
		this.deliverableType = deliverableType;
	}

	/**
	 * @return the realizeddayGain
	 */
	public final Double getRealizedDayGain() {
		return realizedDayGain;
	}

	/**
	 * @param realizeddayGain the realizeddayGain to set
	 */
	public final void setRealizedDayGain(Double realizeddayGain) {
		this.realizedDayGain = realizeddayGain;
	}

	/**
	 * @return the realizedDayGainEffect
	 */
	public final String getRealizedDayGainEffect() {
		return realizedDayGainEffect;
	}

	/**
	 * @param realizedDayGainEffect the realizedDayGainEffect to set
	 */
	public final void setRealizedDayGainEffect(String realizedDayGainEffect) {
		this.realizedDayGainEffect = realizedDayGainEffect;
	}

	/**
	 * @return the realizedDayGainDate
	 */
	public final String getRealizedDayGainDate() {
		return realizedDayGainDate;
	}

	/**
	 * @param realizedDayGainDate the realizedDayGainDate to set
	 */
	public final void setRealizedDayGainDate(String realizedDayGainDate) {
		this.realizedDayGainDate = realizedDayGainDate;
	}

	/**
	 * @return the realizedToday
	 */
	public final Double getRealizedToday() {
		return realizedToday;
	}

	/**
	 * @param realizedToday the realizedToday to set
	 */
	public final void setRealizedToday(Double realizedToday) {
		this.realizedToday = realizedToday;
	}

	/**
	 * @return the realizedTodayEffect
	 */
	public final String getRealizedTodayEffect() {
		return realizedTodayEffect;
	}

	/**
	 * @param realizedTodayEffect the realizedTodayEffect to set
	 */
	public final void setRealizedTodayEffect(String realizedTodayEffect) {
		this.realizedTodayEffect = realizedTodayEffect;
	}

	/**
	 * @return the realizedTodayDate
	 */
	public final String getRealizedTodayDate() {
		return realizedTodayDate;
	}

	/**
	 * @param realizedTodayDate the realizedTodayDate to set
	 */
	public final void setRealizedTodayDate(String realizedTodayDate) {
		this.realizedTodayDate = realizedTodayDate;
	}

	/**
	 * @return the createdAt
	 */
	public final String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public final void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public final String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public final void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
	
}
