package accounts.app.service;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.StakeHolder;

/**
 * 
 * @author syed
 *
 */
public interface CompanyService {
	public void create(CompanyDetails company);
	public void delete(CompanyDetails company);
	public void update(CompanyDetails company);
	public CompanyDetails get();
	public List<CompanyDetails> getCompanies();
	
	public List<StakeHolder> getStakeHolders(CompanyDetails company);
}
