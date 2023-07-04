package com.tasty.trade.api.rest.client.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractPerson;
import com.tasty.trade.api.rest.client.model.api.Address;
import com.tasty.trade.api.rest.client.model.api.EntityOfficer;

public class EntityOfficerImpl extends AbstractPerson implements EntityOfficer {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("is-foreign")
	private String isForeign;
	
	@JsonProperty("tax-number-type")
	private String taxNumberType;
	
	@JsonProperty("tax-number")
	private String taxNumber;
	
	@JsonProperty("mobile-phone-number")
	private String mobilePhoneNumber;
	
	@JsonProperty("home-phone-number")
	private String homePhoneNumber;
	
	@JsonProperty("work-phone-number")
	private String workPhoneNumber;
	
	@JsonProperty("email")
	private String email;
		
	@JsonProperty("relationship-to-entity")
	private String relationshipToEntity;
	
	@JsonProperty("owner-of-record")
	private boolean ownerOfRecord;
	
	@JsonProperty("address")
	private List<Address> address;

	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		this.id = id;
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
	 * @return the taxNumberType
	 */
	public final String getTaxNumberType() {
		return taxNumberType;
	}

	/**
	 * @param taxNumberType the taxNumberType to set
	 */
	public final void setTaxNumberType(String taxNumberType) {
		this.taxNumberType = taxNumberType;
	}

	/**
	 * @return the taxNumber
	 */
	public final String getTaxNumber() {
		return taxNumber;
	}

	/**
	 * @param taxNumber the taxNumber to set
	 */
	public final void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	/**
	 * @return the mobilePhoneNumber
	 */
	public final String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	/**
	 * @param mobilePhoneNumber the mobilePhoneNumber to set
	 */
	public final void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	/**
	 * @return the homePhoneNumber
	 */
	public final String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	/**
	 * @param homePhoneNumber the homePhoneNumber to set
	 */
	public final void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	/**
	 * @return the workPhoneNumber
	 */
	public final String getWorkPhoneNumber() {
		return workPhoneNumber;
	}

	/**
	 * @param workPhoneNumber the workPhoneNumber to set
	 */
	public final void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}

	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public final void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the relationshipToEntity
	 */
	public final String getRelationshipToEntity() {
		return relationshipToEntity;
	}

	/**
	 * @param relationshipToEntity the relationshipToEntity to set
	 */
	public final void setRelationshipToEntity(String relationshipToEntity) {
		this.relationshipToEntity = relationshipToEntity;
	}

	/**
	 * @return the ownerOfRecord
	 */
	public final boolean isOwnerOfRecord() {
		return ownerOfRecord;
	}

	/**
	 * @param ownerOfRecord the ownerOfRecord to set
	 */
	public final void setOwnerOfRecord(boolean ownerOfRecord) {
		this.ownerOfRecord = ownerOfRecord;
	}

	/**
	 * @return the address
	 */
	public final List<Address> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
}
