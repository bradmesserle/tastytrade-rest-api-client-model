package com.tasty.trade.api.rest.client.model.abstracts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbstractFutureProduct {

	@JsonProperty("root-symbol")
	private String rootSymbol;
	
	@JsonProperty("cash-settled")
	private boolean cashSettled;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("display-factor")
	private Double displayFactor;
	
	@JsonProperty("exchange")
	private String exchange;
	
	@JsonProperty("prodcut-type")
	private String productType;
	
	@JsonProperty("expiration-type")
	private String expirationType;
	
	@JsonProperty("settlement-delay-days")
	private Integer settlementDelayDays;
	
	@JsonProperty("product-subtype")
	private String productSubtype;
	
	@JsonProperty("market-sector")
	private String marketSector;

	/**
	 * @return the rootSymbol
	 */
	public final String getRootSymbol() {
		return rootSymbol;
	}

	/**
	 * @param rootSymbol the rootSymbol to set
	 */
	public final void setRootSymbol(String rootSymbol) {
		this.rootSymbol = rootSymbol;
	}

	/**
	 * @return the cashSettled
	 */
	public final boolean isCashSettled() {
		return cashSettled;
	}

	/**
	 * @param cashSettled the cashSettled to set
	 */
	public final void setCashSettled(boolean cashSettled) {
		this.cashSettled = cashSettled;
	}

	/**
	 * @return the code
	 */
	public final String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public final void setCode(String code) {
		this.code = code;
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
	 * @return the productType
	 */
	public final String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public final void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the expirationType
	 */
	public final String getExpirationType() {
		return expirationType;
	}

	/**
	 * @param expirationType the expirationType to set
	 */
	public final void setExpirationType(String expirationType) {
		this.expirationType = expirationType;
	}

	/**
	 * @return the settlementDelayDays
	 */
	public final Integer getSettlementDelayDays() {
		return settlementDelayDays;
	}

	/**
	 * @param settlementDelayDays the settlementDelayDays to set
	 */
	public final void setSettlementDelayDays(Integer settlementDelayDays) {
		this.settlementDelayDays = settlementDelayDays;
	}

	/**
	 * @return the productSubtype
	 */
	public final String getProductSubtype() {
		return productSubtype;
	}

	/**
	 * @param productSubtype the productSubtype to set
	 */
	public final void setProductSubtype(String productSubtype) {
		this.productSubtype = productSubtype;
	}

	/**
	 * @return the marketSector
	 */
	public final String getMarketSector() {
		return marketSector;
	}

	/**
	 * @param marketSector the marketSector to set
	 */
	public final void setMarketSector(String marketSector) {
		this.marketSector = marketSector;
	}
	
	
	
	
	
}
