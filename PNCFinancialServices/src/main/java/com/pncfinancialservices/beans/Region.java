/**
 * 
 */
package com.pncfinancialservices.beans;

import java.io.Serializable;

/**
 * @author Admin
 *
 */
public class Region implements Serializable {

	private Integer regionId;
	private String regionName;
	private String regionCode;
	private String regionHeadOffice;
	private String regionDesc;
	private String regionAddress;
	private Integer bankId;
	/**
	 * @return the regionId
	 */
	public Integer getRegionId() {
		return regionId;
	}
	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	/**
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * @param regionName the regionName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return regionCode;
	}
	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	/**
	 * @return the regionHeadOffice
	 */
	public String getRegionHeadOffice() {
		return regionHeadOffice;
	}
	/**
	 * @param regionHeadOffice the regionHeadOffice to set
	 */
	public void setRegionHeadOffice(String regionHeadOffice) {
		this.regionHeadOffice = regionHeadOffice;
	}
	/**
	 * @return the regionDesc
	 */
	public String getRegionDesc() {
		return regionDesc;
	}
	/**
	 * @param regionDesc the regionDesc to set
	 */
	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}
	/**
	 * @return the regionAddress
	 */
	public String getRegionAddress() {
		return regionAddress;
	}
	/**
	 * @param regionAddress the regionAddress to set
	 */
	public void setRegionAddress(String regionAddress) {
		this.regionAddress = regionAddress;
	}
	/**
	 * @return the bankId
	 */
	public Integer getBankId() {
		return bankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	
	
	
	
}
