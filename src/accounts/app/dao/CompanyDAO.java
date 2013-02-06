package accounts.app.dao;

import java.util.List;

import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
public interface CompanyDAO extends GenericDao<CompanyDetails> {

	List<CompanyDetails> getCompanies();

}
