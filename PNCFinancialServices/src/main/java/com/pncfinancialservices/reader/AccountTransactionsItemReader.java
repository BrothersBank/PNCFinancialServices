/**
 *  Copyright (c) 2016, 2017, CBA and/or its affiliates. All rights reserved.
 * CBA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.pncfinancialservices.reader;

import org.springframework.batch.item.ItemReader;

import com.pncfinancialservices.beans.AccountTransactions;
/**
 *This Interface gives the method to implements AccountTransactions Details
 * @author Afroz
 * @since CBA1.0
 *
 */
public interface AccountTransactionsItemReader {

	public ItemReader<AccountTransactions> getAccountTransactionsDetails();
}
