/**
 * 
 */
package com.pncfinancialservices.writer;

import org.springframework.batch.item.ItemWriter;

/**
 * @author Admin
 *
 */
public interface BankItemWriter<Bank> {

	public ItemWriter<Bank> saveBankDetails();
}
