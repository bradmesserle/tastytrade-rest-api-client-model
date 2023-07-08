package com.tasty.trade.api.rest.client.instruments.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.instruments.model.api.EquityOption;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractInstrument;

public class EquityOptionImpl extends AbstractInstrument implements EquityOption {

	@JsonProperty("strike-price")
	private Double strikePrice;

	@JsonProperty("underlying-symbol")
	private String underlyingSymbol;

	// TODO: Convert to date Object
	@JsonProperty("expiration-date")
	private String expirationDate;

	@JsonProperty("excercise-style")
	private String exerciseStyle;

	@JsonProperty("shares-per-contract")
	private Integer sharesPerContract;

	@JsonProperty("option-type")
	private String optionType;

	@JsonProperty("option-chain-type")
	private String optionChainType;

	@JsonProperty("exporation-type")
	private String expirationType;

	@JsonProperty("settlement-type")
	private String settlementType;

	@JsonProperty("halted-at")
	private String haltedAt;

	// TODO: Convert to DateTime
	@JsonProperty("stops-trading-at")
	private String stopsTradingAt;

	@JsonProperty("market-time-instrument-collection")
	private String marketTimeInstrumentCollection;

	@JsonProperty("days-to-expiration")
	private Integer daysToExpiration;

	// TODO: Convert to DateTime.
	@JsonProperty("expires-at")
	private String expiresAt;

	@JsonProperty("old-security-number")
	private String oldSecurityNumber;

	/**
	 * @return the strikePrice
	 */
	public final Double getStrikePrice() {
		return strikePrice;
	}

	/**
	 * @param strikePrice the strikePrice to set
	 */
	public final void setStrikePrice(Double strikePrice) {
		this.strikePrice = strikePrice;
	}

	/**
	 * @return the underlyingSymbol
	 */
	public final String getUnderlyingSymbol() {
		return underlyingSymbol;
	}

	/**
	 * @param underlyingSymbol the underlyingSymbol to set
	 */
	public final void setUnderlyingSymbol(String underlyingSymbol) {
		this.underlyingSymbol = underlyingSymbol;
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
	 * @return the exerciseStyle
	 */
	public final String getExerciseStyle() {
		return exerciseStyle;
	}

	/**
	 * @param exerciseStyle the exerciseStyle to set
	 */
	public final void setExerciseStyle(String exerciseStyle) {
		this.exerciseStyle = exerciseStyle;
	}

	/**
	 * @return the sharesPerContract
	 */
	public final Integer getSharesPerContract() {
		return sharesPerContract;
	}

	/**
	 * @param sharesPerContract the sharesPerContract to set
	 */
	public final void setSharesPerContract(Integer sharesPerContract) {
		this.sharesPerContract = sharesPerContract;
	}

	/**
	 * @return the optionType
	 */
	public final String getOptionType() {
		return optionType;
	}

	/**
	 * @param optionType the optionType to set
	 */
	public final void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	/**
	 * @return the optionChainType
	 */
	public final String getOptionChainType() {
		return optionChainType;
	}

	/**
	 * @param optionChainType the optionChainType to set
	 */
	public final void setOptionChainType(String optionChainType) {
		this.optionChainType = optionChainType;
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
	 * @return the settlementType
	 */
	public final String getSettlementType() {
		return settlementType;
	}

	/**
	 * @param settlementType the settlementType to set
	 */
	public final void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
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
	 * @param marketTimeInstrumentCollection the marketTimeInstrumentCollection to
	 *                                       set
	 */
	public final void setMarketTimeInstrumentCollection(String marketTimeInstrumentCollection) {
		this.marketTimeInstrumentCollection = marketTimeInstrumentCollection;
	}

	/**
	 * @return the daysToExpiration
	 */
	public final Integer getDaysToExpiration() {
		return daysToExpiration;
	}

	/**
	 * @param daysToExpiration the daysToExpiration to set
	 */
	public final void setDaysToExpiration(Integer daysToExpiration) {
		this.daysToExpiration = daysToExpiration;
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
	 * @return the oldSecurityNumber
	 */
	public final String getOldSecurityNumber() {
		return oldSecurityNumber;
	}

	/**
	 * @param oldSecurityNumber the oldSecurityNumber to set
	 */
	public final void setOldSecurityNumber(String oldSecurityNumber) {
		this.oldSecurityNumber = oldSecurityNumber;
	}

}
