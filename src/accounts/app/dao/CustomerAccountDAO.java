package accounts.app.dao;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;

public interface CustomerAccountDAO extends GenericDao<CustomerAccount>{

	List<CustomerAccount> findAll(CompanyDetails company);
}
