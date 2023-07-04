package com.tasty.trade.api.rest.client.model.api;

import java.util.List;

public interface EntityOfficer {

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
	 * @return the isForeign
	 */
	 String getIsForeign();

	/**
	 * @param isForeign the isForeign to set
	 */
	 void setIsForeign(String isForeign);

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
	 * @return the mobilePhoneNumber
	 */
	 String getMobilePhoneNumber();

	/**
	 * @param mobilePhoneNumber the mobilePhoneNumber to set
	 */
	 void setMobilePhoneNumber(String mobilePhoneNumber);

	/**
	 * @return the homePhoneNumber
	 */
	 String getHomePhoneNumber();

	/**
	 * @param homePhoneNumber the homePhoneNumber to set
	 */
	 void setHomePhoneNumber(String homePhoneNumber);

	/**
	 * @return the workPhoneNumber
	 */
	 String getWorkPhoneNumber();

	/**
	 * @param workPhoneNumber the workPhoneNumber to set
	 */
	 void setWorkPhoneNumber(String workPhoneNumber);

	/**
	 * @return the email
	 */
	 String getEmail();

	/**
	 * @param email the email to set
	 */
	 void setEmail(String email);

	/**
	 * @return the relationshipToEntity
	 */
	 String getRelationshipToEntity();

	/**
	 * @param relationshipToEntity the relationshipToEntity to set
	 */
	 void setRelationshipToEntity(String relationshipToEntity);

	/**
	 * @return the ownerOfRecord
	 */
	 boolean isOwnerOfRecord();

	/**
	 * @param ownerOfRecord the ownerOfRecord to set
	 */
	 void setOwnerOfRecord(boolean ownerOfRecord);

	/**
	 * @return the address
	 */
	 List<Address> getAddress() ;

	/**
	 * @param address the address to set
	 */
	 void setAddress(List<Address> address);

	
	
}
