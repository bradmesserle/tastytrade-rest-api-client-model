package com.tasty.trade.api.rest.client.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.abstracts.AbstractSuitability;
import com.tasty.trade.api.rest.client.api.EntitySuitability;

public class EntitySuitabilityImpl extends AbstractSuitability implements EntitySuitability {

	
	@JsonProperty("entity-id")
	private Integer entityId;
	

	/**
	 * @return the entityId
	 */
	public final Integer getEntityId() {
		return entityId;
	}

	/**
	 * @param entityId the entityId to set
	 */
	public final void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}
	
	
	
	
}
