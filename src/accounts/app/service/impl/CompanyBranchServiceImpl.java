package accounts.app.service.impl;

import accounts.app.dao.CompanyBranchDAO;
import accounts.app.service.CompanyBranchService;
import accounts.model.entity.CompanyDetails;
/**
 * 
 * @author syed
 *
 */
public class CompanyBranchServiceImpl implements CompanyBranchService{

	private final CompanyBranchDAO companyBranchDao;

	public CompanyBranchServiceImpl(CompanyBranchDAO companyBranchDao){
		this.companyBranchDao = companyBranchDao;
	}

}
