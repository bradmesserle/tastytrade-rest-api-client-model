package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.abstracts.AbstractPerson;
import com.tasty.trade.api.rest.client.model.api.Address;
import com.tasty.trade.api.rest.client.model.api.Customer;
import com.tasty.trade.api.rest.client.model.api.CustomerSuitability;
import com.tasty.trade.api.rest.client.model.api.Entity;
import com.tasty.trade.api.rest.client.model.api.Person;

public class CustomerImpl extends AbstractPerson implements Customer {

	@JsonProperty("id")
	private String id;

	@JsonProperty("first-surname")
	private String firstSurname;
	
	@JsonProperty("second-surname")
	private String secondSurname;
	
	@JsonProperty("address")
	private Address address;
	
	@JsonProperty("mailing-address")
	private Address mailingAddress;
	
	@JsonProperty("customer-suitability")
	private CustomerSuitability customerSuitability;
	
	@JsonProperty("is-foreign")
	private String isForeign;

	@JsonProperty("mobile-phone-number")
	private String mobilePhoneNumber;
	
	@JsonProperty("work-phone-number")
	private String workPhoneNumber;
	
	@JsonProperty("home-phone-number")
	private String homePhoneNumber;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("tax-number-type")
	private String taxNumberType;
	
	@JsonProperty("tax-number")
	private String taxNumber;
	
	@JsonProperty("foreigin-tax-number")
	private String foreiginTaxNumber;
	
	@JsonProperty("subject-to-tax-withholding")
	private boolean subjectToTaxWithholding;
	
	@JsonProperty("agreed-to-margining")
	private boolean agreedToMargining;
	
	@JsonProperty("agreed-to-terms")
	private boolean agreedToTerms;
	
	@JsonProperty("signature-of-agreement")
	private boolean signatureOfAgreement;

	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("has-industry-affiliation")
	private boolean hasIndustryAffiliation;
	
	@JsonProperty("industry-affiliation-firm")
	private String industryAffiliationFirm;
	
	@JsonProperty("has-political-affiliation")
	private boolean hasPoliticalAffiliation;
	
	@JsonProperty("political-organization")
	private String politicalOrganization;
	
	@JsonProperty("family-member-names")
	private String familyMemberNames;
	
	@JsonProperty("has-listed-affiliation")
	private boolean hasListedAffiliation;
	
	@JsonProperty("listed-affiliation-symbol")
	private String listedAffiliationSymbol;
	
	@JsonProperty("is-investment-adviser")
	private String isInvestmentAdviser;
	
	@JsonProperty("has-institutional-assets")
	private String hasInstitutionalAssets;
	
	@JsonProperty("desk-customer-id")
	private String deskCustomerId;
	
	@JsonProperty("user-id")
	private String userId;
	
	@JsonProperty("is-professional")
	private boolean isProfessional;
	
	@JsonProperty("has-delayed-quotes")
	private boolean hasDelayedQuotes;
	
	@JsonProperty("has-pending-or-approved-application")
	private String hasPendingOrApprovedApplication;
	
	@JsonProperty("permitted-account-types")
	private String permittedAccountTypes;
	
	@JsonProperty("identifiable-type")
	private String identifiableType;
	
	@JsonProperty("person")
	private Person person;
	
	@JsonProperty("entity")
	private Entity entity;

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
	 * @return the firstSurname
	 */
	public final String getFirstSurname() {
		return firstSurname;
	}

	/**
	 * @param firstSurname the firstSurname to set
	 */
	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	/**
	 * @return the secondSurname
	 */
	public final String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * @param secondSurname the secondSurname to set
	 */
	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
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
	 * @return the mailingAddress
	 */
	public final Address getMailingAddress() {
		return mailingAddress;
	}

	/**
	 * @param mailingAddress the mailingAddress to set
	 */
	public final void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	/**
	 * @return the customerSuitability
	 */
	public final CustomerSuitability getCustomerSuitability() {
		return customerSuitability;
	}

	/**
	 * @param customerSuitability the customerSuitability to set
	 */
	public final void setCustomerSuitability(CustomerSuitability customerSuitability) {
		this.customerSuitability = customerSuitability;
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
	 * @return the foreiginTaxNumber
	 */
	public final String getForeiginTaxNumber() {
		return foreiginTaxNumber;
	}

	/**
	 * @param foreiginTaxNumber the foreiginTaxNumber to set
	 */
	public final void setForeiginTaxNumber(String foreiginTaxNumber) {
		this.foreiginTaxNumber = foreiginTaxNumber;
	}

	/**
	 * @return the subjectToTaxWithholding
	 */
	public final boolean isSubjectToTaxWithholding() {
		return subjectToTaxWithholding;
	}

	/**
	 * @param subjectToTaxWithholding the subjectToTaxWithholding to set
	 */
	public final void setSubjectToTaxWithholding(boolean subjectToTaxWithholding) {
		this.subjectToTaxWithholding = subjectToTaxWithholding;
	}

	/**
	 * @return the agreedToMargining
	 */
	public final boolean isAgreedToMargining() {
		return agreedToMargining;
	}

	/**
	 * @param agreedToMargining the agreedToMargining to set
	 */
	public final void setAgreedToMargining(boolean agreedToMargining) {
		this.agreedToMargining = agreedToMargining;
	}

	/**
	 * @return the agreedToTerms
	 */
	public final boolean isAgreedToTerms() {
		return agreedToTerms;
	}

	/**
	 * @param agreedToTerms the agreedToTerms to set
	 */
	public final void setAgreedToTerms(boolean agreedToTerms) {
		this.agreedToTerms = agreedToTerms;
	}

	/**
	 * @return the signatureOfAgreement
	 */
	public final boolean isSignatureOfAgreement() {
		return signatureOfAgreement;
	}

	/**
	 * @param signatureOfAgreement the signatureOfAgreement to set
	 */
	public final void setSignatureOfAgreement(boolean signatureOfAgreement) {
		this.signatureOfAgreement = signatureOfAgreement;
	}

	/**
	 * @return the gender
	 */
	public final String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public final void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the hasIndustryAffiliation
	 */
	public final boolean isHasIndustryAffiliation() {
		return hasIndustryAffiliation;
	}

	/**
	 * @param hasIndustryAffiliation the hasIndustryAffiliation to set
	 */
	public final void setHasIndustryAffiliation(boolean hasIndustryAffiliation) {
		this.hasIndustryAffiliation = hasIndustryAffiliation;
	}

	/**
	 * @return the industryAffiliationFirm
	 */
	public final String getIndustryAffiliationFirm() {
		return industryAffiliationFirm;
	}

	/**
	 * @param industryAffiliationFirm the industryAffiliationFirm to set
	 */
	public final void setIndustryAffiliationFirm(String industryAffiliationFirm) {
		this.industryAffiliationFirm = industryAffiliationFirm;
	}

	/**
	 * @return the hasPoliticalAffiliation
	 */
	public final boolean isHasPoliticalAffiliation() {
		return hasPoliticalAffiliation;
	}

	/**
	 * @param hasPoliticalAffiliation the hasPoliticalAffiliation to set
	 */
	public final void setHasPoliticalAffiliation(boolean hasPoliticalAffiliation) {
		this.hasPoliticalAffiliation = hasPoliticalAffiliation;
	}

	/**
	 * @return the politicalOrganization
	 */
	public final String getPoliticalOrganization() {
		return politicalOrganization;
	}

	/**
	 * @param politicalOrganization the politicalOrganization to set
	 */
	public final void setPoliticalOrganization(String politicalOrganization) {
		this.politicalOrganization = politicalOrganization;
	}

	/**
	 * @return the familyMemeberNames
	 */
	public final String getFamilyMemberNames() {
		return familyMemberNames;
	}

	/**
	 * @param familyMemeberNames the familyMemeberNames to set
	 */
	public final void setFamilyMemberNames(String familyMemeberNames) {
		this.familyMemberNames = familyMemeberNames;
	}

	/**
	 * @return the hasListedAffiliation
	 */
	public final boolean isHasListedAffiliation() {
		return hasListedAffiliation;
	}

	/**
	 * @param hasListedAffiliation the hasListedAffiliation to set
	 */
	public final void setHasListedAffiliation(boolean hasListedAffiliation) {
		this.hasListedAffiliation = hasListedAffiliation;
	}

	/**
	 * @return the listedAffiliationSymbol
	 */
	public final String getListedAffiliationSymbol() {
		return listedAffiliationSymbol;
	}

	/**
	 * @param listedAffiliationSymbol the listedAffiliationSymbol to set
	 */
	public final void setListedAffiliationSymbol(String listedAffiliationSymbol) {
		this.listedAffiliationSymbol = listedAffiliationSymbol;
	}

	/**
	 * @return the isInvestmentAdviser
	 */
	public final String getIsInvestmentAdviser() {
		return isInvestmentAdviser;
	}

	/**
	 * @param isInvestmentAdviser the isInvestmentAdviser to set
	 */
	public final void setIsInvestmentAdviser(String isInvestmentAdviser) {
		this.isInvestmentAdviser = isInvestmentAdviser;
	}

	/**
	 * @return the hasInstitutionalAssets
	 */
	public final String getHasInstitutionalAssets() {
		return hasInstitutionalAssets;
	}

	/**
	 * @param hasInstitutionalAssets the hasInstitutionalAssets to set
	 */
	public final void setHasInstitutionalAssets(String hasInstitutionalAssets) {
		this.hasInstitutionalAssets = hasInstitutionalAssets;
	}

	/**
	 * @return the deskCustomerId
	 */
	public final String getDeskCustomerId() {
		return deskCustomerId;
	}

	/**
	 * @param deskCustomerId the deskCustomerId to set
	 */
	public final void setDeskCustomerId(String deskCustomerId) {
		this.deskCustomerId = deskCustomerId;
	}

	/**
	 * @return the userId
	 */
	public final String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public final void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the isProfessional
	 */
	public final boolean isProfessional() {
		return isProfessional;
	}

	/**
	 * @param isProfessional the isProfessional to set
	 */
	public final void setProfessional(boolean isProfessional) {
		this.isProfessional = isProfessional;
	}

	/**
	 * @return the hasDelayedQuotes
	 */
	public final boolean isHasDelayedQuotes() {
		return hasDelayedQuotes;
	}

	/**
	 * @param hasDelayedQuotes the hasDelayedQuotes to set
	 */
	public final void setHasDelayedQuotes(boolean hasDelayedQuotes) {
		this.hasDelayedQuotes = hasDelayedQuotes;
	}

	/**
	 * @return the hasPendingOrApprovedApplication
	 */
	public final String getHasPendingOrApprovedApplication() {
		return hasPendingOrApprovedApplication;
	}

	/**
	 * @param hasPendingOrApprovedApplication the hasPendingOrApprovedApplication to set
	 */
	public final void setHasPendingOrApprovedApplication(String hasPendingOrApprovedApplication) {
		this.hasPendingOrApprovedApplication = hasPendingOrApprovedApplication;
	}

	/**
	 * @return the permittedAccountTypes
	 */
	public final String getPermittedAccountTypes() {
		return permittedAccountTypes;
	}

	/**
	 * @param permittedAccountTypes the permittedAccountTypes to set
	 */
	public final void setPermittedAccountTypes(String permittedAccountTypes) {
		this.permittedAccountTypes = permittedAccountTypes;
	}

	/**
	 * @return the identifiableType
	 */
	public final String getIdentifiableType() {
		return identifiableType;
	}

	/**
	 * @param identifiableType the identifiableType to set
	 */
	public final void setIdentifiableType(String identifiableType) {
		this.identifiableType = identifiableType;
	}

	/**
	 * @return the person
	 */
	public final Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public final void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the entity
	 */
	public final Entity getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public final void setEntity(Entity entity) {
		this.entity = entity;
	}
	
	
}
