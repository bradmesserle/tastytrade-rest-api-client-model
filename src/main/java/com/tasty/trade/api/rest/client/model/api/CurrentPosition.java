package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.CurrentPositionImpl;

@JsonTypeInfo(defaultImpl = CurrentPositionImpl.class, use = Id.CLASS)
public interface CurrentPosition {

	/**
	 * @return the accountNumber
	 */
	 String getAccountNumber();

	/**
	 * @param accountNumber the accountNumber to set
	 */
	 void setAccountNumber(String accountNumber);

	/**
	 * @return the symbol
	 */
	 String getSymbol();

	/**
	 * @param symbol the symbol to set
	 */
	 void setSymbol(String symbol);

	/**
	 * @return the instrumentType
	 */
	 String getInstrumentType();

	/**
	 * @param instrumentType the instrumentType to set
	 */
	 void setInstrumentType(String instrumentType);

	/**
	 * @return the quantityDirection
	 */
	 String getQuantityDirection();

	/**
	 * @param quantityDirection the quantityDirection to set
	 */
	 void setQuantityDirection(String quantityDirection);

	/**
	 * @return the closePrice
	 */
	 Double getClosePrice();

	/**
	 * @param closePrice the closePrice to set
	 */
	 void setClosePrice(Double closePrice);

	/**
	 * @return the averageOpenPrice
	 */
	 Double getAverageOpenPrice();

	/**
	 * @param averageOpenPrice the averageOpenPrice to set
	 */
	 void setAverageOpenPrice(Double averageOpenPrice);
	 
	/**
	 * @return the averageYearlyMarketClosePrice
	 */
	 Double getAverageYearlyMarketClosePrice();

	/**
	 * @param averageYearlyMarketClosePrice the averageYearlyMarketClosePrice to set
	 */
	 void setAverageYearlyMarketClosePrice(Double averageYearlyMarketClosePrice);

	/**
	 * @return the averageDailyMarketClosePrice
	 */
	 Double getAverageDailyMarketClosePrice();

	/**
	 * @param averageDailyMarketClosePrice the averageDailyMarketClosePrice to set
	 */
	 void setAverageDailyMarketClosePrice(Double averageDailyMarketClosePrice);

	/**
	 * @return the mark
	 */
	 Double getMark();

	/**
	 * @param mark the mark to set
	 */
	 void setMark(Double mark);

	/**
	 * @return the markPrice
	 */
	 Double getMarkPrice();

	/**
	 * @param markPrice the markPrice to set
	 */
	 void setMarkPrice(Double markPrice);

	/**
	 * @return the multiplier
	 */
	 Integer getMultiplier();

	/**
	 * @param multiplier the multiplier to set
	 */
	 void setMultiplier(Integer multiplier);

	/**
	 * @return the costEffect
	 */
	 String getCostEffect();

	/**
	 * @param costEffect the costEffect to set
	 */
	 void setCostEffect(String costEffect);

	/**
	 * @return the isSuppressed
	 */
	 boolean isSuppressed();

	/**
	 * @param isSuppressed the isSuppressed to set
	 */
	 void setSuppressed(boolean isSuppressed);

	/**
	 * @return the isFrozen
	 */
	 boolean isFrozen();

	/**
	 * @param isFrozen the isFrozen to set
	 */
	 void setFrozen(boolean isFrozen);

	/**
	 * @return the expiresAt
	 */
	 String getExpiresAt();

	/**
	 * @param expiresAt the expiresAt to set
	 */
	 void setExpiresAt(String expiresAt);

	/**
	 * @return the fixingPrice
	 */
	 Double getFixingPrice();

	/**
	 * @param fixingPrice the fixingPrice to set
	 */
	 void setFixingPrice(Double fixingPrice);

	/**
	 * @return the deliverableType
	 */
	 String getDeliverableType();

	/**
	 * @param deliverableType the deliverableType to set
	 */
	 void setDeliverableType(String deliverableType);

	/**
	 * @return the realizeddayGain
	 */
	 Double getRealizedDayGain();

	/**
	 * @param realizeddayGain the realizeddayGain to set
	 */
	 void setRealizedDayGain(Double realizeddayGain);

	/**
	 * @return the realizedDayGainEffect
	 */
	 String getRealizedDayGainEffect();

	/**
	 * @param realizedDayGainEffect the realizedDayGainEffect to set
	 */
	 void setRealizedDayGainEffect(String realizedDayGainEffect);

	/**
	 * @return the realizedDayGainDate
	 */
	 String getRealizedDayGainDate();

	/**
	 * @param realizedDayGainDate the realizedDayGainDate to set
	 */
	 void setRealizedDayGainDate(String realizedDayGainDate);

	/**
	 * @return the realizedToday
	 */
	 Double getRealizedToday();

	/**
	 * @param realizedToday the realizedToday to set
	 */
	 void setRealizedToday(Double realizedToday);

	/**
	 * @return the realizedTodayEffect
	 */
	 String getRealizedTodayEffect();

	/**
	 * @param realizedTodayEffect the realizedTodayEffect to set
	 */
	 void setRealizedTodayEffect(String realizedTodayEffect);

	/**
	 * @return the realizedTodayDate
	 */
	 String getRealizedTodayDate();

	/**
	 * @param realizedTodayDate the realizedTodayDate to set
	 */
	 void setRealizedTodayDate(String realizedTodayDate);

	/**
	 * @return the createdAt
	 */
	 String getCreatedAt();

	/**
	 * @param createdAt the createdAt to set
	 */
	 void setCreatedAt(String createdAt);

	/**
	 * @return the updatedAt
	 */
	 String getUpdatedAt();

	/**
	 * @param updatedAt the updatedAt to set
	 */
	 void setUpdatedAt(String updatedAt);

	
}
