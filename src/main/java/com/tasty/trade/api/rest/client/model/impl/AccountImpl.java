package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.Account;

public class AccountImpl implements Account {


	@JsonProperty("account-number")
	private String accountNumber;
	
	@JsonProperty("external-id")
	private String externalId;
	
	@JsonProperty("opened-at")
	private String openedAt;
	
	@JsonProperty("nickname")
	private String nickname;
	
	@JsonProperty("account-type-name")
	private String accountType;
	
	@JsonProperty("day-trader-status")
	private boolean dayTraderStatus;
	
	@JsonProperty("is-firm-error")
	private boolean isFirmError;
	
	@JsonProperty("is-firm-proprietary")
	private boolean isFirmProprietary;
	
	@JsonProperty("is-test-drive")
	private boolean isTestdrive;
	
	@JsonProperty("margin-or-cash")
	private String marginOrCash;
	
	@JsonProperty("is-foreign")
	private boolean isForeign;
	
	@JsonProperty("funding-date")
	private String fundingDate;

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
	 * @return the externalId
	 */
	public final String getExternalId() {
		return externalId;
	}

	/**
	 * @param externalId the externalId to set
	 */
	public final void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * @return the openedAt
	 */
	public final String getOpenedAt() {
		return openedAt;
	}

	/**
	 * @param openedAt the openedAt to set
	 */
	public final void setOpenedAt(String openedAt) {
		this.openedAt = openedAt;
	}

	/**
	 * @return the nickname
	 */
	public final String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public final void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the accountType
	 */
	public final String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public final void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the dayTraderStatus
	 */
	public final boolean isDayTraderStatus() {
		return dayTraderStatus;
	}

	/**
	 * @param dayTraderStatus the dayTraderStatus to set
	 */
	public final void setDayTraderStatus(boolean dayTraderStatus) {
		this.dayTraderStatus = dayTraderStatus;
	}

	/**
	 * @return the isFirmError
	 */
	public final boolean isFirmError() {
		return isFirmError;
	}

	/**
	 * @param isFirmError the isFirmError to set
	 */
	public final void setFirmError(boolean isFirmError) {
		this.isFirmError = isFirmError;
	}

	/**
	 * @return the isFirmProprietary
	 */
	public final boolean isFirmProprietary() {
		return isFirmProprietary;
	}

	/**
	 * @param isFirmProprietary the isFirmProprietary to set
	 */
	public final void setFirmProprietary(boolean isFirmProprietary) {
		this.isFirmProprietary = isFirmProprietary;
	}

	/**
	 * @return the isTestdrive
	 */
	public final boolean isTestdrive() {
		return isTestdrive;
	}

	/**
	 * @param isTestdrive the isTestdrive to set
	 */
	public final void setTestdrive(boolean isTestdrive) {
		this.isTestdrive = isTestdrive;
	}

	/**
	 * @return the marginOrCash
	 */
	public final String getMarginOrCash() {
		return marginOrCash;
	}

	/**
	 * @param marginOrCash the marginOrCash to set
	 */
	public final void setMarginOrCash(String marginOrCash) {
		this.marginOrCash = marginOrCash;
	}

	/**
	 * @return the isForeign
	 */
	public final boolean isForeign() {
		return isForeign;
	}

	/**
	 * @param isForeign the isForeign to set
	 */
	public final void setForeign(boolean isForeign) {
		this.isForeign = isForeign;
	}

	/**
	 * @return the fundingDate
	 */
	public final String getFundingDate() {
		return fundingDate;
	}

	/**
	 * @param fundingDate the fundingDate to set
	 */
	public final void setFundingDate(String fundingDate) {
		this.fundingDate = fundingDate;
	}

	
	
	
}
	
