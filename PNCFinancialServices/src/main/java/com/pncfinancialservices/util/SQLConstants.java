package com.pncfinancialservices.util;

public class SQLConstants {

	public static final String SQL_SAVE_BANK_DETAILS="INSERT INTO BANK(BANK_ID,BANK_NAME,BANK_DESC) VALUES(?,?,?)";
	public static final String SQL_SELECT_ACCOUNT_TRANASACTIONS="SELECT account_Id,transaction_Type,transaction_Date,transaction_Amount,transaction_Status,transaction_Mode,transaction_Desc,updated_By from ACCOUNTTRANSACTIONS WHERE ACCOUNT_TRANSACTION_TYPE_ID=?";
}
