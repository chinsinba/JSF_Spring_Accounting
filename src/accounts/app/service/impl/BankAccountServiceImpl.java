package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.BankAccountDAO;
import accounts.app.service.BankAccountService;
import accounts.model.entity.BankAccount;
import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	private final BankAccountDAO bankAccountDao;

	@Inject
	public BankAccountServiceImpl(BankAccountDAO bankAccountDao)
	{
		this.bankAccountDao =bankAccountDao;
	}

	@Override
	@Transactional
	public BankAccount create(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		return bankAccountDao.create(bankAccount);
	}

	@Override
	public List<BankAccount> findAll(CompanyDetails compDetails) {
		// TODO Auto-generated method stub
		return bankAccountDao.findAll(compDetails);
	}

}
