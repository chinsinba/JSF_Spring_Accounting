package accounts.app.service.impl;

import accounts.app.dao.BankAccountDAO;
import accounts.app.service.BankAccountService;
import accounts.model.entity.BankAccount;

/**
 * 
 * @author syed
 *
 */
public class BankAccountServiceImpl implements BankAccountService {
	private final BankAccountDAO bankAccountDao;

	BankAccountServiceImpl(BankAccountDAO bankAccountDao)
	{
		this.bankAccountDao =bankAccountDao;
	}

}
