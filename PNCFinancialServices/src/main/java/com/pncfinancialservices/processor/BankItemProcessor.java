package com.pncfinancialservices.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.pncfinancialservices.beans.Bank;

@Service
public class BankItemProcessor implements ItemProcessor<Bank, Bank> {

	@Override
	public Bank process(Bank bank) throws Exception {
		
		//change the bank name to capital
		bank.setBankName(bank.getBankName().toUpperCase());
		return bank;
	}
	
}
