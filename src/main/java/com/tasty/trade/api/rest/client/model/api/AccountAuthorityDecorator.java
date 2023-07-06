package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.AccountAuthorityDecoratorImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = AccountAuthorityDecoratorImpl.class)
public interface AccountAuthorityDecorator {

	/**
	 * @return the account
	 */
	 Account getAccount();

	/**
	 * @param account the account to set
	 */
	 void setAccount(Account account);

	/**
	 * @return the authorityLevel
	 */
	 String getAuthorityLevel();

	/**
	 * @param authorityLevel the authorityLevel to set
	 */
	 void setAuthorityLevel(String authorityLevel);
	
	
}
