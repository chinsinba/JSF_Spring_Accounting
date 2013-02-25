package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.LedgerAccountDAO;
import accounts.app.service.LedgerAccountService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
@Service
public class LedgerAccountServiceImpl implements LedgerAccountService{
	
	private final LedgerAccountDAO ledgerAccountDao;
	
	@Inject
	public LedgerAccountServiceImpl(LedgerAccountDAO ledgerAccountDao){
		this.ledgerAccountDao = ledgerAccountDao;
	}

	@Override
	@Transactional
	public LedgerAccount create(LedgerAccount ledAcc) {
		// TODO Auto-generated method stub
		return ledgerAccountDao.create(ledAcc);
	}

	@Override
	public List<LedgerAccount> findAll(CompanyDetails company) {
		// TODO Auto-generated method stub
		return ledgerAccountDao.findAll(company);
	}

	@Override
	public LedgerAccount find(long id) {
		// TODO Auto-generated method stub
		return ledgerAccountDao.find(id);
	}
}
