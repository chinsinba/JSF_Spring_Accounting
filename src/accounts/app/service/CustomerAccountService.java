package accounts.app.service;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;

public interface CustomerAccountService {

	CustomerAccount create(CustomerAccount custAccount);
	List<CustomerAccount> findAll(CompanyDetails company);

}
