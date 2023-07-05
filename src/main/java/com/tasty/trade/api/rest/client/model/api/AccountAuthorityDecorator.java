package com.tasty.trade.api.rest.client.model.api;

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
