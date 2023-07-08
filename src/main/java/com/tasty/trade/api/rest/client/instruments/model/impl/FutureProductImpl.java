package com.tasty.trade.api.rest.client.instruments.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.instruments.model.api.FutureProduct;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractFutureProduct;

public class FutureProductImpl extends AbstractFutureProduct implements FutureProduct {

	@JsonProperty("listed-months")
	private String listedMonths;
	
	@JsonProperty("active-months")
	private String activeMonths;
	
	@JsonProperty("notional-multiplier")
	private Double notionalMultiplier;
	
	@JsonProperty("tick-size")
	private Double tickSize;
	
	@JsonProperty("base-tick")
	private Integer baseTick;
	
	@JsonProperty("sub-tick")
	private Integer subTick;
	
	@JsonProperty("streamer-exchange-code")
	private String streamerExchangeCode;
	
	@JsonProperty("small-notional")
	private boolean smallNotional;
	
	@JsonProperty("back-month-first-calendar-symbol")
	private boolean backMonthFirstCalendarSymbol;
	
	@JsonProperty("first-notice")
	private boolean firstNotice;
	
	@JsonProperty("contract-limit")
	private Integer contractLimit;
	
	@JsonProperty("security-group")
	private String securityGroup;
	
	@JsonProperty("true-underlying-code")
	private String trueUnderlyingCode;
	
	

	/**
	 * @return the listedMonths
	 */
	public final String getListedMonths() {
		return listedMonths;
	}

	/**
	 * @param listedMonths the listedMonths to set
	 */
	public final void setListedMonths(String listedMonths) {
		this.listedMonths = listedMonths;
	}

	/**
	 * @return the activeMonths
	 */
	public final String getActiveMonths() {
		return activeMonths;
	}

	/**
	 * @param activeMonths the activeMonths to set
	 */
	public final void setActiveMonths(String activeMonths) {
		this.activeMonths = activeMonths;
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
	 * @return the baseTick
	 */
	public final Integer getBaseTick() {
		return baseTick;
	}

	/**
	 * @param baseTick the baseTick to set
	 */
	public final void setBaseTick(Integer baseTick) {
		this.baseTick = baseTick;
	}

	/**
	 * @return the subTick
	 */
	public final Integer getSubTick() {
		return subTick;
	}

	/**
	 * @param subTick the subTick to set
	 */
	public final void setSubTick(Integer subTick) {
		this.subTick = subTick;
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
	 * @return the smallNotional
	 */
	public final boolean isSmallNotional() {
		return smallNotional;
	}

	/**
	 * @param smallNotional the smallNotional to set
	 */
	public final void setSmallNotional(boolean smallNotional) {
		this.smallNotional = smallNotional;
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
	 * @return the firstNotice
	 */
	public final boolean isFirstNotice() {
		return firstNotice;
	}

	/**
	 * @param firstNotice the firstNotice to set
	 */
	public final void setFirstNotice(boolean firstNotice) {
		this.firstNotice = firstNotice;
	}

	/**
	 * @return the contractLimit
	 */
	public final Integer getContractLimit() {
		return contractLimit;
	}

	/**
	 * @param contractLimit the contractLimit to set
	 */
	public final void setContractLimit(Integer contractLimit) {
		this.contractLimit = contractLimit;
	}

	/**
	 * @return the securityGroup
	 */
	public final String getSecurityGroup() {
		return securityGroup;
	}

	/**
	 * @param securityGroup the securityGroup to set
	 */
	public final void setSecurityGroup(String securityGroup) {
		this.securityGroup = securityGroup;
	}

	/**
	 * @return the trueUnderlyingCode
	 */
	public final String getTrueUnderlyingCode() {
		return trueUnderlyingCode;
	}

	/**
	 * @param trueUnderlyingCode the trueUnderlyingCode to set
	 */
	public final void setTrueUnderlyingCode(String trueUnderlyingCode) {
		this.trueUnderlyingCode = trueUnderlyingCode;
	}
	
}
