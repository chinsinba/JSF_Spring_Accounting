package accounts.app.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.CompanyDAO;
import accounts.app.service.CompanyService;
import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
@Service
public class CompanyServiceImpl implements CompanyService {
	private final CompanyDAO companyDao;

	@Inject
	public CompanyServiceImpl(CompanyDAO companyDao){
		this.companyDao = companyDao;
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
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public CompanyDetails get() {
		// TODO Auto-generated method stub
		return null;
	}

}
