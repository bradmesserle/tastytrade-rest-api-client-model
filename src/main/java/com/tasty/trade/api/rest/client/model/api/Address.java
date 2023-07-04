package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.AddressImpl;

@JsonTypeInfo(defaultImpl = AddressImpl.class, use = Id.CLASS)
public interface Address {
	
	/**
	 * @return the streetOne
	 */
	 String getStreetOne();

	/**
	 * @param streetOne the streetOne to set
	 */
	 void setStreetOne(String streetOne); 

	/**
	 * @return the streetTwo
	 */
	 String getStreetTwo();

	/**
	 * @param streetTwo the streetTwo to set
	 */
	 void setStreetTwo(String streetTwo);

	/**
	 * @return the streetThree
	 */
	 String getStreetThree();

	/**
	 * @param streetThree the streetThree to set
	 */
	 void setStreetThree(String streetThree);

	/**
	 * @return the city
	 */
	 String getCity();

	/**
	 * @param city the city to set
	 */
	 void setCity(String city);

	/**
	 * @return the stateRegion
	 */
	 String getStateRegion(); 

	/**
	 * @param stateRegion the stateRegion to set
	 */
	 void setStateRegion(String stateRegion); 

	/**
	 * @return the postalCode
	 */
	 String getPostalCode(); 

	/**
	 * @param postalCode the postalCode to set
	 */
	 void setPostalCode(String postalCode); 

	/**
	 * @return the country
	 */
	 String getCountry(); 

	/**
	 * @param country the country to set
	 */
	 void setCountry(String country);

	/**
	 * @return the isForeign
	 */
	 String getIsForeign(); 

	/**
	 * @param isForeign the isForeign to set
	 */
	 void setIsForeign(String isForeign); 

	/**
	 * @return the isDomestic
	 */
	 String getIsDomestic(); 

	/**
	 * @param isDomestic the isDomestic to set
	 */
	 void setIsDomestic(String isDomestic); 

}
