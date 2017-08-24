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

import com.pncfinancialservices.beans.Bank;

/**
 * This class is BankItemReaderImpl, which implements the method of BankItemReader to read bank details
 * @author Afroz
 * @since CBA1.0
 *
 */
@Repository
public class BankItemReaderImpl implements BankItemReader {

	/* (non-Javadoc)
	 * @see com.cbabackendself.reader.BankItemReader#getBankDetails()
	 */
	@Override
	public ItemReader<Bank> getBankDetails() {
		FlatFileItemReader<Bank> bankItemReader=new FlatFileItemReader<Bank>();

		//set the resource
		bankItemReader.setResource(new FileSystemResource("D:\\afroz\\cba_flat_files\\Bank.csv"));
		//set line to escape
		bankItemReader.setLinesToSkip(1);
		//set tokenizer
		bankItemReader.setLineMapper(createLineMapper());
		return bankItemReader;
	}
	
	//read lineMapper
	public LineMapper<Bank> createLineMapper(){
	
		//create DefaultLineMapper obj
		DefaultLineMapper<Bank> bankLineMapper =new DefaultLineMapper<Bank>();
		//set FieldSetMapper
		bankLineMapper.setFieldSetMapper(createFieldSetMapper());
		//set LineTokenizer
		bankLineMapper.setLineTokenizer(createLineTokenizer());
		
		return bankLineMapper;
	}
	
	public LineTokenizer createLineTokenizer(){
		DelimitedLineTokenizer bankLineTokenizer=new DelimitedLineTokenizer();
		//set tokenizer
		bankLineTokenizer.setDelimiter(";");
		bankLineTokenizer.setNames(new String[]{"bankId","bankName","bankDesc"});
		
		return bankLineTokenizer;
	}
	
	public FieldSetMapper createFieldSetMapper(){
		BeanWrapperFieldSetMapper<Bank> bankFieldSetMapper=new BeanWrapperFieldSetMapper<Bank>();
		bankFieldSetMapper.setTargetType(Bank.class);
		return bankFieldSetMapper;
	}

}
