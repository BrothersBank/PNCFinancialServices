/**
 * Copyright (c) 2016, 2017, CBA and/or its affiliates. All rights reserved.
 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * 
 */
package com.pncfinancialservices.beans;

import java.io.Serializable;

/**
 * This class is as a java bean class which holds the information about AccountType info.
 * @author Afroz
 * @since CBA1.0
 */
public class AccountType implements Serializable {

	private Integer accountTypeId;
	private String accountTypeName;
	private String accountTypeDesc;
	private Double minBalToOpen;
	private Double minBalToMaintain;
	/**
	 * @return the accountTypeId
	 */
	public Integer getAccountTypeId() {
		return accountTypeId;
	}
	/**
	 * @param accountTypeId the accountTypeId to set
	 */
	public void setAccountTypeId(Integer accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	/**
	 * @return the accountTypeName
	 */
	public String getAccountTypeName() {
		return accountTypeName;
	}
	/**
	 * @param accountTypeName the accountTypeName to set
	 */
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}
	/**
	 * @return the accountTypeDesc
	 */
	public String getAccountTypeDesc() {
		return accountTypeDesc;
	}
	/**
	 * @param accountTypeDesc the accountTypeDesc to set
	 */
	public void setAccountTypeDesc(String accountTypeDesc) {
		this.accountTypeDesc = accountTypeDesc;
	}
	/**
	 * @return the minBalToOpen
	 */
	public Double getMinBalToOpen() {
		return minBalToOpen;
	}
	/**
	 * @param minBalToOpen the minBalToOpen to set
	 */
	public void setMinBalToOpen(Double minBalToOpen) {
		this.minBalToOpen = minBalToOpen;
	}
	/**
	 * @return the minBalToMaintain
	 */
	public Double getMinBalToMaintain() {
		return minBalToMaintain;
	}
	/**
	 * @param minBalToMaintain the minBalToMaintain to set
	 */
	public void setMinBalToMaintain(Double minBalToMaintain) {
		this.minBalToMaintain = minBalToMaintain;
	}
	
	
	
	
	
	
}
