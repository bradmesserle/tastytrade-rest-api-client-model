package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.AccountBalanceSnapshotImpl;

@JsonTypeInfo(defaultImpl = AccountBalanceSnapshotImpl.class,use = Id.CLASS)
public interface AccountBalanceSnaphot {


	/**
	 * @return the accountNumber
	 */
	 String getAccountNumber();

	/**
	 * @param accountNumber the accountNumber to set
	 */
	 void setAccountNumber(String accountNumber);

	/**
	 * @return the cashBalance
	 */
	 Double getCashBalance();

	/**
	 * @param cashBalance the cashBalance to set
	 */
	 void setCashBalance(Double cashBalance);

	/**
	 * @return the longEquityValue
	 */
	 Double getLongEquityValue();

	/**
	 * @param longEquityValue the longEquityValue to set
	 */
	 void setLongEquityValue(Double longEquityValue);

	/**
	 * @return the shortEquityValue
	 */
	 Double getShortEquityValue();

	/**
	 * @param shortEquityValue the shortEquityValue to set
	 */
	 void setShortEquityValue(Double shortEquityValue);

	/**
	 * @return the longDerivativeValue
	 */
	 Double getLongDerivativeValue();

	/**
	 * @param longDerivativeValue the longDerivativeValue to set
	 */
	 void setLongDerivativeValue(Double longDerivativeValue);

	/**
	 * @return the shortDerivativeValue
	 */
	 Double getShortDerivativeValue();

	/**
	 * @param shortDerivativeValue the shortDerivativeValue to set
	 */
	 void setShortDerivativeValue(Double shortDerivativeValue);

	/**
	 * @return the longFuturesValue
	 */
	 Double getLongFuturesValue();

	/**
	 * @param longFuturesValue the longFuturesValue to set
	 */
	 void setLongFuturesValue(Double longFuturesValue);

	/**
	 * @return the shortFuturesValue
	 */
	 Double getShortFuturesValue();

	/**
	 * @param shortFuturesValue the shortFuturesValue to set
	 */
	 void setShortFuturesValue(Double shortFuturesValue);

	/**
	 * @return the longFuturesDerivativeValue
	 */
	 Double getLongFuturesDerivativeValue();

	/**
	 * @param longFuturesDerivativeValue the longFuturesDerivativeValue to set
	 */
	 void setLongFuturesDerivativeValue(Double longFuturesDerivativeValue);

	/**
	 * @return the shortFuturesDerivativeValue
	 */
	 Double getShortFuturesDerivativeValue();

	/**
	 * @param shortFuturesDerivativeValue the shortFuturesDerivativeValue to set
	 */
	 void setShortFuturesDerivativeValue(Double shortFuturesDerivativeValue);

	/**
	 * @return the longMargineableValue
	 */
	 Double getLongMargineableValue() ;

	/**
	 * @param longMargineableValue the longMargineableValue to set
	 */
	 void setLongMargineableValue(Double longMargineableValue);

	/**
	 * @return the shortMargineableValue
	 */
	 Double getShortMargineableValue();

	/**
	 * @param shortMargineableValue the shortMargineableValue to set
	 */
	 void setShortMargineableValue(Double shortMargineableValue);

	/**
	 * @return the marginEquity
	 */
	 Double getMarginEquity() ;
	 
	/**
	 * @param marginEquity the marginEquity to set
	 */
	 void setMarginEquity(Double marginEquity);

	/**
	 * @return the equityBuyingPower
	 */
	 Double getEquityBuyingPower();

	/**
	 * @param equityBuyingPower the equityBuyingPower to set
	 */
	 void setEquityBuyingPower(Double equityBuyingPower);

	/**
	 * @return the derivativeBuyingPower
	 */
	 Double getDerivativeBuyingPower();

	/**
	 * @param derivativeBuyingPower the derivativeBuyingPower to set
	 */
	 void setDerivativeBuyingPower(Double derivativeBuyingPower);

	/**
	 * @return the dayTradingBuyingPower
	 */
	 Double getDayTradingBuyingPower();

	/**
	 * @param dayTradingBuyingPower the dayTradingBuyingPower to set
	 */
	 void setDayTradingBuyingPower(Double dayTradingBuyingPower);

	/**
	 * @return the futuresMarginRequirement
	 */
	 Double getFuturesMarginRequirement();

	/**
	 * @param futuresMarginRequirement the futuresMarginRequirement to set
	 */
	 void setFuturesMarginRequirement(Double futuresMarginRequirement);

	/**
	 * @return the availableTradingFunds
	 */
	 Double getAvailableTradingFunds();

	/**
	 * @param availableTradingFunds the availableTradingFunds to set
	 */
	 void setAvailableTradingFunds(Double availableTradingFunds);

	/**
	 * @return the maintenanceRequirement
	 */
	 Double getMaintenanceRequirement();

	/**
	 * @param maintenanceRequirement the maintenanceRequirement to set
	 */
	 void setMaintenanceRequirement(Double maintenanceRequirement);

	/**
	 * @return the maintenanceCallValue
	 */
	 Double getMaintenanceCallValue();

	/**
	 * @param maintenanceCallValue the maintenanceCallValue to set
	 */
	 void setMaintenanceCallValue(Double maintenanceCallValue);

	/**
	 * @return the regTCallValue
	 */
	 Double getRegTCallValue();

	/**
	 * @param regTCallValue the regTCallValue to set
	 */
	 void setRegTCallValue(Double regTCallValue);

	/**
	 * @return the dayTradingCallvalue
	 */
	 Double getDayTradingCallvalue();

	/**
	 * @param dayTradingCallvalue the dayTradingCallvalue to set
	 */
	 void setDayTradingCallvalue(Double dayTradingCallvalue);

	/**
	 * @return the dayEquityCallValue
	 */
	 Double getDayEquityCallValue();

	/**
	 * @param dayEquityCallValue the dayEquityCallValue to set
	 */
	 void setDayEquityCallValue(Double dayEquityCallValue);

	/**
	 * @return the netLiquidatingValue
	 */
	 Double getNetLiquidatingValue();

	/**
	 * @param netLiquidatingValue the netLiquidatingValue to set
	 */
	 void setNetLiquidatingValue(Double netLiquidatingValue);

	/**
	 * @return the cashAvailableToWithdraw
	 */
	 Double getCashAvailableToWithdraw();

	/**
	 * @param cashAvailableToWithdraw the cashAvailableToWithdraw to set
	 */
	 void setCashAvailableToWithdraw(Double cashAvailableToWithdraw);

	/**
	 * @return the dayTradeExcess
	 */
	 Double getDayTradeExcess();

	/**
	 * @param dayTradeExcess the dayTradeExcess to set
	 */
	 void setDayTradeExcess(Double dayTradeExcess);

	/**
	 * @return the pendingCash
	 */
	 Double getPendingCash();

	/**
	 * @param pendingCash the pendingCash to set
	 */
	 void setPendingCash(Double pendingCash);

	/**
	 * @return the pendingCashEffect
	 */
	 String getPendingCashEffect();

	/**
	 * @param pendingCashEffect the pendingCashEffect to set
	 */
	 void setPendingCashEffect(String pendingCashEffect);

	/**
	 * @return the longCryptocurrencyValue
	 */
	 Double getLongCryptocurrencyValue();

	/**
	 * @param longCryptocurrencyValue the longCryptocurrencyValue to set
	 */
	 void setLongCryptocurrencyValue(Double longCryptocurrencyValue);

	/**
	 * @return the shortCryptocurrencyValue
	 */
	 Double getShortCryptocurrencyValue();

	/**
	 * @param shortCryptocurrencyValue the shortCryptocurrencyValue to set
	 */
	 void setShortCryptocurrencyValue(Double shortCryptocurrencyValue);

	/**
	 * @return the cryptocurrencyMarginRequirement
	 */
	 Double getCryptocurrencyMarginRequirement();

	/**
	 * @param cryptocurrencyMarginRequirement the cryptocurrencyMarginRequirement to set
	 */
	 void setCryptocurrencyMarginRequirement(Double cryptocurrencyMarginRequirement);

	/**
	 * @return the unsettledCryptocurrencyFiatAmount
	 */
	 Double getUnsettledCryptocurrencyFiatAmount();

	/**
	 * @param unsettledCryptocurrencyFiatAmount the unsettledCryptocurrencyFiatAmount to set
	 */
	 void setUnsettledCryptocurrencyFiatAmount(Double unsettledCryptocurrencyFiatAmount);

	/**
	 * @return the unsettledCryptocurrencyFiatEffect
	 */
	 String getUnsettledCryptocurrencyFiatEffect();

	/**
	 * @param unsettledCryptocurrencyFiatEffect the unsettledCryptocurrencyFiatEffect to set
	 */
	 void setUnsettledCryptocurrencyFiatEffect(String unsettledCryptocurrencyFiatEffect);

	/**
	 * @return the closedLoopAvailableBalance
	 */
	 Double getClosedLoopAvailableBalance();

	/**
	 * @param closedLoopAvailableBalance the closedLoopAvailableBalance to set
	 */
	 void setClosedLoopAvailableBalance(Double closedLoopAvailableBalance);

	/**
	 * @return the equityOfferingMarginRequirement
	 */
	 Double getEquityOfferingMarginRequirement();

	/**
	 * @param equityOfferingMarginRequirement the equityOfferingMarginRequirement to set
	 */
	 void setEquityOfferingMarginRequirement(Double equityOfferingMarginRequirement);

	/**
	 * @return the longBondValue
	 */
	 Double getLongBondValue();

	/**
	 * @param longBondValue the longBondValue to set
	 */
	 void setLongBondValue(Double longBondValue);

	/**
	 * @return the bondMarginRequirement
	 */
	 Double getBondMarginRequirement();

	/**
	 * @param bondMarginRequirement the bondMarginRequirement to set
	 */
	 void setBondMarginRequirement(Double bondMarginRequirement);

	/**
	 * @return the usedDerivativeBuyingPower
	 */
	 Double getUsedDerivativeBuyingPower();

	/**
	 * @param usedDerivativeBuyingPower the usedDerivativeBuyingPower to set
	 */
	 void setUsedDerivativeBuyingPower(Double usedDerivativeBuyingPower);

	/**
	 * @return the snapshotDate
	 */
	 String getSnapshotDate();

	/**
	 * @param snapshotDate the snapshotDate to set
	 */
	 void setSnapshotDate(String snapshotDate);

	/**
	 * @return the timeOfDay
	 */
	 String getTimeOfDay();

	/**
	 * @param timeOfDay the timeOfDay to set
	 */
	 void setTimeOfDay(String timeOfDay);

	
}
