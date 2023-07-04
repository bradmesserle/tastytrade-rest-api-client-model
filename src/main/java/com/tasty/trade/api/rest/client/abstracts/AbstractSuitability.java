package com.tasty.trade.api.rest.client.abstracts;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractSuitability {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("annual-net-income")
	private Integer annualNetIncome;
	
	@JsonProperty("net-worth")
	private Integer netWorth;
	
	@JsonProperty("liquid-net-worth")
	private Integer liquidNetWorth;
	
	@JsonProperty("stock-trading-experience")
	private String stockTradingExperience;
	
	@JsonProperty("covered-options-trading-experience")
	private String coveredOptionsTradingExperience;
	
	@JsonProperty("uncovered-options-trading-experience")
	private String uncoveredOptionsTradingExperience;
	
	@JsonProperty("futures-trading-experience")
	private String futuresTradingExperience;
	

	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the annualNetIncome
	 */
	public final Integer getAnnualNetIncome() {
		return annualNetIncome;
	}

	/**
	 * @param annualNetIncome the annualNetIncome to set
	 */
	public final void setAnnualNetIncome(Integer annualNetIncome) {
		this.annualNetIncome = annualNetIncome;
	}

	/**
	 * @return the netWorth
	 */
	public final Integer getNetWorth() {
		return netWorth;
	}

	/**
	 * @param netWorth the netWorth to set
	 */
	public final void setNetWorth(Integer netWorth) {
		this.netWorth = netWorth;
	}

	/**
	 * @return the liquidNetWorth
	 */
	public final Integer getLiquidNetWorth() {
		return liquidNetWorth;
	}

	/**
	 * @param liquidNetWorth the liquidNetWorth to set
	 */
	public final void setLiquidNetWorth(Integer liquidNetWorth) {
		this.liquidNetWorth = liquidNetWorth;
	}

	/**
	 * @return the stockTradingExperience
	 */
	public final String getStockTradingExperience() {
		return stockTradingExperience;
	}

	/**
	 * @param stockTradingExperience the stockTradingExperience to set
	 */
	public final void setStockTradingExperience(String stockTradingExperience) {
		this.stockTradingExperience = stockTradingExperience;
	}

	/**
	 * @return the coveredOptionsTradingExperience
	 */
	public final String getCoveredOptionsTradingExperience() {
		return coveredOptionsTradingExperience;
	}

	/**
	 * @param coveredOptionsTradingExperience the coveredOptionsTradingExperience to set
	 */
	public final void setCoveredOptionsTradingExperience(String coveredOptionsTradingExperience) {
		this.coveredOptionsTradingExperience = coveredOptionsTradingExperience;
	}

	/**
	 * @return the uncoveredOptionsTradingExperience
	 */
	public final String getUncoveredOptionsTradingExperience() {
		return uncoveredOptionsTradingExperience;
	}

	/**
	 * @param uncoveredOptionsTradingExperience the uncoveredOptionsTradingExperience to set
	 */
	public final void setUncoveredOptionsTradingExperience(String uncoveredOptionsTradingExperience) {
		this.uncoveredOptionsTradingExperience = uncoveredOptionsTradingExperience;
	}

	/**
	 * @return the futuresTradingExperience
	 */
	public final String getFuturesTradingExperience() {
		return futuresTradingExperience;
	}

	/**
	 * @param futuresTradingExperience the futuresTradingExperience to set
	 */
	public final void setFuturesTradingExperience(String futuresTradingExperience) {
		this.futuresTradingExperience = futuresTradingExperience;
	}


	
}
