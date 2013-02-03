package accounts.app.service.impl;

import accounts.app.dao.LedgerAccountDAO;
import accounts.app.service.LedgerAccountService;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
public class LedgerAccountServiceImpl implements LedgerAccountService{
	
	private final LedgerAccountDAO ledgerAccountDao;
	
	public LedgerAccountServiceImpl(LedgerAccountDAO ledgerAccountDao){
		this.ledgerAccountDao = ledgerAccountDao;
	}
}
