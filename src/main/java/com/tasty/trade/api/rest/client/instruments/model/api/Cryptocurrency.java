package com.tasty.trade.api.rest.client.instruments.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.instruments.model.impl.CryptocurrencyImpl;
import com.tasty.trade.api.rest.client.model.api.Instrument;

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
