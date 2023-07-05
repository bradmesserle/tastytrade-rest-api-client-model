package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.Account;
import com.tasty.trade.api.rest.client.model.api.AccountAuthorityDecorator;

public class AccountAuthorityDecoratorImpl implements AccountAuthorityDecorator {

	@JsonProperty("account")
	private Account account;
	
	@JsonProperty("authority-level")
	private String authorityLevel;

	/**
	 * @return the account
	 */
	public final Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public final void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the authorityLevel
	 */
	public final String getAuthorityLevel() {
		return authorityLevel;
	}

	/**
	 * @param authorityLevel the authorityLevel to set
	 */
	public final void setAuthorityLevel(String authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	
	
	
}
