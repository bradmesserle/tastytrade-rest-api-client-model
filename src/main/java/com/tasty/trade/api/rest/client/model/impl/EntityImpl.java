package com.tasty.trade.api.rest.client.model.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.Address;
import com.tasty.trade.api.rest.client.model.api.Entity;
import com.tasty.trade.api.rest.client.model.api.EntityOfficer;
import com.tasty.trade.api.rest.client.model.api.EntitySuitability;

public class EntityImpl implements Entity {

	@JsonProperty("id")
	private String id;

	@JsonProperty("legal-name")
	private String legalName;
	
	@JsonProperty("tax-number")
	private String taxNumber;
	
	@JsonProperty("is-domestic")
	private String isDomestic;
	
	@JsonProperty("entity-type")
	private String entityType;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("phone-number")
	private String phoneNumber;
	
	@JsonProperty("business-nature")
	private String businessNature;
	
	@JsonProperty("has-foreign-institution-affiliation")
	private String hasForeignInstitutionAffiliation;
	
	@JsonProperty("foreign-institution")
	private String foreignInstitution;
	
	@JsonProperty("has-foreign-bank-affiliation")
	private String hasForeignBankAffiliation;
	
	@JsonProperty("grantor-first-name")
	private String grantorFirstName;
	
	@JsonProperty("grantor-middle-name")
	private String grantorMiddleName;
	
	@JsonProperty("grantor-last-name")
	private String grantorLastName;
	
	@JsonProperty("grantor-email")
	private String grantorEmail;
	
	@JsonProperty("grantor-birth-date")
	private String grantorBirthDate;
	
	@JsonProperty("grantor-tax-number")
	private String grantorTaxNumber;
	
	@JsonProperty("address")
	private Address address;
	
	@JsonProperty("entity-suitability")
	private EntitySuitability entitySuitability;
	
	@JsonProperty("entity-officers")
	private List<EntityOfficer> entityOfficers;

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
	 * @return the legalName
	 */
	public final String getLegalName() {
		return legalName;
	}

	/**
	 * @param legalName the legalName to set
	 */
	public final void setLegalName(String legalName) {
		this.legalName = legalName;
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

	/**
	 * @return the entityType
	 */
	public final String getEntityType() {
		return entityType;
	}

	/**
	 * @param entityType the entityType to set
	 */
	public final void setEntityType(String entityType) {
		this.entityType = entityType;
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
	 * @return the phoneNumber
	 */
	public final String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public final void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the businessNature
	 */
	public final String getBusinessNature() {
		return businessNature;
	}

	/**
	 * @param businessNature the businessNature to set
	 */
	public final void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	/**
	 * @return the hasForeignInstitutionAffiliation
	 */
	public final String getHasForeignInstitutionAffiliation() {
		return hasForeignInstitutionAffiliation;
	}

	/**
	 * @param hasForeignInstitutionAffiliation the hasForeignInstitutionAffiliation to set
	 */
	public final void setHasForeignInstitutionAffiliation(String hasForeignInstitutionAffiliation) {
		this.hasForeignInstitutionAffiliation = hasForeignInstitutionAffiliation;
	}

	/**
	 * @return the foreignInstitution
	 */
	public final String getForeignInstitution() {
		return foreignInstitution;
	}

	/**
	 * @param foreignInstitution the foreignInstitution to set
	 */
	public final void setForeignInstitution(String foreignInstitution) {
		this.foreignInstitution = foreignInstitution;
	}

	/**
	 * @return the hasForeignBankAffiliation
	 */
	public final String getHasForeignBankAffiliation() {
		return hasForeignBankAffiliation;
	}

	/**
	 * @param hasForeignBankAffiliation the hasForeignBankAffiliation to set
	 */
	public final void setHasForeignBankAffiliation(String hasForeignBankAffiliation) {
		this.hasForeignBankAffiliation = hasForeignBankAffiliation;
	}

	/**
	 * @return the grantorFirstName
	 */
	public final String getGrantorFirstName() {
		return grantorFirstName;
	}

	/**
	 * @param grantorFirstName the grantorFirstName to set
	 */
	public final void setGrantorFirstName(String grantorFirstName) {
		this.grantorFirstName = grantorFirstName;
	}

	/**
	 * @return the grantorMiddleName
	 */
	public final String getGrantorMiddleName() {
		return grantorMiddleName;
	}

	/**
	 * @param grantorMiddleName the grantorMiddleName to set
	 */
	public final void setGrantorMiddleName(String grantorMiddleName) {
		this.grantorMiddleName = grantorMiddleName;
	}

	/**
	 * @return the grantorLastName
	 */
	public final String getGrantorLastName() {
		return grantorLastName;
	}

	/**
	 * @param grantorLastName the grantorLastName to set
	 */
	public final void setGrantorLastName(String grantorLastName) {
		this.grantorLastName = grantorLastName;
	}

	/**
	 * @return the grantorEmail
	 */
	public final String getGrantorEmail() {
		return grantorEmail;
	}

	/**
	 * @param grantorEmail the grantorEmail to set
	 */
	public final void setGrantorEmail(String grantorEmail) {
		this.grantorEmail = grantorEmail;
	}

	/**
	 * @return the grantorBirthDate
	 */
	public final String getGrantorBirthDate() {
		return grantorBirthDate;
	}

	/**
	 * @param grantorBirthDate the grantorBirthDate to set
	 */
	public final void setGrantorBirthDate(String grantorBirthDate) {
		this.grantorBirthDate = grantorBirthDate;
	}

	/**
	 * @return the grantorTaxNumber
	 */
	public final String getGrantorTaxNumber() {
		return grantorTaxNumber;
	}

	/**
	 * @param grantorTaxNumber the grantorTaxNumber to set
	 */
	public final void setGrantorTaxNumber(String grantorTaxNumber) {
		this.grantorTaxNumber = grantorTaxNumber;
	}

	/**
	 * @return the address
	 */
	public final Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the entitySuitability
	 */
	public final EntitySuitability getEntitySuitability() {
		return entitySuitability;
	}

	/**
	 * @param entitySuitability the entitySuitability to set
	 */
	public final void setEntitySuitability(EntitySuitability entitySuitability) {
		this.entitySuitability = entitySuitability;
	}

	/**
	 * @return the entityOfficers
	 */
	public final List<EntityOfficer> getEntityOfficers() {
		return entityOfficers;
	}

	/**
	 * @param entityOfficers the entityOfficers to set
	 */
	public final void setEntityOfficers(List<EntityOfficer> entityOfficers) {
		this.entityOfficers = entityOfficers;
	}
	
	
}
