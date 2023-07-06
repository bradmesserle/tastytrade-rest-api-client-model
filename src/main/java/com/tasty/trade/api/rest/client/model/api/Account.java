package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.AccountImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = AccountImpl.class)
public interface Account {

	/**
	 * @return the accountNumber
	 */
	 String getAccountNumber();

	/**
	 * @param accountNumber the accountNumber to set
	 */
	 void setAccountNumber(String accountNumber);

	/**
	 * @return the externalId
	 */
	 String getExternalId();

	/**
	 * @param externalId the externalId to set
	 */
	 void setExternalId(String externalId);

	/**
	 * @return the openedAt
	 */
	 String getOpenedAt();

	/**
	 * @param openedAt the openedAt to set
	 */
	 void setOpenedAt(String openedAt);

	/**
	 * @return the nickname
	 */
	 String getNickname();

	/**
	 * @param nickname the nickname to set
	 */
	 void setNickname(String nickname);

	/**
	 * @return the accountType
	 */
	 String getAccountType();

	/**
	 * @param accountType the accountType to set
	 */
	 void setAccountType(String accountType);

	/**
	 * @return the dayTraderStatus
	 */
	 boolean isDayTraderStatus();

	/**
	 * @param dayTraderStatus the dayTraderStatus to set
	 */
	 void setDayTraderStatus(boolean dayTraderStatus);

	/**
	 * @return the isFirmError
	 */
	 boolean isFirmError();

	/**
	 * @param isFirmError the isFirmError to set
	 */
	 void setFirmError(boolean isFirmError);

	/**
	 * @return the isFirmProprietary
	 */
	 boolean isFirmProprietary();

	/**
	 * @param isFirmProprietary the isFirmProprietary to set
	 */
	 void setFirmProprietary(boolean isFirmProprietary);

	/**
	 * @return the isTestdrive
	 */
	 boolean isTestdrive();	

	/**
	 * @param isTestdrive the isTestdrive to set
	 */
	 void setTestdrive(boolean isTestdrive);

	/**
	 * @return the marginOrCash
	 */
	 String getMarginOrCash();

	/**
	 * @param marginOrCash the marginOrCash to set
	 */
	 void setMarginOrCash(String marginOrCash);

	/**
	 * @return the isForeign
	 */
	 boolean isForeign();

	/**
	 * @param isForeign the isForeign to set
	 */
	 void setForeign(boolean isForeign);

	/**
	 * @return the fundingDate
	 */
	 String getFundingDate();

	/**
	 * @param fundingDate the fundingDate to set
	 */
	 void setFundingDate(String fundingDate);

	
}
