/**
 * Copyright (c) 2016, 2017, CBA and/or its affiliates. All rights reserved.
 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.pncfinancialservices.dao;

import com.pncfinancialservices.beans.AccountTransactions;

/**
 * This interface gives the info about method of AccountTransactionDAO
 * @author Afroz
 * @since CBA1.0
 */
public interface AccountTransactionsDAO {
	/**
	 * This method is used to get the Account-Transaction Details of Common
	 * Wealth Bank from Data-Base
	 * 
	 * @return {@link AccountTransactions}
	 */
	public AccountTransactions getAccountTransactionDetails(String accountTransactionId);

	public int updateAccountTransactionDetails(AccountTransactions accountTransactionsFromFile);

	public int saveAccountTransactionDetails(AccountTransactions accountTransactionsFromFile);
}
