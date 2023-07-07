package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.CryptocurrencyImpl;

@JsonTypeInfo(use = Id.CLASS, defaultImpl = CryptocurrencyImpl.class)
public interface Cryptocurrency extends Instrument {

	/**
	 * @return the id
	 */
	 Integer getId();

	/**
	 * @param id the id to set
	 */
	 void setId(Integer id);
	
}
