package com.tasty.trade.api.rest.client.instruments.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.instruments.model.api.Cryptocurrency;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractInstrument;

public class CryptocurrencyImpl extends AbstractInstrument implements Cryptocurrency {

	
	@JsonProperty("id")
	private Integer id;

	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}

}
