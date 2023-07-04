package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.CustomerImpl;

@JsonTypeInfo(defaultImpl = CustomerImpl.class, use = Id.CLASS)
public interface Customer {

	/**
	 * @return the externalId
	 */
	String getExternalId();

	/**
	 * @param externalId the externalId to set
	 */
	void setExternalId(String externalId);

	/**
	 * @return the prefixName
	 */
	String getPrefixName();

	/**
	 * @param prefixName the prefixName to set
	 */
	void setPrefixName(String prefixName);

	/**
	 * @return the firstName
	 */
	String getFirstName();

	/**
	 * @param firstName the firstName to set
	 */
	void setFirstName(String firstName);

	/**
	 * @return the middleName
	 */
	String getMiddleName();

	/**
	 * @param middleName the middleName to set
	 */
	void setMiddleName(String middleName);

	/**
	 * @return the lastName
	 */
	String getLastName();

	/**
	 * @param lastName the lastName to set
	 */
	void setLastName(String lastName);

	/**
	 * @return the suffixName
	 */
	String getSuffixName();

	/**
	 * @param suffixName the suffixName to set
	 */
	void setSuffixName(String suffixName);

	/**
	 * @return the birthDate
	 */
	String getBirthDate();

	/**
	 * @param birthDate the birthDate to set
	 */
	void setBirthDate(String birthDate);

	/**
	 * @return the birthCountry
	 */
	String getBirthCountry();

	/**
	 * @param birthCountry the birthCountry to set
	 */
	void setBirthCountry(String birthCountry);

	/**
	 * @return the citizenshipCountry
	 */
	String getCitizenshipCountry();

	/**
	 * @param citizenshipCountry the citizenshipCountry to set
	 */
	void setCitizenshipCountry(String citizenshipCountry);

	/**
	 * @return the usaCitizenshipType
	 */
	String getUsaCitizenshipType();

	/**
	 * @param usaCitizenshipType the usaCitizenshipType to set
	 */
	void setUsaCitizenshipType(String usaCitizenshipType);

	/**
	 * @return the visaType
	 */
	String getVisaType();

	/**
	 * @param visaType the visaType to set
	 */
	void setVisaType(String visaType);

	/**
	 * @return the visaExpirationDate
	 */
	String getVisaExpirationDate();

	/**
	 * @param visaExpirationDate the visaExpirationDate to set
	 */
	void setVisaExpirationDate(String visaExpirationDate);

	/**
	 * @return the maritalStatus
	 */
	String getMaritalStatus();

	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	void setMaritalStatus(String maritalStatus);

	/**
	 * @return the numberOfDependents
	 */
	String getNumberOfDependents();

	/**
	 * @param numberOfDependents the numberOfDependents to set
	 */
	void setNumberOfDependents(String numberOfDependents);

	/**
	 * @return the employmentStatus
	 */
	String getEmploymentStatus();

	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	void setEmploymentStatus(String employmentStatus);

	/**
	 * @return the occupation
	 */
	String getOccupation();

	/**
	 * @param occupation the occupation to set
	 */
	void setOccupation(String occupation);

	/**
	 * @return the employerName
	 */
	String getEmployerName();

	/**
	 * @param employerName the employerName to set
	 */
	void setEmployerName(String employerName);

	/**
	 * @return the jobTitle
	 */
	String getJobTitle();

	/**
	 * @param jobTitle the jobTitle to set
	 */
	void setJobTitle(String jobTitle);

	/**
	 * @return the id
	 */
	String getId();

	/**
	 * @param id the id to set
	 */
	void setId(String id);

	/**
	 * @return the firstSurname
	 */
	String getFirstSurname();

	/**
	 * @param firstSurname the firstSurname to set
	 */
	void setFirstSurname(String firstSurname);

	/**
	 * @return the secondSurname
	 */
	String getSecondSurname();

	/**
	 * @param secondSurname the secondSurname to set
	 */
	void setSecondSurname(String secondSurname);

	/**
	 * @return the address
	 */
	Address getAddress();

	/**
	 * @param address the address to set
	 */
	void setAddress(Address address);

	/**
	 * @return the mailingAddress
	 */
	Address getMailingAddress();

	/**
	 * @param mailingAddress the mailingAddress to set
	 */
	void setMailingAddress(Address mailingAddress);

	/**
	 * @return the customerSuitability
	 */
	CustomerSuitability getCustomerSuitability();

	/**
	 * @param customerSuitability the customerSuitability to set
	 */
	void setCustomerSuitability(CustomerSuitability customerSuitability);

	/**
	 * @return the isForeign
	 */
	String getIsForeign();

	/**
	 * @param isForeign the isForeign to set
	 */
	void setIsForeign(String isForeign);

	/**
	 * @return the mobilePhoneNumber
	 */
	String getMobilePhoneNumber();

	/**
	 * @param mobilePhoneNumber the mobilePhoneNumber to set
	 */
	void setMobilePhoneNumber(String mobilePhoneNumber);

	/**
	 * @return the workPhoneNumber
	 */
	String getWorkPhoneNumber();

	/**
	 * @param workPhoneNumber the workPhoneNumber to set
	 */
	void setWorkPhoneNumber(String workPhoneNumber);

	/**
	 * @return the homePhoneNumber
	 */
	String getHomePhoneNumber();

	/**
	 * @param homePhoneNumber the homePhoneNumber to set
	 */
	void setHomePhoneNumber(String homePhoneNumber);

	/**
	 * @return the email
	 */
	String getEmail();

	/**
	 * @param email the email to set
	 */
	void setEmail(String email);

	/**
	 * @return the taxNumberType
	 */
	String getTaxNumberType();

	/**
	 * @param taxNumberType the taxNumberType to set
	 */
	void setTaxNumberType(String taxNumberType);

	/**
	 * @return the taxNumber
	 */
	String getTaxNumber();

	/**
	 * @param taxNumber the taxNumber to set
	 */
	void setTaxNumber(String taxNumber);

	/**
	 * @return the foreiginTaxNumber
	 */
	String getForeiginTaxNumber();

	/**
	 * @param foreiginTaxNumber the foreiginTaxNumber to set
	 */
	void setForeiginTaxNumber(String foreiginTaxNumber);

	/**
	 * @return the subjectToTaxWithholding
	 */
	boolean isSubjectToTaxWithholding();

	/**
	 * @param subjectToTaxWithholding the subjectToTaxWithholding to set
	 */
	void setSubjectToTaxWithholding(boolean subjectToTaxWithholding);

	/**
	 * @return the agreedToMargining
	 */
	boolean isAgreedToMargining();

	/**
	 * @param agreedToMargining the agreedToMargining to set
	 */
	void setAgreedToMargining(boolean agreedToMargining);

	/**
	 * @return the agreedToTerms
	 */
	boolean isAgreedToTerms();

	/**
	 * @param agreedToTerms the agreedToTerms to set
	 */
	void setAgreedToTerms(boolean agreedToTerms);

	/**
	 * @return the signatureOfAgreement
	 */
	boolean isSignatureOfAgreement();

	/**
	 * @param signatureOfAgreement the signatureOfAgreement to set
	 */
	void setSignatureOfAgreement(boolean signatureOfAgreement);

	/**
	 * @return the gender
	 */
	String getGender();

	/**
	 * @param gender the gender to set
	 */
	void setGender(String gender);

	/**
	 * @return the hasIndustryAffiliation
	 */
	boolean isHasIndustryAffiliation();

	/**
	 * @param hasIndustryAffiliation the hasIndustryAffiliation to set
	 */
	void setHasIndustryAffiliation(boolean hasIndustryAffiliation);

	/**
	 * @return the industryAffiliationFirm
	 */
	String getIndustryAffiliationFirm();

	/**
	 * @param industryAffiliationFirm the industryAffiliationFirm to set
	 */
	void setIndustryAffiliationFirm(String industryAffiliationFirm);

	/**
	 * @return the hasPoliticalAffiliation
	 */
	boolean isHasPoliticalAffiliation();

	/**
	 * @param hasPoliticalAffiliation the hasPoliticalAffiliation to set
	 */
	void setHasPoliticalAffiliation(boolean hasPoliticalAffiliation);

	/**
	 * @return the politicalOrganization
	 */
	String getPoliticalOrganization();

	/**
	 * @param politicalOrganization the politicalOrganization to set
	 */
	void setPoliticalOrganization(String politicalOrganization);

	/**
	 * @return the familyMemeberNames
	 */
	String getFamilyMemberNames();

	/**
	 * @param familyMemeberNames the familyMemeberNames to set
	 */
	void setFamilyMemberNames(String familyMemeberNames);

	/**
	 * @return the hasListedAffiliation
	 */
	boolean isHasListedAffiliation();

	/**
	 * @param hasListedAffiliation the hasListedAffiliation to set
	 */
	void setHasListedAffiliation(boolean hasListedAffiliation);

	/**
	 * @return the listedAffiliationSymbol
	 */
	String getListedAffiliationSymbol();

	/**
	 * @param listedAffiliationSymbol the listedAffiliationSymbol to set
	 */
	void setListedAffiliationSymbol(String listedAffiliationSymbol);

	/**
	 * @return the isInvestmentAdviser
	 */
	String getIsInvestmentAdviser();

	/**
	 * @param isInvestmentAdviser the isInvestmentAdviser to set
	 */
	void setIsInvestmentAdviser(String isInvestmentAdviser);

	/**
	 * @return the hasInstitutionalAssets
	 */
	String getHasInstitutionalAssets();

	/**
	 * @param hasInstitutionalAssets the hasInstitutionalAssets to set
	 */
	void setHasInstitutionalAssets(String hasInstitutionalAssets);

	/**
	 * @return the deskCustomerId
	 */
	String getDeskCustomerId();

	/**
	 * @param deskCustomerId the deskCustomerId to set
	 */
	void setDeskCustomerId(String deskCustomerId);

	/**
	 * @return the userId
	 */
	String getUserId();

	/**
	 * @param userId the userId to set
	 */
	void setUserId(String userId);

	/**
	 * @return the isProfessional
	 */
	boolean isProfessional();

	/**
	 * @param isProfessional the isProfessional to set
	 */
	void setProfessional(boolean isProfessional);

	/**
	 * @return the hasDelayedQuotes
	 */
	boolean isHasDelayedQuotes();

	/**
	 * @param hasDelayedQuotes the hasDelayedQuotes to set
	 */
	void setHasDelayedQuotes(boolean hasDelayedQuotes);

	/**
	 * @return the hasPendingOrApprovedApplication
	 */
	String getHasPendingOrApprovedApplication();

	/**
	 * @param hasPendingOrApprovedApplication the hasPendingOrApprovedApplication to
	 *                                        set
	 */
	void setHasPendingOrApprovedApplication(String hasPendingOrApprovedApplication);

	/**
	 * @return the permittedAccountTypes
	 */
	String getPermittedAccountTypes();

	/**
	 * @param permittedAccountTypes the permittedAccountTypes to set
	 */
	void setPermittedAccountTypes(String permittedAccountTypes);

	/**
	 * @return the identifiableType
	 */
	String getIdentifiableType();

	/**
	 * @param identifiableType the identifiableType to set
	 */
	void setIdentifiableType(String identifiableType);

	/**
	 * @return the person
	 */
	Person getPerson();

	/**
	 * @param person the person to set
	 */
	void setPerson(Person person);

	/**
	 * @return the entity
	 */
	Entity getEntity();

	/**
	 * @param entity the entity to set
	 */
	void setEntity(Entity entity);

}
