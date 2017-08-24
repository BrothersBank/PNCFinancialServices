/**
 * 
 */
package com.pncfinancialservices.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Repository;

import com.pncfinancialservices.beans.AccountTransactions;

/**
 * This class is AccountTransactionsItemReaderImpl, which implements the method of AccountTransactionsItemReader to read AccountTransactions details
 * @author Afroz
 * @since CBA1.0
 *
 */
@Repository
public class AccountTransactionsItemReaderImpl implements AccountTransactionsItemReader {

	/* (non-Javadoc)
	 * @see com.cbabackendself.reader.AccountTransactionsItemReader#getAccountTransactionsDetails()
	 */
	
	
	@Override
	public ItemReader<AccountTransactions> getAccountTransactionsDetails() {
		FlatFileItemReader<AccountTransactions> accountTransactionsItemReader=new FlatFileItemReader<AccountTransactions>();

		//set the resource
		accountTransactionsItemReader.setResource(new FileSystemResource("D:\\afroz\\cba_flat_files\\AccountTransactions.csv"));
		//set line to escape
		accountTransactionsItemReader.setLinesToSkip(1);
		//set tokenizer
		accountTransactionsItemReader.setLineMapper(createLineMapper());
		return accountTransactionsItemReader;
	}
	
	//read lineMapper
	public LineMapper<AccountTransactions> createLineMapper(){
	
		//create DefaultLineMapper obj
		DefaultLineMapper<AccountTransactions> accountTransactionsLineMapper =new DefaultLineMapper<AccountTransactions>();
		//set FieldSetMapper
		accountTransactionsLineMapper.setFieldSetMapper(createFieldSetMapper());
		//set LineTokenizer
		accountTransactionsLineMapper.setLineTokenizer(createLineTokenizer());
		
		return accountTransactionsLineMapper;
	}
	
	public LineTokenizer createLineTokenizer(){
		DelimitedLineTokenizer accountTransactionsLineTokenizer=new DelimitedLineTokenizer();
		//set tokenizer
		accountTransactionsLineTokenizer.setDelimiter(";");
		accountTransactionsLineTokenizer.setNames(new String[]{"accountTransactionId","accountId","transactionType","transactionDate", "transactionAmount","transactionStatus", "transactionMode","transactionDesc","updatedBy"});
		
		return accountTransactionsLineTokenizer;
	}
	
	public FieldSetMapper createFieldSetMapper(){
		BeanWrapperFieldSetMapper<AccountTransactions> accountTransactionsFieldSetMapper=new BeanWrapperFieldSetMapper<AccountTransactions>();
		accountTransactionsFieldSetMapper.setTargetType(AccountTransactions.class);
		return accountTransactionsFieldSetMapper;
	}

	

}
