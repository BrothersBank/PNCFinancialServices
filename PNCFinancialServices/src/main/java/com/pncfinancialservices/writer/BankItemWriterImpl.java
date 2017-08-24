/**
 * 
 */
package com.pncfinancialservices.writer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pncfinancialservices.beans.Bank;
import com.pncfinancialservices.util.SQLConstants;

/**
 * @author Admin
 *
 */
@Repository
public class BankItemWriterImpl implements BankItemWriter<Bank> {
	@Autowired
	private DataSource dataSource;
	@Override
		public ItemWriter<Bank> saveBankDetails() {
			
			  JdbcBatchItemWriter<Bank> jdbcItemWriter=new JdbcBatchItemWriter<Bank>();
			  //set property
			  jdbcItemWriter.setDataSource(dataSource);
			  jdbcItemWriter.setSql(SQLConstants.SQL_SAVE_BANK_DETAILS);
			  jdbcItemWriter.setItemPreparedStatementSetter(new ItemPreparedStatementSetter<Bank>(){
				  @Override
				public void setValues(Bank bank, PreparedStatement pst)throws SQLException {
					
					  pst.setInt(1, bank.getBankId());
					  pst.setString(2, bank.getBankName());
					  pst.setString(3, bank.getBankDesc());
					
				}
			  });
			return jdbcItemWriter;
		}
	
	
}
