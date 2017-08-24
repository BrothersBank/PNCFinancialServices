/**
 * Copyright (c) 2016, 2017, CBA and/or its affiliates. All rights reserved.
 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.pncfinancialservices.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.pncfinancialservices.beans.AccountTransactions;
import com.pncfinancialservices.dao.AccountTransactionsDAO;
import com.pncfinancialservices.exception.AccountTransactionNotFoundException;

/**
 * This is AccountTransactionProcessor class which process AccountTransaction Details
 * @author Afroz
 * @since CBA1.0
 */

@Service
public class AccountTransactionItemProcessor implements ItemProcessor<AccountTransactions, AccountTransactions> {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private AccountTransactionsDAO accountTransactionsDAO;
	
	@Override
	public AccountTransactions process(AccountTransactions accountTransactionsFromFile)
			throws Exception {
		boolean flag=false;
		int count=0;
		AccountTransactions accountTransactionsFromDB;
		try{
		//get transaction details from flatfile and db
		accountTransactionsFromDB= accountTransactionsDAO.getAccountTransactionDetails(accountTransactionsFromFile.getAccountTransactionId());
				
		//match or compare them and update to db
		flag=accountTransactionsFromFile.equals(accountTransactionsFromDB);
		if(flag==false){
			//update code
			count=accountTransactionsDAO.updateAccountTransactionDetails(accountTransactionsFromFile);
		}
	}
	catch(AccountTransactionNotFoundException | EmptyResultDataAccessException e){
		//insert code
		count=accountTransactionsDAO.saveAccountTransactionDetails(accountTransactionsFromFile);
	}
		return accountTransactionsFromFile;
	}

}
