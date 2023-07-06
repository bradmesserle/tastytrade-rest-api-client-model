package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.AccountBalanceImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = AccountBalanceImpl.class)
public interface AccountBalance extends AccountBalanceSnaphot {

	
	/**
	 * @return the regTMarginRequirement
	 */
	 Double getRegTMarginRequirement();

	/**
	 * @param regTMarginRequirement the regTMarginRequirement to set
	 */
	 void setRegTMarginRequirement(Double regTMarginRequirement);

	/**
	 * @return the futuresOvernightMarginRequirement
	 */
	 Double getFuturesOvernightMarginRequirement();

	/**
	 * @param futuresOvernightMarginRequirement the futuresOvernightMarginRequirement to set
	 */
	 void setFuturesOvernightMarginRequirement(Double futuresOvernightMarginRequirement);

	/**
	 * @return the futuresIntradayMarginREquirement
	 */
	 Double getFuturesIntradayMarginREquirement();

	/**
	 * @param futuresIntradayMarginREquirement the futuresIntradayMarginREquirement to set
	 */
	 void setFuturesIntradayMarginREquirement(Double futuresIntradayMarginREquirement);

	/**
	 * @return the maintenanceExcecss
	 */
	 Double getMaintenanceExcecss();

	/**
	 * @param maintenanceExcecss the maintenanceExcecss to set
	 */
	 void setMaintenanceExcecss(Double maintenanceExcecss);

	/**
	 * @return the pendingMarginInterest
	 */
	 Double getPendingMarginInterest();

	/**
	 * @param pendingMarginInterest the pendingMarginInterest to set
	 */
	 void setPendingMarginInterest(Double pendingMarginInterest);

	/**
	 * @return the apexStartingDayMarginEquity
	 */
	 Double getApexStartingDayMarginEquity();

	/**
	 * @param apexStartingDayMarginEquity the apexStartingDayMarginEquity to set
	 */
	 void setApexStartingDayMarginEquity(Double apexStartingDayMarginEquity) ;

	/**
	 * @return the buyingPowerAdjustment
	 */
	 Double getBuyingPowerAdjustment();

	/**
	 * @param buyingPowerAdjustment the buyingPowerAdjustment to set
	 */
	 void setBuyingPowerAdjustment(Double buyingPowerAdjustment);

	/**
	 * @return the buyingPowerAdjustmentEffect
	 */
	 String getBuyingPowerAdjustmentEffect();

	/**
	 * @param buyingPowerAdjustmentEffect the buyingPowerAdjustmentEffect to set
	 */
	 void setBuyingPowerAdjustmentEffect(String buyingPowerAdjustmentEffect);

	/**
	 * @return the effectiveCryptoCurrencyBuyingPower
	 */
	 Double getEffectiveCryptoCurrencyBuyingPower();

	/**
	 * @param effectiveCryptoCurrencyBuyingPower the effectiveCryptoCurrencyBuyingPower to set
	 */
	 void setEffectiveCryptoCurrencyBuyingPower(Double effectiveCryptoCurrencyBuyingPower);

	/**
	 * @return the updatedAt
	 */
	 String getUpdatedAt();

	/**
	 * @param updatedAt the updatedAt to set
	 */
	 void setUpdatedAt(String updatedAt);

}
