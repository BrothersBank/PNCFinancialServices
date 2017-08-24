/**
 * 
 */
package com.pncfinancialservices.beans;

import java.io.Serializable;

/**
 * @author Admin
 * @since CBA1.0
 */
public class Bank implements Serializable {

	private Integer bankId;
	private String bankName;
	private String bankDesc;
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
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the bankDesc
	 */
	public String getBankDesc() {
		return bankDesc;
	}
	/**
	 * @param bankDesc the bankDesc to set
	 */
	public void setBankDesc(String bankDesc) {
		this.bankDesc = bankDesc;
	}
	
	
}
