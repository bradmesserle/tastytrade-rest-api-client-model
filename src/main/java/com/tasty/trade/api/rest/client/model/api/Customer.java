package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.CustomerImpl;

@JsonTypeInfo(defaultImpl = CustomerImpl.class, use = Id.CLASS)
public interface Customer {

	
	
}
