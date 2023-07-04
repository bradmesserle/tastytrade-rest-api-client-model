package com.tasty.trade.api.rest.client.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.impl.CustomerImpl;

@JsonTypeInfo(defaultImpl = CustomerImpl.class, use = Id.CLASS)
public interface Customer {

	
	
}
