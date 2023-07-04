package com.tasty.trade.api.rest.client.model.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.CustomerSuitabilityImpl;

@JsonTypeInfo(defaultImpl = CustomerSuitabilityImpl.class,use=Id.CLASS)
public interface CustomerSuitability {

	/**
	 * @return the id
	 */
	 String getId();

	/**
	 * @param id the id to set
	 */
	 void setId(String id);

	/**
	 * @return the customerId
	 */
	 Integer getCustomerId();
	/**
	 * @param customerId the customerId to set
	 */
	 void setCustomerId(Integer customerId);

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
	 Integer getNumberOfDependents();

	/**
	 * @param numberOfDependents the numberOfDependents to set
	 */
	 void setNumberOfDependents(Integer numberOfDependents);

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
	 * @return the annualNetIncome
	 */
	 Integer getAnnualNetIncome();

	/**
	 * @param annualNetIncome the annualNetIncome to set
	 */
	 void setAnnualNetIncome(Integer annualNetIncome);

	/**
	 * @return the netWorth
	 */
	 Integer getNetWorth();

	/**
	 * @param netWorth the netWorth to set
	 */
	 void setNetWorth(Integer netWorth);

	/**
	 * @return the liquidNetWorth
	 */
	 Integer getLiquidNetWorth(); 

	/**
	 * @param liquidNetWorth the liquidNetWorth to set
	 */
	 void setLiquidNetWorth(Integer liquidNetWorth);

	/**
	 * @return the stockTradingExperience
	 */
	 String getStockTradingExperience();

	/**
	 * @param stockTradingExperience the stockTradingExperience to set
	 */
	 void setStockTradingExperience(String stockTradingExperience);

	/**
	 * @return the coveredOptionsTradingExperience
	 */
	 String getCoveredOptionsTradingExperience(); 

	/**
	 * @param coveredOptionsTradingExperience the coveredOptionsTradingExperience to set
	 */
	 void setCoveredOptionsTradingExperience(String coveredOptionsTradingExperience);

	/**
	 * @return the uncoveredOptionsTradingExperience
	 */
	 String getUncoveredOptionsTradingExperience(); 

	/**
	 * @param uncoveredOptionsTradingExperience the uncoveredOptionsTradingExperience to set
	 */
	 void setUncoveredOptionsTradingExperience(String uncoveredOptionsTradingExperience);

	/**
	 * @return the futuresTradingExperience
	 */
	 String getFuturesTradingExperience();

	/**
	 * @param futuresTradingExperience the futuresTradingExperience to set
	 */
	 void setFuturesTradingExperience(String futuresTradingExperience); 

	/**
	 * @return the taxBracket
	 */
	 String getTaxBracket();

	/**
	 * @param taxBracket the taxBracket to set
	 */
	 void setTaxBracket(String taxBracket);

}
