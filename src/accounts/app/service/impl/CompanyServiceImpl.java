package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.CompanyDAO;
import accounts.app.dao.StakeHolderDAO;
import accounts.app.service.CompanyService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.StakeHolder;

/**
 * 
 * @author syed
 *
 */
@Service
public class CompanyServiceImpl implements CompanyService {
	private final CompanyDAO companyDao;
	private final StakeHolderDAO stakeHolderDAO;

	@Inject
	public CompanyServiceImpl(CompanyDAO companyDao, StakeHolderDAO stakeholDao){
		this.companyDao = companyDao;
		this.stakeHolderDAO = stakeholDao;
	}

	@Override
	@Transactional
	public void create(CompanyDetails company) {
		companyDao.create(company);
	}

	@Override
	@Transactional
	public void delete(CompanyDetails company) {
		companyDao.delete(company.getId());

	}

	@Override
	@Transactional
	public void update(CompanyDetails company) {
		companyDao.update(company);
	}

	@Override
	@Transactional
	public CompanyDetails get() {
		return companyDao.getCompany();
	}

	@Override
	public List<CompanyDetails> getCompanies() {
		return companyDao.getCompanies();

	}

	@Override
	public List<StakeHolder> getStakeHolders(CompanyDetails company) {
		return companyDao.getStakeHolders(company);
	}

	@Override
	@Transactional
	public void create(StakeHolder stkholder) {
		stakeHolderDAO.create(stkholder);
	}

	@Override
	public void update(StakeHolder selectedStakeHolder) {
		stakeHolderDAO.update(selectedStakeHolder);

	}

	@Override
	@Transactional
	public void delete(StakeHolder selectedStakeHolder) {
		stakeHolderDAO.delete(selectedStakeHolder.getId());
	}

	@Override
	@Transactional
	public CompanyDetails merge(CompanyDetails company) {
		return companyDao.merge(company);	
	}
}
