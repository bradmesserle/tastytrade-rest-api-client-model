package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.EquityImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = EquityImpl.class)
public interface EquityOption extends Instrument{

	/**
	 * @return the strikePrice
	 */
	 Double getStrikePrice();

	/**
	 * @param strikePrice the strikePrice to set
	 */
	 void setStrikePrice(Double strikePrice);

	/**
	 * @return the underlyingSymbol
	 */
	 String getUnderlyingSymbol();

	/**
	 * @param underlyingSymbol the underlyingSymbol to set
	 */
	 void setUnderlyingSymbol(String underlyingSymbol);

	/**
	 * @return the expirationDate
	 */
	 String getExpirationDate();

	/**
	 * @param expirationDate the expirationDate to set
	 */
	 void setExpirationDate(String expirationDate);

	/**
	 * @return the exerciseStyle
	 */
	 String getExerciseStyle();

	/**
	 * @param exerciseStyle the exerciseStyle to set
	 */
	 void setExerciseStyle(String exerciseStyle);

	/**
	 * @return the sharesPerContract
	 */
	 Integer getSharesPerContract();

	/**
	 * @param sharesPerContract the sharesPerContract to set
	 */
	 void setSharesPerContract(Integer sharesPerContract);

	/**
	 * @return the optionType
	 */
	 String getOptionType();

	/**
	 * @param optionType the optionType to set
	 */
	 void setOptionType(String optionType);

	/**
	 * @return the optionChainType
	 */
	 String getOptionChainType();

	/**
	 * @param optionChainType the optionChainType to set
	 */
	 void setOptionChainType(String optionChainType);

	/**
	 * @return the expirationType
	 */
	 String getExpirationType();

	/**
	 * @param expirationType the expirationType to set
	 */
	 void setExpirationType(String expirationType);

	/**
	 * @return the settlementType
	 */
	 String getSettlementType();

	/**
	 * @param settlementType the settlementType to set
	 */
	 void setSettlementType(String settlementType);

	/**
	 * @return the haltedAt
	 */
	 String getHaltedAt();

	/**
	 * @param haltedAt the haltedAt to set
	 */
	 void setHaltedAt(String haltedAt);

	/**
	 * @return the stopsTradingAt
	 */
	 String getStopsTradingAt();

	/**
	 * @param stopsTradingAt the stopsTradingAt to set
	 */
	 void setStopsTradingAt(String stopsTradingAt);

	/**
	 * @return the marketTimeInstrumentCollection
	 */
	 String getMarketTimeInstrumentCollection();

	/**
	 * @param marketTimeInstrumentCollection the marketTimeInstrumentCollection to
	 *                                       set
	 */
	 void setMarketTimeInstrumentCollection(String marketTimeInstrumentCollection);
	 
	/**
	 * @return the daysToExpiration
	 */
	 Integer getDaysToExpiration();

	/**
	 * @param daysToExpiration the daysToExpiration to set
	 */
	 void setDaysToExpiration(Integer daysToExpiration);

	/**
	 * @return the expiresAt
	 */
	 String getExpiresAt();
	 
	/**
	 * @param expiresAt the expiresAt to set
	 */
	 void setExpiresAt(String expiresAt);

	/**
	 * @return the oldSecurityNumber
	 */
	 String getOldSecurityNumber();

	/**
	 * @param oldSecurityNumber the oldSecurityNumber to set
	 */
	 void setOldSecurityNumber(String oldSecurityNumber);
	
}
