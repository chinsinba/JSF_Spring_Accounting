package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.LedgerGroupDAO;
import accounts.app.service.LedgerGroupService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerGroup;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
@Service
public class LedgerGroupServiceImpl implements LedgerGroupService {

	private final LedgerGroupDAO ledgerGroupDAO;

	@Inject
	public LedgerGroupServiceImpl(LedgerGroupDAO ledgerGroupDAO)
	{
		this.ledgerGroupDAO = ledgerGroupDAO;
	}

	@Override
	@Transactional
	public LedgerGroup create(LedgerGroup group) {
		return ledgerGroupDAO.create(group);
	}

	@Override
	public List<LedgerGroup> getSubGroups(CompanyDetails company) {
		// TODO Auto-generated method stub
		return ledgerGroupDAO.getAllGroups(company);
	}

	@Override
	public LedgerGroup find(long id) {
		// TODO Auto-generated method stub
		return ledgerGroupDAO.find(id);
	}
}
