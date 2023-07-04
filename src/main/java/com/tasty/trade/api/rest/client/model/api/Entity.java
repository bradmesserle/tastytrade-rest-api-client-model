package com.tasty.trade.api.rest.client.model.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.tasty.trade.api.rest.client.model.impl.EntityImpl;

@JsonTypeInfo(defaultImpl = EntityImpl.class,use=Id.CLASS)
public interface Entity {

	
	/**
	 * @return the id
	 */
	 String getId();

	/**
	 * @param id the id to set
	 */
	 void setId(String id);

	/**
	 * @return the legalName
	 */
	 String getLegalName();

	/**
	 * @param legalName the legalName to set
	 */
	 void setLegalName(String legalName);

	/**
	 * @return the taxNumber
	 */
	 String getTaxNumber();

	/**
	 * @param taxNumber the taxNumber to set
	 */
	 void setTaxNumber(String taxNumber);

	/**
	 * @return the isDomestic
	 */
	 String getIsDomestic();

	/**
	 * @param isDomestic the isDomestic to set
	 */
	 void setIsDomestic(String isDomestic);

	/**
	 * @return the entityType
	 */
	 String getEntityType();

	/**
	 * @param entityType the entityType to set
	 */
	 void setEntityType(String entityType);

	/**
	 * @return the email
	 */
	 String getEmail();

	/**
	 * @param email the email to set
	 */
	 void setEmail(String email);

	/**
	 * @return the phoneNumber
	 */
	 String getPhoneNumber();

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	 void setPhoneNumber(String phoneNumber);

	/**
	 * @return the businessNature
	 */
	 String getBusinessNature();

	/**
	 * @param businessNature the businessNature to set
	 */
	 void setBusinessNature(String businessNature);

	/**
	 * @return the hasForeignInstitutionAffiliation
	 */
	 String getHasForeignInstitutionAffiliation();

	/**
	 * @param hasForeignInstitutionAffiliation the hasForeignInstitutionAffiliation to set
	 */
	 void setHasForeignInstitutionAffiliation(String hasForeignInstitutionAffiliation);

	/**
	 * @return the foreignInstitution
	 */
	 String getForeignInstitution();

	/**
	 * @param foreignInstitution the foreignInstitution to set
	 */
	 void setForeignInstitution(String foreignInstitution);

	/**
	 * @return the hasForeignBankAffiliation
	 */
	 String getHasForeignBankAffiliation();

	/**
	 * @param hasForeignBankAffiliation the hasForeignBankAffiliation to set
	 */
	 void setHasForeignBankAffiliation(String hasForeignBankAffiliation);

	/**
	 * @return the grantorFirstName
	 */
	 String getGrantorFirstName();

	/**
	 * @param grantorFirstName the grantorFirstName to set
	 */
	 void setGrantorFirstName(String grantorFirstName);

	/**
	 * @return the grantorMiddleName
	 */
	 String getGrantorMiddleName();

	/**
	 * @param grantorMiddleName the grantorMiddleName to set
	 */
	 void setGrantorMiddleName(String grantorMiddleName);

	/**
	 * @return the grantorLastName
	 */
	 String getGrantorLastName();

	/**
	 * @param grantorLastName the grantorLastName to set
	 */
	 void setGrantorLastName(String grantorLastName);

	/**
	 * @return the grantorEmail
	 */
	 String getGrantorEmail();

	/**
	 * @param grantorEmail the grantorEmail to set
	 */
	 void setGrantorEmail(String grantorEmail);

	/**
	 * @return the grantorBirthDate
	 */
	 String getGrantorBirthDate();

	/**
	 * @param grantorBirthDate the grantorBirthDate to set
	 */
	 void setGrantorBirthDate(String grantorBirthDate);

	/**
	 * @return the grantorTaxNumber
	 */
	 String getGrantorTaxNumber();

	/**
	 * @param grantorTaxNumber the grantorTaxNumber to set
	 */
	 void setGrantorTaxNumber(String grantorTaxNumber);

	/**
	 * @return the address
	 */
	 Address getAddress();

	/**
	 * @param address the address to set
	 */
	 void setAddress(Address address);

	/**
	 * @return the entitySuitability
	 */
	 EntitySuitability getEntitySuitability();

	/**
	 * @param entitySuitability the entitySuitability to set
	 */
	 void setEntitySuitability(EntitySuitability entitySuitability);

	/**
	 * @return the entityOfficers
	 */
	 List<EntityOfficer> getEntityOfficers();

	/**
	 * @param entityOfficers the entityOfficers to set
	 */
	 void setEntityOfficers(List<EntityOfficer> entityOfficers);
	
	
}
