package accounts.app.service.impl;

import accounts.app.dao.BankAccountDAO;
import accounts.app.dao.BankDetailsDAO;
import accounts.app.service.BankDetailsService;
import accounts.model.entity.BankDetails;
import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
public class BankDetailsServiceImpl implements BankDetailsService{

	private final BankDetailsDAO bankDetailsDao;

	BankDetailsServiceImpl(BankDetailsDAO bankDetailsDao)
	{
		this.bankDetailsDao =bankDetailsDao;
	}
	
}
