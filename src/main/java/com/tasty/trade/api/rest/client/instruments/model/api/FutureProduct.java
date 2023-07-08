package com.tasty.trade.api.rest.client.instruments.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.instruments.model.impl.FutureProductImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = FutureProductImpl.class)
public interface FutureProduct {

	/**
	 * @return the rootSymbol
	 */
	String getRootSymbol();

	/**
	 * @param rootSymbol the rootSymbol to set
	 */
	void setRootSymbol(String rootSymbol);

	/**
	 * @return the cashSettled
	 */
	boolean isCashSettled();

	/**
	 * @param cashSettled the cashSettled to set
	 */
	void setCashSettled(boolean cashSettled);

	/**
	 * @return the code
	 */
	String getCode();

	/**
	 * @param code the code to set
	 */
	void setCode(String code);

	/**
	 * @return the displayFactor
	 */
	Double getDisplayFactor();

	/**
	 * @param displayFactor the displayFactor to set
	 */
	void setDisplayFactor(Double displayFactor);

	/**
	 * @return the exchange
	 */
	String getExchange();

	/**
	 * @param exchange the exchange to set
	 */
	void setExchange(String exchange);

	/**
	 * @return the productType
	 */
	String getProductType();

	/**
	 * @param productType the productType to set
	 */
	void setProductType(String productType);

	/**
	 * @return the expirationType
	 */
	String getExpirationType();

	/**
	 * @param expirationType the expirationType to set
	 */
	void setExpirationType(String expirationType);

	/**
	 * @return the settlementDelayDays
	 */
	Integer getSettlementDelayDays();

	/**
	 * @param settlementDelayDays the settlementDelayDays to set
	 */
	void setSettlementDelayDays(Integer settlementDelayDays);

	/**
	 * @return the productSubtype
	 */
	String getProductSubtype();

	/**
	 * @param productSubtype the productSubtype to set
	 */
	void setProductSubtype(String productSubtype);

	/**
	 * @return the marketSector
	 */
	String getMarketSector();

	/**
	 * @param marketSector the marketSector to set
	 */
	void setMarketSector(String marketSector);

	/**
	 * @return the listedMonths
	 */
	String getListedMonths();

	/**
	 * @param listedMonths the listedMonths to set
	 */
	void setListedMonths(String listedMonths);

	/**
	 * @return the activeMonths
	 */
	String getActiveMonths();

	/**
	 * @param activeMonths the activeMonths to set
	 */
	void setActiveMonths(String activeMonths);

	/**
	 * @return the notionalMultiplier
	 */
	Double getNotionalMultiplier();

	/**
	 * @param notionalMultiplier the notionalMultiplier to set
	 */
	void setNotionalMultiplier(Double notionalMultiplier);

	/**
	 * @return the tickSize
	 */
	Double getTickSize();

	/**
	 * @param tickSize the tickSize to set
	 */
	void setTickSize(Double tickSize);

	/**
	 * @return the baseTick
	 */
	Integer getBaseTick();

	/**
	 * @param baseTick the baseTick to set
	 */
	void setBaseTick(Integer baseTick);

	/**
	 * @return the subTick
	 */
	Integer getSubTick();

	/**
	 * @param subTick the subTick to set
	 */
	void setSubTick(Integer subTick);

	/**
	 * @return the streamerExchangeCode
	 */
	String getStreamerExchangeCode();

	/**
	 * @param streamerExchangeCode the streamerExchangeCode to set
	 */
	void setStreamerExchangeCode(String streamerExchangeCode);

	/**
	 * @return the smallNotional
	 */
	boolean isSmallNotional();

	/**
	 * @param smallNotional the smallNotional to set
	 */
	void setSmallNotional(boolean smallNotional);

	/**
	 * @return the backMonthFirstCalendarSymbol
	 */
	boolean isBackMonthFirstCalendarSymbol();

	/**
	 * @param backMonthFirstCalendarSymbol the backMonthFirstCalendarSymbol to set
	 */
	void setBackMonthFirstCalendarSymbol(boolean backMonthFirstCalendarSymbol);

	/**
	 * @return the firstNotice
	 */
	boolean isFirstNotice();

	/**
	 * @param firstNotice the firstNotice to set
	 */
	void setFirstNotice(boolean firstNotice);

	/**
	 * @return the contractLimit
	 */
	Integer getContractLimit();

	/**
	 * @param contractLimit the contractLimit to set
	 */
	void setContractLimit(Integer contractLimit);

	/**
	 * @return the securityGroup
	 */
	String getSecurityGroup();

	/**
	 * @param securityGroup the securityGroup to set
	 */
	void setSecurityGroup(String securityGroup);

	/**
	 * @return the trueUnderlyingCode
	 */
	String getTrueUnderlyingCode();

	/**
	 * @param trueUnderlyingCode the trueUnderlyingCode to set
	 */
	void setTrueUnderlyingCode(String trueUnderlyingCode);

}
