package com.tasty.trade.api.rest.client.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.api.Address;

public class AddressImpl implements Address {

	@JsonProperty("street-one")
	private String streetOne;
	
	@JsonProperty("street-two")
	private String streetTwo;
	
	@JsonProperty("street-three")
	private String streetThree;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("state-region")
	private String stateRegion;
	
	@JsonProperty("postal-code")
	private String postalCode;
	
	@JsonProperty("country")
	private String country;
	
	@JsonProperty("is-foreign")
	private String isForeign;
	
	@JsonProperty("is-domestic")
	private String isDomestic;

	
	/**
	 * @return the streetOne
	 */
	public final String getStreetOne() {
		return streetOne;
	}

	/**
	 * @param streetOne the streetOne to set
	 */
	public final void setStreetOne(String streetOne) {
		this.streetOne = streetOne;
	}

	/**
	 * @return the streetTwo
	 */
	public final String getStreetTwo() {
		return streetTwo;
	}

	/**
	 * @param streetTwo the streetTwo to set
	 */
	public final void setStreetTwo(String streetTwo) {
		this.streetTwo = streetTwo;
	}

	/**
	 * @return the streetThree
	 */
	public final String getStreetThree() {
		return streetThree;
	}

	/**
	 * @param streetThree the streetThree to set
	 */
	public final void setStreetThree(String streetThree) {
		this.streetThree = streetThree;
	}

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the stateRegion
	 */
	public final String getStateRegion() {
		return stateRegion;
	}

	/**
	 * @param stateRegion the stateRegion to set
	 */
	public final void setStateRegion(String stateRegion) {
		this.stateRegion = stateRegion;
	}

	/**
	 * @return the postalCode
	 */
	public final String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public final void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the country
	 */
	public final String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public final void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the isForeign
	 */
	public final String getIsForeign() {
		return isForeign;
	}

	/**
	 * @param isForeign the isForeign to set
	 */
	public final void setIsForeign(String isForeign) {
		this.isForeign = isForeign;
	}

	/**
	 * @return the isDomestic
	 */
	public final String getIsDomestic() {
		return isDomestic;
	}

	/**
	 * @param isDomestic the isDomestic to set
	 */
	public final void setIsDomestic(String isDomestic) {
		this.isDomestic = isDomestic;
	}

}
