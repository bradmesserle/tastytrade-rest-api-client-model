package com.tasty.trade.api.rest.client.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasty.trade.api.rest.client.abstracts.AbstractSuitability;
import com.tasty.trade.api.rest.client.api.CustomerSuitability;

public class CustomerSuitabilityImpl extends AbstractSuitability implements CustomerSuitability {

	
	@JsonProperty("customer-id")
	private Integer customerId;
	
	@JsonProperty("marital-status")
	private String maritalStatus;
	
	@JsonProperty("number-of-dependents")
	private Integer numberOfDependents;
	
	@JsonProperty("employment-status")
	private String employmentStatus;
	
	@JsonProperty("occupation")
	private String occupation;

	@JsonProperty("employer-name")
	private String employerName;
	
	@JsonProperty("job-title")
	private String jobTitle;
	
	@JsonProperty("tax-bracket")
	private String taxBracket;
	
	
	/**
	 * @return the customerId
	 */
	public final Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public final void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
	public final Integer getNumberOfDependents() {
		return numberOfDependents;
	}

	/**
	 * @param numberOfDependents the numberOfDependents to set
	 */
	public final void setNumberOfDependents(Integer numberOfDependents) {
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

	/**
	 * @return the taxBracket
	 */
	public final String getTaxBracket() {
		return taxBracket;
	}

	/**
	 * @param taxBracket the taxBracket to set
	 */
	public final void setTaxBracket(String taxBracket) {
		this.taxBracket = taxBracket;
	}
	
}
