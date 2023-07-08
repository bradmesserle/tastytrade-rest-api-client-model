package com.tasty.trade.api.rest.client.instruments.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.instruments.model.impl.FutureOptionProductImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = FutureOptionProductImpl.class)
public interface FutureOptionProduct {

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

	
}
