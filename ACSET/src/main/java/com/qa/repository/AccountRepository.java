package com.qa.repository;

import java.util.List;
import com.qa.domain.Account;

public interface AccountRepository {
	
	final String SUCCESS = "Operation succeeded";
	final String FAILURE = "Operation failed";

	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(int accountNo);
	String updateAccount(int accountNo, String account);
	
	List<Account> findAccountsByFirstName(String firstName);

}
