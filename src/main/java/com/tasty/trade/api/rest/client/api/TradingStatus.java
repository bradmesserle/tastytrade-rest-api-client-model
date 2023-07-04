package com.tasty.trade.api.rest.client.api;

public interface TradingStatus {

	/**
	 * @return the description
	 */
	 String getDescription();

	/**
	 * @param description the description to set
	 */
	 void setDescription(String description);

	/**
	 * @return the accountNumber
	 */
	 String getAccountNumber();

	/**
	 * @param accountNumber the accountNumber to set
	 */
	 void setAccountNumber(String accountNumber);
	/**
	 * @return the clearingAccountNumber
	 */
	 String getClearingAccountNumber();

	/**
	 * @param clearingAccountNumber the clearingAccountNumber to set
	 */
	 void setClearingAccountNumber(String clearingAccountNumber);

	/**
	 * @return the clearingAggregationIdentifier
	 */
	 String getClearingAggregationIdentifier(); 

	/**
	 * @param clearingAggregationIdentifier the clearingAggregationIdentifier to set
	 */
	 void setClearingAggregationIdentifier(String clearingAggregationIdentifier); 

	/**
	 * @return the dayTradeCount
	 */
	 Integer getDayTradeCount();

	/**
	 * @param dayTradeCount the dayTradeCount to set
	 */
	 void setDayTradeCount(Integer dayTradeCount) ;
	 
	/**
	 * @return the equitiesMarginCalculationType
	 */
	 String getEquitiesMarginCalculationType();

	/**
	 * @param equitiesMarginCalculationType the equitiesMarginCalculationType to set
	 */
	 void setEquitiesMarginCalculationType(String equitiesMarginCalculationType); 

	/**
	 * @return the calculationTypeFeeScheduleName
	 */
	 String getCalculationTypeFeeScheduleName(); 

	/**
	 * @param calculationTypeFeeScheduleName the calculationTypeFeeScheduleName to set
	 */
	 void setCalculationTypeFeeScheduleName(String calculationTypeFeeScheduleName);

	/**
	 * @return the furturesMarginRateMultiplier
	 */
	 Double getFurturesMarginRateMultiplier();

	/**
	 * @param furturesMarginRateMultiplier the furturesMarginRateMultiplier to set
	 */
	 void setFurturesMarginRateMultiplier(Double furturesMarginRateMultiplier); 

	/**
	 * @return the hasIntradayEquitiesMargin
	 */
	 boolean isHasIntradayEquitiesMargin(); 

	/**
	 * @param hasIntradayEquitiesMargin the hasIntradayEquitiesMargin to set
	 */
	 void setHasIntradayEquitiesMargin(boolean hasIntradayEquitiesMargin);

	/**
	 * @return the id
	 */
	 Integer getId();

	/**
	 * @param id the id to set
	 */
	 void setId(Integer id);

	/**
	 * @return the isAggregatedAtClearing
	 */
	 boolean isAggregatedAtClearing();

	/**
	 * @param isAggregatedAtClearing the isAggregatedAtClearing to set
	 */
	 void setAggregatedAtClearing(boolean isAggregatedAtClearing);

	/**
	 * @return the isClosed
	 */
	 boolean isClosed(); 

	/**
	 * @param isClosed the isClosed to set
	 */
	 void setClosed(boolean isClosed);

	/**
	 * @return the isClosingOnly
	 */
	 boolean isClosingOnly();

	/**
	 * @param isClosingOnly the isClosingOnly to set
	 */
	 void setClosingOnly(boolean isClosingOnly);

	/**
	 * @return the isCryptocurrencyClosingOnly
	 */
	 boolean isCryptocurrencyClosingOnly();

	/**
	 * @param isCryptocurrencyClosingOnly the isCryptocurrencyClosingOnly to set
	 */
	 void setCryptocurrencyClosingOnly(boolean isCryptocurrencyClosingOnly);

	/**
	 * @return the isCryptocurrencyEnabled
	 */
	 boolean isCryptocurrencyEnabled();

	/**
	 * @param isCryptocurrencyEnabled the isCryptocurrencyEnabled to set
	 */
	 void setCryptocurrencyEnabled(boolean isCryptocurrencyEnabled);
	 
	/**
	 * @return the isFrozen
	 */
	 boolean isFrozen();

	/**
	 * @param isFrozen the isFrozen to set
	 */
	 void setFrozen(boolean isFrozen);

	/**
	 * @return the isFullEquityMarginRequired
	 */
	 boolean isFullEquityMarginRequired();

	/**
	 * @param isFullEquityMarginRequired the isFullEquityMarginRequired to set
	 */
	 void setFullEquityMarginRequired(boolean isFullEquityMarginRequired);

	/**
	 * @return the isFuturesClosingOnly
	 */
	 boolean isFuturesClosingOnly();

	/**
	 * @param isFuturesClosingOnly the isFuturesClosingOnly to set
	 */
	 void setFuturesClosingOnly(boolean isFuturesClosingOnly);

	/**
	 * @return the isFuturesIntraDayEnabled
	 */
	 boolean isFuturesIntraDayEnabled();

	/**
	 * @param isFuturesIntraDayEnabled the isFuturesIntraDayEnabled to set
	 */
	 void setFuturesIntraDayEnabled(boolean isFuturesIntraDayEnabled);

	/**
	 * @return the isFuturesEnabled
	 */
	 boolean isFuturesEnabled();

	/**
	 * @param isFuturesEnabled the isFuturesEnabled to set
	 */
	 void setFuturesEnabled(boolean isFuturesEnabled);

	/**
	 * @return the isInDayTradeEquityMaintenanceCall
	 */
	 boolean isInDayTradeEquityMaintenanceCall();

	/**
	 * @param isInDayTradeEquityMaintenanceCall the isInDayTradeEquityMaintenanceCall to set
	 */
	 void setInDayTradeEquityMaintenanceCall(boolean isInDayTradeEquityMaintenanceCall);
	 
	/**
	 * @return the isInMarginCall
	 */
	 boolean isInMarginCall();

	/**
	 * @param isInMarginCall the isInMarginCall to set
	 */
	 void setInMarginCall(boolean isInMarginCall);

	/**
	 * @return the isPatternDayTrader
	 */
	 boolean isPatternDayTrader();

	/**
	 * @param isPatternDayTrader the isPatternDayTrader to set
	 */
	 void setPatternDayTrader(boolean isPatternDayTrader);

	/**
	 * @return the isPortfolioMarginEnabled
	 */
	 boolean isPortfolioMarginEnabled();

	/**
	 * @param isPortfolioMarginEnabled the isPortfolioMarginEnabled to set
	 */
	 void setPortfolioMarginEnabled(boolean isPortfolioMarginEnabled);

	/**
	 * @return the isRiskReduceingOnly
	 */
	 boolean isRiskReduceingOnly();
	 
	/**
	 * @param isRiskReduceingOnly the isRiskReduceingOnly to set
	 */
	 void setRiskReduceingOnly(boolean isRiskReduceingOnly);

	/**
	 * @return the isSmallNotionalFuturesIntraDayEnabled
	 */
	 boolean isSmallNotionalFuturesIntraDayEnabled();

	/**
	 * @param isSmallNotionalFuturesIntraDayEnabled the isSmallNotionalFuturesIntraDayEnabled to set
	 */
	 void setSmallNotionalFuturesIntraDayEnabled(boolean isSmallNotionalFuturesIntraDayEnabled);

	/**
	 * @return the isRollTheDayForwardEnabled
	 */
	 boolean isRollTheDayForwardEnabled();

	/**
	 * @param isRollTheDayForwardEnabled the isRollTheDayForwardEnabled to set
	 */
	 void setRollTheDayForwardEnabled(boolean isRollTheDayForwardEnabled);

	/**
	 * @return the areFarOtmNetOptionsRestricted
	 */
	 boolean isAreFarOtmNetOptionsRestricted();

	/**
	 * @param areFarOtmNetOptionsRestricted the areFarOtmNetOptionsRestricted to set
	 */
	 void setAreFarOtmNetOptionsRestricted(boolean areFarOtmNetOptionsRestricted);

	/**
	 * @return the optionsLevel
	 */
	 String getOptionsLevel();

	/**
	 * @param optionsLevel the optionsLevel to set
	 */
	 void setOptionsLevel(String optionsLevel);

	/**
	 * @return the pdtResetOn
	 */
	 String getPdtResetOn();

	/**
	 * @param pdtResetOn the pdtResetOn to set
	 */
	 void setPdtResetOn(String pdtResetOn);

	/**
	 * @return the shortCallsEnabled
	 */
	 boolean isShortCallsEnabled();

	/**
	 * @param shortCallsEnabled the shortCallsEnabled to set
	 */
	 void setShortCallsEnabled(boolean shortCallsEnabled);

	/**
	 * @return the smallNotionalFuturesMarginRateMultiplierCmtaOverride
	 */
	 Double getSmallNotionalFuturesMarginRateMultiplierCmtaOverride();

	/**
	 * @param smallNotionalFuturesMarginRateMultiplierCmtaOverride the smallNotionalFuturesMarginRateMultiplierCmtaOverride to set
	 */
	 void setSmallNotionalFuturesMarginRateMultiplierCmtaOverride(
			Double smallNotionalFuturesMarginRateMultiplierCmtaOverride);

	/**
	 * @return the isEquityOfferingEnabled
	 */
	 boolean isEquityOfferingEnabled();

	/**
	 * @param isEquityOfferingEnabled the isEquityOfferingEnabled to set
	 */
	 void setEquityOfferingEnabled(boolean isEquityOfferingEnabled);

	/**
	 * @return the isEquityOfferingClosingOnly
	 */
	 boolean isEquityOfferingClosingOnly();

	/**
	 * @param isEquityOfferingClosingOnly the isEquityOfferingClosingOnly to set
	 */
	 void setEquityOfferingClosingOnly(boolean isEquityOfferingClosingOnly);

	/**
	 * @return the enhancedFraudSafeguardsEnabledAt
	 */
	 String getEnhancedFraudSafeguardsEnabledAt();

	/**
	 * @param enhancedFraudSafeguardsEnabledAt the enhancedFraudSafeguardsEnabledAt to set
	 */
	 void setEnhancedFraudSafeguardsEnabledAt(String enhancedFraudSafeguardsEnabledAt);

	/**
	 * @return the updatedAt
	 */
	 String getUpdatedAt();

	/**
	 * @param updatedAt the updatedAt to set
	 */
	 void setUpdatedAt(String updatedAt);
	
	
	
}
