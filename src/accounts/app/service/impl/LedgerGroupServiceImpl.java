package accounts.app.service.impl;

import accounts.app.dao.LedgerGroupDAO;
import accounts.app.service.LedgerGroupService;
import accounts.model.entity.LedgerGroup;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
public class LedgerGroupServiceImpl implements LedgerGroupService {
	
	private final LedgerGroupDAO ledgerGroupDAO;
	
	public LedgerGroupServiceImpl(LedgerGroupDAO ledgerGroupDAO)
	{
		this.ledgerGroupDAO = ledgerGroupDAO;
	}
	
}
