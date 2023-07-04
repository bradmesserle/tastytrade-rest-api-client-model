package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.TradingStatus;

public class TradingStatusImpl implements TradingStatus {

	@JsonProperty("description")
	private String description;
	
	@JsonProperty("account-number")
	private String accountNumber;
	
	@JsonProperty("clearing-account-number")
	private String clearingAccountNumber;
	
	@JsonProperty("clearing-aggregation-identifier")
	private String clearingAggregationIdentifier;
	
	@JsonProperty("day-trade-count")
	private Integer dayTradeCount;
	
	@JsonProperty("equities-margin-calculation-type")
	private String equitiesMarginCalculationType;
	
	@JsonProperty("calculation-type-fee-schedule-name")
	private String calculationTypeFeeScheduleName;
	
	@JsonProperty("futures-margin-rate-multiplier")
	private Double furturesMarginRateMultiplier;
	
	@JsonProperty("has-intraday-equities=margin")
	private boolean hasIntradayEquitiesMargin;
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("is-aggregated-at-clearing")
	private boolean isAggregatedAtClearing;
	
	@JsonProperty("is-closed")
	private boolean isClosed;
	
	@JsonProperty("is-closing-only")
	private boolean isClosingOnly;
	
	@JsonProperty("is-cryptocurrency-closing-only")
	private boolean isCryptocurrencyClosingOnly;
	
	@JsonProperty("is-crypto-currency-enable")
	private boolean isCryptocurrencyEnabled;
	
	@JsonProperty("is-frozen")
	private boolean isFrozen;
	
	@JsonProperty("is-full-equity-margin-required")
	private boolean isFullEquityMarginRequired;
	
	@JsonProperty("is-futures-closing-only")
	private boolean isFuturesClosingOnly;
	
	@JsonProperty("is-futures-intra-day-enabled")
	private boolean isFuturesIntraDayEnabled;
	
	@JsonProperty("is-futures-enabled")
	private boolean isFuturesEnabled;
	
	@JsonProperty("is-in-day-trade-equity-maintenance-call")
	private boolean isInDayTradeEquityMaintenanceCall;
	
	@JsonProperty("is-in-margin-call")
	private boolean isInMarginCall;
	
	@JsonProperty("is-pattern-day-trader")
	private boolean isPatternDayTrader;
	
	@JsonProperty("is-portfolio-margin-enabled")
	private boolean isPortfolioMarginEnabled;
	
	@JsonProperty("is-risk-reduceing-only")
	private boolean isRiskReduceingOnly;
	
	@JsonProperty("is-small-notional-futures-intra-day-enabled")
	private boolean isSmallNotionalFuturesIntraDayEnabled;
	
	@JsonProperty("is-rolling-the-day-forward-enabled")
	private boolean isRollTheDayForwardEnabled;
	
	@JsonProperty("are-far-otm-net-options-restricted")
	private boolean areFarOtmNetOptionsRestricted;
	
	@JsonProperty("options-level")
	private String optionsLevel;
	
	//TODO:Cast to Date Object.
	@JsonProperty("pdt-rest-on")
	private String pdtResetOn;
	
	@JsonProperty("short-calls-enabled")
	private boolean shortCallsEnabled;
	
	@JsonProperty("small-notional-futures-margin-rate-multiplier-cmta-override")
	private Double smallNotionalFuturesMarginRateMultiplierCmtaOverride;
	
	@JsonProperty("is-equity-offering-enabled")
	private boolean isEquityOfferingEnabled;
	
	@JsonProperty("is-equity-offering-closing-only")
	private boolean isEquityOfferingClosingOnly;
	
	//TODO: Cast to Date Object.
	@JsonProperty("enhanced-fraud-safeguards-enabled-at")
	private String enhancedFraudSafeguardsEnabledAt;
	
	//TODO: Cast to Date Object.
	@JsonProperty("updated-at")
	private String updatedAt;

	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
	}

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
	 * @return the clearingAccountNumber
	 */
	public final String getClearingAccountNumber() {
		return clearingAccountNumber;
	}

	/**
	 * @param clearingAccountNumber the clearingAccountNumber to set
	 */
	public final void setClearingAccountNumber(String clearingAccountNumber) {
		this.clearingAccountNumber = clearingAccountNumber;
	}

	/**
	 * @return the clearingAggregationIdentifier
	 */
	public final String getClearingAggregationIdentifier() {
		return clearingAggregationIdentifier;
	}

	/**
	 * @param clearingAggregationIdentifier the clearingAggregationIdentifier to set
	 */
	public final void setClearingAggregationIdentifier(String clearingAggregationIdentifier) {
		this.clearingAggregationIdentifier = clearingAggregationIdentifier;
	}

	/**
	 * @return the dayTradeCount
	 */
	public final Integer getDayTradeCount() {
		return dayTradeCount;
	}

	/**
	 * @param dayTradeCount the dayTradeCount to set
	 */
	public final void setDayTradeCount(Integer dayTradeCount) {
		this.dayTradeCount = dayTradeCount;
	}

	/**
	 * @return the equitiesMarginCalculationType
	 */
	public final String getEquitiesMarginCalculationType() {
		return equitiesMarginCalculationType;
	}

	/**
	 * @param equitiesMarginCalculationType the equitiesMarginCalculationType to set
	 */
	public final void setEquitiesMarginCalculationType(String equitiesMarginCalculationType) {
		this.equitiesMarginCalculationType = equitiesMarginCalculationType;
	}

	/**
	 * @return the calculationTypeFeeScheduleName
	 */
	public final String getCalculationTypeFeeScheduleName() {
		return calculationTypeFeeScheduleName;
	}

	/**
	 * @param calculationTypeFeeScheduleName the calculationTypeFeeScheduleName to set
	 */
	public final void setCalculationTypeFeeScheduleName(String calculationTypeFeeScheduleName) {
		this.calculationTypeFeeScheduleName = calculationTypeFeeScheduleName;
	}

	/**
	 * @return the furturesMarginRateMultiplier
	 */
	public final Double getFurturesMarginRateMultiplier() {
		return furturesMarginRateMultiplier;
	}

	/**
	 * @param furturesMarginRateMultiplier the furturesMarginRateMultiplier to set
	 */
	public final void setFurturesMarginRateMultiplier(Double furturesMarginRateMultiplier) {
		this.furturesMarginRateMultiplier = furturesMarginRateMultiplier;
	}

	/**
	 * @return the hasIntradayEquitiesMargin
	 */
	public final boolean isHasIntradayEquitiesMargin() {
		return hasIntradayEquitiesMargin;
	}

	/**
	 * @param hasIntradayEquitiesMargin the hasIntradayEquitiesMargin to set
	 */
	public final void setHasIntradayEquitiesMargin(boolean hasIntradayEquitiesMargin) {
		this.hasIntradayEquitiesMargin = hasIntradayEquitiesMargin;
	}

	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the isAggregatedAtClearing
	 */
	public final boolean isAggregatedAtClearing() {
		return isAggregatedAtClearing;
	}

	/**
	 * @param isAggregatedAtClearing the isAggregatedAtClearing to set
	 */
	public final void setAggregatedAtClearing(boolean isAggregatedAtClearing) {
		this.isAggregatedAtClearing = isAggregatedAtClearing;
	}

	/**
	 * @return the isClosed
	 */
	public final boolean isClosed() {
		return isClosed;
	}

	/**
	 * @param isClosed the isClosed to set
	 */
	public final void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
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
	 * @return the isCryptocurrencyClosingOnly
	 */
	public final boolean isCryptocurrencyClosingOnly() {
		return isCryptocurrencyClosingOnly;
	}

	/**
	 * @param isCryptocurrencyClosingOnly the isCryptocurrencyClosingOnly to set
	 */
	public final void setCryptocurrencyClosingOnly(boolean isCryptocurrencyClosingOnly) {
		this.isCryptocurrencyClosingOnly = isCryptocurrencyClosingOnly;
	}

	/**
	 * @return the isCryptocurrencyEnabled
	 */
	public final boolean isCryptocurrencyEnabled() {
		return isCryptocurrencyEnabled;
	}

	/**
	 * @param isCryptocurrencyEnabled the isCryptocurrencyEnabled to set
	 */
	public final void setCryptocurrencyEnabled(boolean isCryptocurrencyEnabled) {
		this.isCryptocurrencyEnabled = isCryptocurrencyEnabled;
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
	 * @return the isFullEquityMarginRequired
	 */
	public final boolean isFullEquityMarginRequired() {
		return isFullEquityMarginRequired;
	}

	/**
	 * @param isFullEquityMarginRequired the isFullEquityMarginRequired to set
	 */
	public final void setFullEquityMarginRequired(boolean isFullEquityMarginRequired) {
		this.isFullEquityMarginRequired = isFullEquityMarginRequired;
	}

	/**
	 * @return the isFuturesClosingOnly
	 */
	public final boolean isFuturesClosingOnly() {
		return isFuturesClosingOnly;
	}

	/**
	 * @param isFuturesClosingOnly the isFuturesClosingOnly to set
	 */
	public final void setFuturesClosingOnly(boolean isFuturesClosingOnly) {
		this.isFuturesClosingOnly = isFuturesClosingOnly;
	}

	/**
	 * @return the isFuturesIntraDayEnabled
	 */
	public final boolean isFuturesIntraDayEnabled() {
		return isFuturesIntraDayEnabled;
	}

	/**
	 * @param isFuturesIntraDayEnabled the isFuturesIntraDayEnabled to set
	 */
	public final void setFuturesIntraDayEnabled(boolean isFuturesIntraDayEnabled) {
		this.isFuturesIntraDayEnabled = isFuturesIntraDayEnabled;
	}

	/**
	 * @return the isFuturesEnabled
	 */
	public final boolean isFuturesEnabled() {
		return isFuturesEnabled;
	}

	/**
	 * @param isFuturesEnabled the isFuturesEnabled to set
	 */
	public final void setFuturesEnabled(boolean isFuturesEnabled) {
		this.isFuturesEnabled = isFuturesEnabled;
	}

	/**
	 * @return the isInDayTradeEquityMaintenanceCall
	 */
	public final boolean isInDayTradeEquityMaintenanceCall() {
		return isInDayTradeEquityMaintenanceCall;
	}

	/**
	 * @param isInDayTradeEquityMaintenanceCall the isInDayTradeEquityMaintenanceCall to set
	 */
	public final void setInDayTradeEquityMaintenanceCall(boolean isInDayTradeEquityMaintenanceCall) {
		this.isInDayTradeEquityMaintenanceCall = isInDayTradeEquityMaintenanceCall;
	}

	/**
	 * @return the isInMarginCall
	 */
	public final boolean isInMarginCall() {
		return isInMarginCall;
	}

	/**
	 * @param isInMarginCall the isInMarginCall to set
	 */
	public final void setInMarginCall(boolean isInMarginCall) {
		this.isInMarginCall = isInMarginCall;
	}

	/**
	 * @return the isPatternDayTrader
	 */
	public final boolean isPatternDayTrader() {
		return isPatternDayTrader;
	}

	/**
	 * @param isPatternDayTrader the isPatternDayTrader to set
	 */
	public final void setPatternDayTrader(boolean isPatternDayTrader) {
		this.isPatternDayTrader = isPatternDayTrader;
	}

	/**
	 * @return the isPortfolioMarginEnabled
	 */
	public final boolean isPortfolioMarginEnabled() {
		return isPortfolioMarginEnabled;
	}

	/**
	 * @param isPortfolioMarginEnabled the isPortfolioMarginEnabled to set
	 */
	public final void setPortfolioMarginEnabled(boolean isPortfolioMarginEnabled) {
		this.isPortfolioMarginEnabled = isPortfolioMarginEnabled;
	}

	/**
	 * @return the isRiskReduceingOnly
	 */
	public final boolean isRiskReduceingOnly() {
		return isRiskReduceingOnly;
	}

	/**
	 * @param isRiskReduceingOnly the isRiskReduceingOnly to set
	 */
	public final void setRiskReduceingOnly(boolean isRiskReduceingOnly) {
		this.isRiskReduceingOnly = isRiskReduceingOnly;
	}

	/**
	 * @return the isSmallNotionalFuturesIntraDayEnabled
	 */
	public final boolean isSmallNotionalFuturesIntraDayEnabled() {
		return isSmallNotionalFuturesIntraDayEnabled;
	}

	/**
	 * @param isSmallNotionalFuturesIntraDayEnabled the isSmallNotionalFuturesIntraDayEnabled to set
	 */
	public final void setSmallNotionalFuturesIntraDayEnabled(boolean isSmallNotionalFuturesIntraDayEnabled) {
		this.isSmallNotionalFuturesIntraDayEnabled = isSmallNotionalFuturesIntraDayEnabled;
	}

	/**
	 * @return the isRollTheDayForwardEnabled
	 */
	public final boolean isRollTheDayForwardEnabled() {
		return isRollTheDayForwardEnabled;
	}

	/**
	 * @param isRollTheDayForwardEnabled the isRollTheDayForwardEnabled to set
	 */
	public final void setRollTheDayForwardEnabled(boolean isRollTheDayForwardEnabled) {
		this.isRollTheDayForwardEnabled = isRollTheDayForwardEnabled;
	}

	/**
	 * @return the areFarOtmNetOptionsRestricted
	 */
	public final boolean isAreFarOtmNetOptionsRestricted() {
		return areFarOtmNetOptionsRestricted;
	}

	/**
	 * @param areFarOtmNetOptionsRestricted the areFarOtmNetOptionsRestricted to set
	 */
	public final void setAreFarOtmNetOptionsRestricted(boolean areFarOtmNetOptionsRestricted) {
		this.areFarOtmNetOptionsRestricted = areFarOtmNetOptionsRestricted;
	}

	/**
	 * @return the optionsLevel
	 */
	public final String getOptionsLevel() {
		return optionsLevel;
	}

	/**
	 * @param optionsLevel the optionsLevel to set
	 */
	public final void setOptionsLevel(String optionsLevel) {
		this.optionsLevel = optionsLevel;
	}

	/**
	 * @return the pdtResetOn
	 */
	public final String getPdtResetOn() {
		return pdtResetOn;
	}

	/**
	 * @param pdtResetOn the pdtResetOn to set
	 */
	public final void setPdtResetOn(String pdtResetOn) {
		this.pdtResetOn = pdtResetOn;
	}

	/**
	 * @return the shortCallsEnabled
	 */
	public final boolean isShortCallsEnabled() {
		return shortCallsEnabled;
	}

	/**
	 * @param shortCallsEnabled the shortCallsEnabled to set
	 */
	public final void setShortCallsEnabled(boolean shortCallsEnabled) {
		this.shortCallsEnabled = shortCallsEnabled;
	}

	/**
	 * @return the smallNotionalFuturesMarginRateMultiplierCmtaOverride
	 */
	public final Double getSmallNotionalFuturesMarginRateMultiplierCmtaOverride() {
		return smallNotionalFuturesMarginRateMultiplierCmtaOverride;
	}

	/**
	 * @param smallNotionalFuturesMarginRateMultiplierCmtaOverride the smallNotionalFuturesMarginRateMultiplierCmtaOverride to set
	 */
	public final void setSmallNotionalFuturesMarginRateMultiplierCmtaOverride(
			Double smallNotionalFuturesMarginRateMultiplierCmtaOverride) {
		this.smallNotionalFuturesMarginRateMultiplierCmtaOverride = smallNotionalFuturesMarginRateMultiplierCmtaOverride;
	}

	/**
	 * @return the isEquityOfferingEnabled
	 */
	public final boolean isEquityOfferingEnabled() {
		return isEquityOfferingEnabled;
	}

	/**
	 * @param isEquityOfferingEnabled the isEquityOfferingEnabled to set
	 */
	public final void setEquityOfferingEnabled(boolean isEquityOfferingEnabled) {
		this.isEquityOfferingEnabled = isEquityOfferingEnabled;
	}

	/**
	 * @return the isEquityOfferingClosingOnly
	 */
	public final boolean isEquityOfferingClosingOnly() {
		return isEquityOfferingClosingOnly;
	}

	/**
	 * @param isEquityOfferingClosingOnly the isEquityOfferingClosingOnly to set
	 */
	public final void setEquityOfferingClosingOnly(boolean isEquityOfferingClosingOnly) {
		this.isEquityOfferingClosingOnly = isEquityOfferingClosingOnly;
	}

	/**
	 * @return the enhancedFraudSafeguardsEnabledAt
	 */
	public final String getEnhancedFraudSafeguardsEnabledAt() {
		return enhancedFraudSafeguardsEnabledAt;
	}

	/**
	 * @param enhancedFraudSafeguardsEnabledAt the enhancedFraudSafeguardsEnabledAt to set
	 */
	public final void setEnhancedFraudSafeguardsEnabledAt(String enhancedFraudSafeguardsEnabledAt) {
		this.enhancedFraudSafeguardsEnabledAt = enhancedFraudSafeguardsEnabledAt;
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
