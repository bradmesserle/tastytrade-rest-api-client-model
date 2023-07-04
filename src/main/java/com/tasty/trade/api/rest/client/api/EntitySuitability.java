package com.tasty.trade.api.rest.client.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.impl.EntitySuitabilityImpl;

@JsonTypeInfo(use =Id.CLASS, defaultImpl = EntitySuitabilityImpl.class)
public interface EntitySuitability {

	
	/**
	 * @return the entityId
	 */
	 Integer getEntityId();

	/**
	 * @param entityId the entityId to set
	 */
	 void setEntityId(Integer entityId);
	
}
