package accounts.app.service.impl;

import accounts.app.dao.CompanyDAO;
import accounts.app.service.CompanyService;
import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
public class CompanyServiceImpl implements CompanyService {
	private final CompanyDAO companyDao;
	
	public CompanyServiceImpl(CompanyDAO companyDao){
		this.companyDao = companyDao;
	}

}
