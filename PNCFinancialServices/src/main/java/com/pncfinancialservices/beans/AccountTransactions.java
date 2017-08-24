/**
 * Copyright (c) 2016, 2017, CBA and/or its affiliates. All rights reserved.
 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.pncfinancialservices.beans;

import java.io.Serializable;
import java.util.Date;

import com.pncfinancialservices.exception.AccountTransactionNotFoundException;

/**
 * This class is as a java bean class which holds the information about AccountType info.
 * @author Afroz
 * @since CBA1.0
 */
public class AccountTransactions implements Serializable {

	private String accountTransactionId;
	private Integer accountId;
	private String transactionType;
	private Date transactionDate;
	private Double transactionAmount;
	private String transactionStatus;
	private String transactionMode;
	private String transactionDesc;
	private Integer updatedBy;//empid
	
	/**
	 * @return the accountTransactionId
	 */
	public String getAccountTransactionId() {
		return accountTransactionId;
	}
	/**
	 * @param accountTransactionId the accountTransactionId to set
	 */
	public void setAccountTransactionId(String accountTransactionId) {
		this.accountTransactionId = accountTransactionId;
	}
	/**
	 * @return the accountId
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the transactionDate
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	/**
	 * @return the transactionAmount
	 */
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	/**
	 * @return the transactionStatus
	 */
	public String getTransactionStatus() {
		return transactionStatus;
	}
	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	/**
	 * @return the transactionMode
	 */
	public String getTransactionMode() {
		return transactionMode;
	}
	/**
	 * @param transactionMode the transactionMode to set
	 */
	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}
	/**
	 * @return the transactionDesc
	 */
	public String getTransactionDesc() {
		return transactionDesc;
	}
	/**
	 * @param transactionDesc the transactionDesc to set
	 */
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}
	/**
	 * @return the updatedBy
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		if(obj instanceof AccountTransactions){
			
			AccountTransactions accountTransactionsDB=(AccountTransactions)obj;
			if(this.getTransactionAmount().equals(accountTransactionsDB.getTransactionAmount()) && this.getTransactionDate().equals(accountTransactionsDB.getTransactionDate())&& this.getTransactionMode().equals(accountTransactionsDB.getTransactionMode())&&this.getTransactionStatus().equals(accountTransactionsDB.getTransactionStatus())&&this.getTransactionType().equals(accountTransactionsDB.getTransactionType())){
			   flag=true;	
			}
			else
			{
				flag=false;
			}
		}		
		else{
			throw new AccountTransactionNotFoundException();
		}
		return flag;
	}
	
	
}
