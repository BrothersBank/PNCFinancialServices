/**
 * Copyright (c) 2016, 2017, CBA and/or its affiliates. All rights reserved.
 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.pncfinancialservices.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pncfinancialservices.beans.AccountTransactions;
import com.pncfinancialservices.util.SQLConstants;

/**
 * This class is as a java bean class which holds the information about AccountType info.
 * @author Afroz
 * @since CBA1.0
 */

@Repository
public class AccountTransactionDAOImpl implements AccountTransactionsDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* (non-Javadoc)
	 * @see com.cbabackendself.dao.AccountTransactionsDAO#getAccountTransactionDetails(java.lang.String)
	 */
	@Override
	public AccountTransactions getAccountTransactionDetails(String accountTransactionId) {
		AccountTransactions accountTransactions=null; 
		int count=0;
		
		accountTransactions=jdbcTemplate.queryForObject(SQLConstants.SQL_SELECT_ACCOUNT_TRANASACTIONS,new RowMapper<AccountTransactions>(){

			@Override
			public AccountTransactions mapRow(ResultSet rs, int row)throws SQLException {
				AccountTransactions accountTransactions =new AccountTransactions();
				accountTransactions.setAccountId(rs.getInt(1));
				accountTransactions.setTransactionType(rs.getString(2));
				accountTransactions.setTransactionDate(rs.getDate(3));
				accountTransactions.setTransactionAmount(rs.getDouble(4));
				accountTransactions.setTransactionStatus(rs.getString(5));
				accountTransactions.setTransactionMode(rs.getString(6));
				accountTransactions.setTransactionDesc(rs.getString(7));
				accountTransactions.setUpdatedBy(rs.getInt(8));
				
				
				return accountTransactions;
			}}, accountTransactionId);
		
		
		//acc
		return accountTransactions;
	}//method

	@Override
	public int updateAccountTransactionDetails(AccountTransactions accountTransactionsFromFile) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveAccountTransactionDetails(AccountTransactions accountTransactionsFromFile) {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
	
	
	
