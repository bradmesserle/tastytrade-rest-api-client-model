package com.tasty.trade.api.rest.client.model.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.model.api.Person;

public class PersonImpl implements Person{

	@JsonProperty("external-id")
	private String externalId;
	
	@JsonProperty("prefix-name")
	private String prefixName;
	
	@JsonProperty("first-name")
	private String firstName;
	
	@JsonProperty("middle-name")
	private String middleName;
	
	@JsonProperty("last-name")
	private String lastName;
	
	@JsonProperty("suffix-name")
	private String suffixName;
	
	//TODO: convert to date?
	@JsonProperty("birth-date")
	private String birthDate;
	
	@JsonProperty("birth-country")
	private String birthCountry;
	
	@JsonProperty("citizenship-country")
	private String citizenshipCountry;
	
	@JsonProperty("usa-citizenship-type")
	private String usaCitizenshipType;
	
	@JsonProperty("visa-type")
	private String visaType;
	
	//TODO: covert to date?
	@JsonProperty("visa-expiration-date")
	private String visaExpirationDate;
	
	@JsonProperty("marital-status")
	private String maritalStatus;
	
	@JsonProperty("number-of-dependents")
	private String numberOfDependents;
	
	@JsonProperty("employment-status")
	private String employmentStatus;
	
	@JsonProperty("occupation")
	private String occupation;
	
	@JsonProperty("employer-name")
	private String employerName;
	
	@JsonProperty("job-title")
	private String jobTitle;

	/**
	 * @return the externalId
	 */
	public final String getExternalId() {
		return externalId;
	}

	/**
	 * @param externalId the externalId to set
	 */
	public final void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	/**
	 * @return the prefixName
	 */
	public final String getPrefixName() {
		return prefixName;
	}

	/**
	 * @param prefixName the prefixName to set
	 */
	public final void setPrefixName(String prefixName) {
		this.prefixName = prefixName;
	}

	/**
	 * @return the firstName
	 */
	public final String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public final String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public final String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the suffixName
	 */
	public final String getSuffixName() {
		return suffixName;
	}

	/**
	 * @param suffixName the suffixName to set
	 */
	public final void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}

	/**
	 * @return the birthDate
	 */
	public final String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public final void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the birthCountry
	 */
	public final String getBirthCountry() {
		return birthCountry;
	}

	/**
	 * @param birthCountry the birthCountry to set
	 */
	public final void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}

	/**
	 * @return the citizenshipCountry
	 */
	public final String getCitizenshipCountry() {
		return citizenshipCountry;
	}

	/**
	 * @param citizenshipCountry the citizenshipCountry to set
	 */
	public final void setCitizenshipCountry(String citizenshipCountry) {
		this.citizenshipCountry = citizenshipCountry;
	}

	/**
	 * @return the usaCitizenshipType
	 */
	public final String getUsaCitizenshipType() {
		return usaCitizenshipType;
	}

	/**
	 * @param usaCitizenshipType the usaCitizenshipType to set
	 */
	public final void setUsaCitizenshipType(String usaCitizenshipType) {
		this.usaCitizenshipType = usaCitizenshipType;
	}

	/**
	 * @return the visaType
	 */
	public final String getVisaType() {
		return visaType;
	}

	/**
	 * @param visaType the visaType to set
	 */
	public final void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	/**
	 * @return the visaExpirationDate
	 */
	public final String getVisaExpirationDate() {
		return visaExpirationDate;
	}

	/**
	 * @param visaExpirationDate the visaExpirationDate to set
	 */
	public final void setVisaExpirationDate(String visaExpirationDate) {
		this.visaExpirationDate = visaExpirationDate;
	}

	/**
	 * @return the maritalStatus
	 */
	public final String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public final void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @return the numberOfDependents
	 */
	public final String getNumberOfDependents() {
		return numberOfDependents;
	}

	/**
	 * @param numberOfDependents the numberOfDependents to set
	 */
	public final void setNumberOfDependents(String numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	/**
	 * @return the employmentStatus
	 */
	public final String getEmploymentStatus() {
		return employmentStatus;
	}

	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	public final void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	/**
	 * @return the occupation
	 */
	public final String getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public final void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * @return the employerName
	 */
	public final String getEmployerName() {
		return employerName;
	}

	/**
	 * @param employerName the employerName to set
	 */
	public final void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	/**
	 * @return the jobTitle
	 */
	public final String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public final void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	
}
