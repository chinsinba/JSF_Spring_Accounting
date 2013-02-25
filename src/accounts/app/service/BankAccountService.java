package accounts.app.service;

import java.util.List;

import accounts.model.entity.BankAccount;
import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
public interface BankAccountService  {

	BankAccount create(BankAccount bankAccount);
	List<BankAccount> findAll(CompanyDetails compDetails);
}
