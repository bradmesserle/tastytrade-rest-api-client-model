package com.tasty.trade.api.rest.client.model.impl;

import com.tasty.trade.api.rest.client.model.api.Address;
import com.tasty.trade.api.rest.client.model.api.Customer;
import com.tasty.trade.api.rest.client.model.api.CustomerSuitability;

public class CustomerImpl implements Customer {

	private String id;
	
	private String prefixName;
	
	private String firstName;
	
	private String middleName;
	
	private String suffixName;
	
	private String lastName;
	
	private String firstSurname;
	
	private String secondSurname;
	
	//TODO: Address object
	private Address address;
	
	//TODO: Mailing Address
	private Address mailingAddress;
	
	//TODO: Customer Suitabilty
	private CustomerSuitability customerSuitability;
	
	private String usaCitizenshipType;
	
	private String isForeign;
	
	private String mobilePhoneNumber;
	
	private String workPhoneNumber;
	
	private String homePhoneNumber;
	
	private String email;
	
	private String taxNumberType;
	
	private String taxNumber;
	
	private String foreiginTaxNumber;
	
	private String birthDate;
	
	private String externialId;
	
	private String citizenshipCountry;
	
	private String birthCountry;
	
	private String visaType;
	
	private String visaExpirationDate;
	
	private boolean subjectToTaxWithholding;
	
	private boolean agreedToMargining;
	
	private boolean agreedToTerms;
	
	private boolean signatureOfAgreement;
	
	private String gender;
	
	private boolean hasIndustryAffiliation;
	
	private String industryAffiliationFirm;
	
	private boolean hasPoliticalAffiliation;
	
	private String politicalOrganization;
	
	private String familyMemeberNames;
	
	private boolean hasListedAffiliation;
	
	private String listedAffiliationSymbol;
	
	private String isInvestmentAdviser;
	
	private String hasInstitutionalAssets;
	
	private String deskCustomerId;
	
	private String userId;
	
	private boolean isProfessional;
	
	private boolean hasDelayedQuotes;
	
	private String hasPendingOrApprovedApplication;
	
	private String permittedAccountTypes;
	
	private String identifiableType;
	
	//TODO: Person Object
	private Object person;
	
	//TODO: Entity Object
	private Object entity;
	
	
	
	
	
}
