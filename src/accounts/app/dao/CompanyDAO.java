package accounts.app.dao;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.StakeHolder;

/**
 * 
 * @author syed
 *
 */
public interface CompanyDAO extends GenericDao<CompanyDetails> {

	List<CompanyDetails> getCompanies();
	List<StakeHolder> getStakeHolders(CompanyDetails company);
	CompanyDetails getCompany();
}
