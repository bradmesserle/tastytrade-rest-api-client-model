package com.tasty.trade.api.rest.client.model.abstracts;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractAccountBalance {

	@JsonProperty("account-number")
	private String accountNumber;
	
	@JsonProperty("cash-balance")
	private Double cashBalance;
	
	@JsonProperty("long-equity-value")
	private Double longEquityValue;
	
	@JsonProperty("short-equity-value")
	private Double shortEquityValue;
	
	@JsonProperty("long-derivative-value")
	private Double longDerivativeValue;
	
	@JsonProperty("short-derivative-value")
	private Double shortDerivativeValue;
	
	@JsonProperty("long-futures-value")
	private Double longFuturesValue;
	
	@JsonProperty("short-futures-value")
	private Double shortFuturesValue;
	
	@JsonProperty("long-futures-derivative-value")
	private Double longFuturesDerivativeValue;
	
	@JsonProperty("short-futures-derivative-value")
	private Double shortFuturesDerivativeValue;
	
	@JsonProperty("long-margineable-value")
	private Double longMargineableValue;
	
	@JsonProperty("short-margineable-value")
	private Double shortMargineableValue;
	
	@JsonProperty("margin-equity")
	private Double marginEquity;
	
	@JsonProperty("equity-buying-power")
	private Double equityBuyingPower;
	
	@JsonProperty("derivative-buying-power")
	private Double derivativeBuyingPower;
	
	@JsonProperty("day-trading-buying-power")
	private Double dayTradingBuyingPower;
	
	@JsonProperty("futures-margin-requirement")
	private Double futuresMarginRequirement;
	
	@JsonProperty("available-trading-funds")
	private Double availableTradingFunds;
	
	@JsonProperty("maintenance-requirement")
	private Double maintenanceRequirement;
	
	@JsonProperty("maintenance-call-value")
	private Double maintenanceCallValue;
	
	@JsonProperty("reg-t-call-value")
	private Double regTCallValue;
	
	@JsonProperty("day-trading-call-value")
	private Double dayTradingCallvalue;
	
	@JsonProperty("day-equity-call-value")
	private Double dayEquityCallValue;
	
	@JsonProperty("net-liquidating-value")
	private Double netLiquidatingValue;
	
	@JsonProperty("cash-available-to-withdraw")
	private Double cashAvailableToWithdraw;
	
	@JsonProperty("day-trade-excess")
	private Double dayTradeExcess;
	
	@JsonProperty("pending-cash")
	private Double pendingCash;
	
	@JsonProperty("pending-cash-effect")
	private String pendingCashEffect;
	
	@JsonProperty("long-cryptocurrency-value")
	private Double longCryptocurrencyValue;
	
	@JsonProperty("short-cryptocurrency-value")
	private Double shortCryptocurrencyValue;
	
	@JsonProperty("cryptocurrency-margin-requirement")
	private Double cryptocurrencyMarginRequirement;
	
	@JsonProperty("unsettled-cryptocurrency-fiat-amount")
	private Double unsettledCryptocurrencyFiatAmount;
	
	@JsonProperty("unsettled-cryptocurrency-fiat-effect")	
	private String unsettledCryptocurrencyFiatEffect;
	
	@JsonProperty("closed-loop-available-balance")
	private Double closedLoopAvailableBalance;
	
	@JsonProperty("equity-offering-margin-requirement")
	private Double equityOfferingMarginRequirement;
	
	@JsonProperty("long-bond-value")
	private Double longBondValue;
	
	@JsonProperty("bond-margin-requirement")
	private Double bondMarginRequirement;
	
	@JsonProperty("used-derivative-buying-power")
	private Double usedDerivativeBuyingPower;
	
	//TODO: Convert to Date Time.
	@JsonProperty("snapshot-date")
	private String snapshotDate;
	
	@JsonProperty("time-of-day")
	private String timeOfDay;

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
	 * @return the cashBalance
	 */
	public final Double getCashBalance() {
		return cashBalance;
	}

	/**
	 * @param cashBalance the cashBalance to set
	 */
	public final void setCashBalance(Double cashBalance) {
		this.cashBalance = cashBalance;
	}

	/**
	 * @return the longEquityValue
	 */
	public final Double getLongEquityValue() {
		return longEquityValue;
	}

	/**
	 * @param longEquityValue the longEquityValue to set
	 */
	public final void setLongEquityValue(Double longEquityValue) {
		this.longEquityValue = longEquityValue;
	}

	/**
	 * @return the shortEquityValue
	 */
	public final Double getShortEquityValue() {
		return shortEquityValue;
	}

	/**
	 * @param shortEquityValue the shortEquityValue to set
	 */
	public final void setShortEquityValue(Double shortEquityValue) {
		this.shortEquityValue = shortEquityValue;
	}

	/**
	 * @return the longDerivativeValue
	 */
	public final Double getLongDerivativeValue() {
		return longDerivativeValue;
	}

	/**
	 * @param longDerivativeValue the longDerivativeValue to set
	 */
	public final void setLongDerivativeValue(Double longDerivativeValue) {
		this.longDerivativeValue = longDerivativeValue;
	}

	/**
	 * @return the shortDerivativeValue
	 */
	public final Double getShortDerivativeValue() {
		return shortDerivativeValue;
	}

	/**
	 * @param shortDerivativeValue the shortDerivativeValue to set
	 */
	public final void setShortDerivativeValue(Double shortDerivativeValue) {
		this.shortDerivativeValue = shortDerivativeValue;
	}

	/**
	 * @return the longFuturesValue
	 */
	public final Double getLongFuturesValue() {
		return longFuturesValue;
	}

	/**
	 * @param longFuturesValue the longFuturesValue to set
	 */
	public final void setLongFuturesValue(Double longFuturesValue) {
		this.longFuturesValue = longFuturesValue;
	}

	/**
	 * @return the shortFuturesValue
	 */
	public final Double getShortFuturesValue() {
		return shortFuturesValue;
	}

	/**
	 * @param shortFuturesValue the shortFuturesValue to set
	 */
	public final void setShortFuturesValue(Double shortFuturesValue) {
		this.shortFuturesValue = shortFuturesValue;
	}

	/**
	 * @return the longFuturesDerivativeValue
	 */
	public final Double getLongFuturesDerivativeValue() {
		return longFuturesDerivativeValue;
	}

	/**
	 * @param longFuturesDerivativeValue the longFuturesDerivativeValue to set
	 */
	public final void setLongFuturesDerivativeValue(Double longFuturesDerivativeValue) {
		this.longFuturesDerivativeValue = longFuturesDerivativeValue;
	}

	/**
	 * @return the shortFuturesDerivativeValue
	 */
	public final Double getShortFuturesDerivativeValue() {
		return shortFuturesDerivativeValue;
	}

	/**
	 * @param shortFuturesDerivativeValue the shortFuturesDerivativeValue to set
	 */
	public final void setShortFuturesDerivativeValue(Double shortFuturesDerivativeValue) {
		this.shortFuturesDerivativeValue = shortFuturesDerivativeValue;
	}

	/**
	 * @return the longMargineableValue
	 */
	public final Double getLongMargineableValue() {
		return longMargineableValue;
	}

	/**
	 * @param longMargineableValue the longMargineableValue to set
	 */
	public final void setLongMargineableValue(Double longMargineableValue) {
		this.longMargineableValue = longMargineableValue;
	}

	/**
	 * @return the shortMargineableValue
	 */
	public final Double getShortMargineableValue() {
		return shortMargineableValue;
	}

	/**
	 * @param shortMargineableValue the shortMargineableValue to set
	 */
	public final void setShortMargineableValue(Double shortMargineableValue) {
		this.shortMargineableValue = shortMargineableValue;
	}

	/**
	 * @return the marginEquity
	 */
	public final Double getMarginEquity() {
		return marginEquity;
	}

	/**
	 * @param marginEquity the marginEquity to set
	 */
	public final void setMarginEquity(Double marginEquity) {
		this.marginEquity = marginEquity;
	}

	/**
	 * @return the equityBuyingPower
	 */
	public final Double getEquityBuyingPower() {
		return equityBuyingPower;
	}

	/**
	 * @param equityBuyingPower the equityBuyingPower to set
	 */
	public final void setEquityBuyingPower(Double equityBuyingPower) {
		this.equityBuyingPower = equityBuyingPower;
	}

	/**
	 * @return the derivativeBuyingPower
	 */
	public final Double getDerivativeBuyingPower() {
		return derivativeBuyingPower;
	}

	/**
	 * @param derivativeBuyingPower the derivativeBuyingPower to set
	 */
	public final void setDerivativeBuyingPower(Double derivativeBuyingPower) {
		this.derivativeBuyingPower = derivativeBuyingPower;
	}

	/**
	 * @return the dayTradingBuyingPower
	 */
	public final Double getDayTradingBuyingPower() {
		return dayTradingBuyingPower;
	}

	/**
	 * @param dayTradingBuyingPower the dayTradingBuyingPower to set
	 */
	public final void setDayTradingBuyingPower(Double dayTradingBuyingPower) {
		this.dayTradingBuyingPower = dayTradingBuyingPower;
	}

	/**
	 * @return the futuresMarginRequirement
	 */
	public final Double getFuturesMarginRequirement() {
		return futuresMarginRequirement;
	}

	/**
	 * @param futuresMarginRequirement the futuresMarginRequirement to set
	 */
	public final void setFuturesMarginRequirement(Double futuresMarginRequirement) {
		this.futuresMarginRequirement = futuresMarginRequirement;
	}

	/**
	 * @return the availableTradingFunds
	 */
	public final Double getAvailableTradingFunds() {
		return availableTradingFunds;
	}

	/**
	 * @param availableTradingFunds the availableTradingFunds to set
	 */
	public final void setAvailableTradingFunds(Double availableTradingFunds) {
		this.availableTradingFunds = availableTradingFunds;
	}

	/**
	 * @return the maintenanceRequirement
	 */
	public final Double getMaintenanceRequirement() {
		return maintenanceRequirement;
	}

	/**
	 * @param maintenanceRequirement the maintenanceRequirement to set
	 */
	public final void setMaintenanceRequirement(Double maintenanceRequirement) {
		this.maintenanceRequirement = maintenanceRequirement;
	}

	/**
	 * @return the maintenanceCallValue
	 */
	public final Double getMaintenanceCallValue() {
		return maintenanceCallValue;
	}

	/**
	 * @param maintenanceCallValue the maintenanceCallValue to set
	 */
	public final void setMaintenanceCallValue(Double maintenanceCallValue) {
		this.maintenanceCallValue = maintenanceCallValue;
	}

	/**
	 * @return the regTCallValue
	 */
	public final Double getRegTCallValue() {
		return regTCallValue;
	}

	/**
	 * @param regTCallValue the regTCallValue to set
	 */
	public final void setRegTCallValue(Double regTCallValue) {
		this.regTCallValue = regTCallValue;
	}

	/**
	 * @return the dayTradingCallvalue
	 */
	public final Double getDayTradingCallvalue() {
		return dayTradingCallvalue;
	}

	/**
	 * @param dayTradingCallvalue the dayTradingCallvalue to set
	 */
	public final void setDayTradingCallvalue(Double dayTradingCallvalue) {
		this.dayTradingCallvalue = dayTradingCallvalue;
	}

	/**
	 * @return the dayEquityCallValue
	 */
	public final Double getDayEquityCallValue() {
		return dayEquityCallValue;
	}

	/**
	 * @param dayEquityCallValue the dayEquityCallValue to set
	 */
	public final void setDayEquityCallValue(Double dayEquityCallValue) {
		this.dayEquityCallValue = dayEquityCallValue;
	}

	/**
	 * @return the netLiquidatingValue
	 */
	public final Double getNetLiquidatingValue() {
		return netLiquidatingValue;
	}

	/**
	 * @param netLiquidatingValue the netLiquidatingValue to set
	 */
	public final void setNetLiquidatingValue(Double netLiquidatingValue) {
		this.netLiquidatingValue = netLiquidatingValue;
	}

	/**
	 * @return the cashAvailableToWithdraw
	 */
	public final Double getCashAvailableToWithdraw() {
		return cashAvailableToWithdraw;
	}

	/**
	 * @param cashAvailableToWithdraw the cashAvailableToWithdraw to set
	 */
	public final void setCashAvailableToWithdraw(Double cashAvailableToWithdraw) {
		this.cashAvailableToWithdraw = cashAvailableToWithdraw;
	}

	/**
	 * @return the dayTradeExcess
	 */
	public final Double getDayTradeExcess() {
		return dayTradeExcess;
	}

	/**
	 * @param dayTradeExcess the dayTradeExcess to set
	 */
	public final void setDayTradeExcess(Double dayTradeExcess) {
		this.dayTradeExcess = dayTradeExcess;
	}

	/**
	 * @return the pendingCash
	 */
	public final Double getPendingCash() {
		return pendingCash;
	}

	/**
	 * @param pendingCash the pendingCash to set
	 */
	public final void setPendingCash(Double pendingCash) {
		this.pendingCash = pendingCash;
	}

	/**
	 * @return the pendingCashEffect
	 */
	public final String getPendingCashEffect() {
		return pendingCashEffect;
	}

	/**
	 * @param pendingCashEffect the pendingCashEffect to set
	 */
	public final void setPendingCashEffect(String pendingCashEffect) {
		this.pendingCashEffect = pendingCashEffect;
	}

	/**
	 * @return the longCryptocurrencyValue
	 */
	public final Double getLongCryptocurrencyValue() {
		return longCryptocurrencyValue;
	}

	/**
	 * @param longCryptocurrencyValue the longCryptocurrencyValue to set
	 */
	public final void setLongCryptocurrencyValue(Double longCryptocurrencyValue) {
		this.longCryptocurrencyValue = longCryptocurrencyValue;
	}

	/**
	 * @return the shortCryptocurrencyValue
	 */
	public final Double getShortCryptocurrencyValue() {
		return shortCryptocurrencyValue;
	}

	/**
	 * @param shortCryptocurrencyValue the shortCryptocurrencyValue to set
	 */
	public final void setShortCryptocurrencyValue(Double shortCryptocurrencyValue) {
		this.shortCryptocurrencyValue = shortCryptocurrencyValue;
	}

	/**
	 * @return the cryptocurrencyMarginRequirement
	 */
	public final Double getCryptocurrencyMarginRequirement() {
		return cryptocurrencyMarginRequirement;
	}

	/**
	 * @param cryptocurrencyMarginRequirement the cryptocurrencyMarginRequirement to set
	 */
	public final void setCryptocurrencyMarginRequirement(Double cryptocurrencyMarginRequirement) {
		this.cryptocurrencyMarginRequirement = cryptocurrencyMarginRequirement;
	}

	/**
	 * @return the unsettledCryptocurrencyFiatAmount
	 */
	public final Double getUnsettledCryptocurrencyFiatAmount() {
		return unsettledCryptocurrencyFiatAmount;
	}

	/**
	 * @param unsettledCryptocurrencyFiatAmount the unsettledCryptocurrencyFiatAmount to set
	 */
	public final void setUnsettledCryptocurrencyFiatAmount(Double unsettledCryptocurrencyFiatAmount) {
		this.unsettledCryptocurrencyFiatAmount = unsettledCryptocurrencyFiatAmount;
	}

	/**
	 * @return the unsettledCryptocurrencyFiatEffect
	 */
	public final String getUnsettledCryptocurrencyFiatEffect() {
		return unsettledCryptocurrencyFiatEffect;
	}

	/**
	 * @param unsettledCryptocurrencyFiatEffect the unsettledCryptocurrencyFiatEffect to set
	 */
	public final void setUnsettledCryptocurrencyFiatEffect(String unsettledCryptocurrencyFiatEffect) {
		this.unsettledCryptocurrencyFiatEffect = unsettledCryptocurrencyFiatEffect;
	}

	/**
	 * @return the closedLoopAvailableBalance
	 */
	public final Double getClosedLoopAvailableBalance() {
		return closedLoopAvailableBalance;
	}

	/**
	 * @param closedLoopAvailableBalance the closedLoopAvailableBalance to set
	 */
	public final void setClosedLoopAvailableBalance(Double closedLoopAvailableBalance) {
		this.closedLoopAvailableBalance = closedLoopAvailableBalance;
	}

	/**
	 * @return the equityOfferingMarginRequirement
	 */
	public final Double getEquityOfferingMarginRequirement() {
		return equityOfferingMarginRequirement;
	}

	/**
	 * @param equityOfferingMarginRequirement the equityOfferingMarginRequirement to set
	 */
	public final void setEquityOfferingMarginRequirement(Double equityOfferingMarginRequirement) {
		this.equityOfferingMarginRequirement = equityOfferingMarginRequirement;
	}

	/**
	 * @return the longBondValue
	 */
	public final Double getLongBondValue() {
		return longBondValue;
	}

	/**
	 * @param longBondValue the longBondValue to set
	 */
	public final void setLongBondValue(Double longBondValue) {
		this.longBondValue = longBondValue;
	}

	/**
	 * @return the bondMarginRequirement
	 */
	public final Double getBondMarginRequirement() {
		return bondMarginRequirement;
	}

	/**
	 * @param bondMarginRequirement the bondMarginRequirement to set
	 */
	public final void setBondMarginRequirement(Double bondMarginRequirement) {
		this.bondMarginRequirement = bondMarginRequirement;
	}

	/**
	 * @return the usedDerivativeBuyingPower
	 */
	public final Double getUsedDerivativeBuyingPower() {
		return usedDerivativeBuyingPower;
	}

	/**
	 * @param usedDerivativeBuyingPower the usedDerivativeBuyingPower to set
	 */
	public final void setUsedDerivativeBuyingPower(Double usedDerivativeBuyingPower) {
		this.usedDerivativeBuyingPower = usedDerivativeBuyingPower;
	}

	/**
	 * @return the snapshotDate
	 */
	public final String getSnapshotDate() {
		return snapshotDate;
	}

	/**
	 * @param snapshotDate the snapshotDate to set
	 */
	public final void setSnapshotDate(String snapshotDate) {
		this.snapshotDate = snapshotDate;
	}

	/**
	 * @return the timeOfDay
	 */
	public final String getTimeOfDay() {
		return timeOfDay;
	}

	/**
	 * @param timeOfDay the timeOfDay to set
	 */
	public final void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	
	
	
}
