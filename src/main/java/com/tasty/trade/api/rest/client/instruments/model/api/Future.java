package com.tasty.trade.api.rest.client.instruments.model.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.instruments.model.impl.FutureImpl;
import com.tasty.trade.api.rest.client.model.api.Instrument;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = FutureImpl.class)
public interface Future extends Instrument {

	/**
	 * @return the productCode
	 */
	String getProductCode();

	/**
	 * @param productCode the productCode to set
	 */
	void setProductCode(String productCode);

	/**
	 * @return the contractSize
	 */
	Double getContractSize();

	/**
	 * @param contractSize the contractSize to set
	 */
	void setContractSize(Double contractSize);

	/**
	 * @return the notionalMultiplier
	 */
	Double getNotionalMultiplier();

	/**
	 * @param notionalMultiplier the notionalMultiplier to set
	 */
	void setNotionalMultiplier(Double notionalMultiplier);

	/**
	 * @return the mainFraction
	 */
	Double getMainFraction();

	/**
	 * @param mainFraction the mainFraction to set
	 */
	void setMainFraction(Double mainFraction);

	/**
	 * @return the subFraction
	 */
	Double getSubFraction();

	/**
	 * @param subFraction the subFraction to set
	 */
	void setSubFraction(Double subFraction);

	/**
	 * @return the displayFactor
	 */
	Double getDisplayFactor();

	/**
	 * @param displayFactor the displayFactor to set
	 */
	void setDisplayFactor(Double displayFactor);

	/**
	 * @return the lastTradeDate
	 */
	String getLastTradeDate();

	/**
	 * @param lastTradeDate the lastTradeDate to set
	 */
	void setLastTradeDate(String lastTradeDate);

	/**
	 * @return the expirationDate
	 */
	String getExpirationDate();

	/**
	 * @param expirationDate the expirationDate to set
	 */
	void setExpirationDate(String expirationDate);

	/**
	 * @return the closingOnlyDate
	 */
	String getClosingOnlyDate();

	/**
	 * @param closingOnlyDate the closingOnlyDate to set
	 */
	void setClosingOnlyDate(String closingOnlyDate);

	/**
	 * @return the activeMonth
	 */
	boolean isActiveMonth();

	/**
	 * @param activeMonth the activeMonth to set
	 */
	void setActiveMonth(boolean activeMonth);

	/**
	 * @return the nextActiveMonth
	 */
	boolean isNextActiveMonth();

	/**
	 * @param nextActiveMonth the nextActiveMonth to set
	 */
	void setNextActiveMonth(boolean nextActiveMonth);

	/**
	 * @return the firstNoticeDate
	 */
	String getFirstNoticeDate();

	/**
	 * @param firstNoticeDate the firstNoticeDate to set
	 */
	void setFirstNoticeDate(String firstNoticeDate);

	/**
	 * @return the stopsTradingAt
	 */
	String getStopsTradingAt();

	/**
	 * @param stopsTradingAt the stopsTradingAt to set
	 */
	void setStopsTradingAt(String stopsTradingAt);

	/**
	 * @return the expiresAt
	 */
	String getExpiresAt();

	/**
	 * @param expiresAt the expiresAt to set
	 */
	void setExpiresAt(String expiresAt);

	/**
	 * @return the productGroup
	 */
	String getProductGroup();

	/**
	 * @param productGroup the productGroup to set
	 */
	void setProductGroup(String productGroup);

	/**
	 * @return the exchange
	 */
	String getExchange();

	/**
	 * @param exchange the exchange to set
	 */
	void setExchange(String exchange);

	/**
	 * @return the rollTargetSymbol
	 */
	String getRollTargetSymbol();

	/**
	 * @param rollTargetSymbol the rollTargetSymbol to set
	 */
	void setRollTargetSymbol(String rollTargetSymbol);

	/**
	 * @return the streamerExchangeCode
	 */
	String getStreamerExchangeCode();

	/**
	 * @param streamerExchangeCode the streamerExchangeCode to set
	 */
	void setStreamerExchangeCode(String streamerExchangeCode);

	/**
	 * @return the backMonthFirstCalendarSymbol
	 */
	boolean isBackMonthFirstCalendarSymbol();

	/**
	 * @param backMonthFirstCalendarSymbol the backMonthFirstCalendarSymbol to set
	 */
	void setBackMonthFirstCalendarSymbol(boolean backMonthFirstCalendarSymbol);

	/**
	 * @return the isTradeable
	 */
	boolean isTradeable();

	/**
	 * @param isTradeable the isTradeable to set
	 */
	void setTradeable(boolean isTradeable);

	/**
	 * @return the trueUnderlyingSymbol
	 */
	String getTrueUnderlyingSymbol();

	/**
	 * @param trueUnderlyingSymbol the trueUnderlyingSymbol to set
	 */
	void setTrueUnderlyingSymbol(String trueUnderlyingSymbol);

	/**
	 * @return the futureEtfEquivalent
	 */
	List<Object> getFutureEtfEquivalent();

	/**
	 * @param futureEtfEquivalent the futureEtfEquivalent to set
	 */
	void setFutureEtfEquivalent(List<Object> futureEtfEquivalent);

	/**
	 * @return the futureProducts
	 */
	List<FutureProduct> getFutureProducts();

	/**
	 * @param futureProducts the futureProducts to set
	 */
	void setFutureProducts(List<FutureProduct> futureProducts);

	/**
	 * @return the tickSizes
	 */
	List<TickSize> getTickSizes();

	/**
	 * @param tickSizes the tickSizes to set
	 */
	void setTickSizes(List<TickSize> tickSizes);

	/**
	 * @return the optiontickSizes
	 */
	List<TickSize> getOptiontickSizes();

	/**
	 * @param optiontickSizes the optiontickSizes to set
	 */
	void setOptiontickSizes(List<TickSize> optiontickSizes);

	/**
	 * @return the spreadTickSizes
	 */
	List<TickSize> getSpreadTickSizes();

	/**
	 * @param spreadTickSizes the spreadTickSizes to set
	 */
	void setSpreadTickSizes(List<TickSize> spreadTickSizes);

}
