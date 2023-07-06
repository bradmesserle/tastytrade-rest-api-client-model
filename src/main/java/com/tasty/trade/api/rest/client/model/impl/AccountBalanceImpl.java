package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractAccountBalance;
import com.tasty.trade.api.rest.client.model.api.AccountBalance;

public class AccountBalanceImpl extends AbstractAccountBalance implements AccountBalance {

	@JsonProperty("reg-t-margin-requirement")
	private Double regTMarginRequirement;
	
	@JsonProperty("futures-overnight-margin-requirement")
	private Double futuresOvernightMarginRequirement;
	
	@JsonProperty("futures-intraday-margin-requirement")
	private Double futuresIntradayMarginREquirement;
	
	@JsonProperty("maintenance-excess")
	private Double maintenanceExcecss;
	
	@JsonProperty("pending-margin-interest")
	private Double pendingMarginInterest;
	
	@JsonProperty("apex-starting-day-margin-equity")
	private Double apexStartingDayMarginEquity;
	
	@JsonProperty("buying-power-adjustment")
	private Double buyingPowerAdjustment;
	
	@JsonProperty("buying-power-adjustment-effect")
	private String buyingPowerAdjustmentEffect;
	
	@JsonProperty("effective-cryptocurrency-buying-power")
	private Double effectiveCryptoCurrencyBuyingPower;
	
	//TODO: Covert to date time.
	@JsonProperty("updated-at")
	private String updatedAt;

	
	/**
	 * @return the regTMarginRequirement
	 */
	public final Double getRegTMarginRequirement() {
		return regTMarginRequirement;
	}

	/**
	 * @param regTMarginRequirement the regTMarginRequirement to set
	 */
	public final void setRegTMarginRequirement(Double regTMarginRequirement) {
		this.regTMarginRequirement = regTMarginRequirement;
	}

	/**
	 * @return the futuresOvernightMarginRequirement
	 */
	public final Double getFuturesOvernightMarginRequirement() {
		return futuresOvernightMarginRequirement;
	}

	/**
	 * @param futuresOvernightMarginRequirement the futuresOvernightMarginRequirement to set
	 */
	public final void setFuturesOvernightMarginRequirement(Double futuresOvernightMarginRequirement) {
		this.futuresOvernightMarginRequirement = futuresOvernightMarginRequirement;
	}

	/**
	 * @return the futuresIntradayMarginREquirement
	 */
	public final Double getFuturesIntradayMarginREquirement() {
		return futuresIntradayMarginREquirement;
	}

	/**
	 * @param futuresIntradayMarginREquirement the futuresIntradayMarginREquirement to set
	 */
	public final void setFuturesIntradayMarginREquirement(Double futuresIntradayMarginREquirement) {
		this.futuresIntradayMarginREquirement = futuresIntradayMarginREquirement;
	}

	/**
	 * @return the maintenanceExcecss
	 */
	public final Double getMaintenanceExcecss() {
		return maintenanceExcecss;
	}

	/**
	 * @param maintenanceExcecss the maintenanceExcecss to set
	 */
	public final void setMaintenanceExcecss(Double maintenanceExcecss) {
		this.maintenanceExcecss = maintenanceExcecss;
	}

	/**
	 * @return the pendingMarginInterest
	 */
	public final Double getPendingMarginInterest() {
		return pendingMarginInterest;
	}

	/**
	 * @param pendingMarginInterest the pendingMarginInterest to set
	 */
	public final void setPendingMarginInterest(Double pendingMarginInterest) {
		this.pendingMarginInterest = pendingMarginInterest;
	}

	/**
	 * @return the apexStartingDayMarginEquity
	 */
	public final Double getApexStartingDayMarginEquity() {
		return apexStartingDayMarginEquity;
	}

	/**
	 * @param apexStartingDayMarginEquity the apexStartingDayMarginEquity to set
	 */
	public final void setApexStartingDayMarginEquity(Double apexStartingDayMarginEquity) {
		this.apexStartingDayMarginEquity = apexStartingDayMarginEquity;
	}

	/**
	 * @return the buyingPowerAdjustment
	 */
	public final Double getBuyingPowerAdjustment() {
		return buyingPowerAdjustment;
	}

	/**
	 * @param buyingPowerAdjustment the buyingPowerAdjustment to set
	 */
	public final void setBuyingPowerAdjustment(Double buyingPowerAdjustment) {
		this.buyingPowerAdjustment = buyingPowerAdjustment;
	}

	/**
	 * @return the buyingPowerAdjustmentEffect
	 */
	public final String getBuyingPowerAdjustmentEffect() {
		return buyingPowerAdjustmentEffect;
	}

	/**
	 * @param buyingPowerAdjustmentEffect the buyingPowerAdjustmentEffect to set
	 */
	public final void setBuyingPowerAdjustmentEffect(String buyingPowerAdjustmentEffect) {
		this.buyingPowerAdjustmentEffect = buyingPowerAdjustmentEffect;
	}

	/**
	 * @return the effectiveCryptoCurrencyBuyingPower
	 */
	public final Double getEffectiveCryptoCurrencyBuyingPower() {
		return effectiveCryptoCurrencyBuyingPower;
	}

	/**
	 * @param effectiveCryptoCurrencyBuyingPower the effectiveCryptoCurrencyBuyingPower to set
	 */
	public final void setEffectiveCryptoCurrencyBuyingPower(Double effectiveCryptoCurrencyBuyingPower) {
		this.effectiveCryptoCurrencyBuyingPower = effectiveCryptoCurrencyBuyingPower;
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
