package accounts.app.service;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;
import accounts.model.entity.account.SupplierAccount;

public interface SupplierAccountService {

	SupplierAccount create(SupplierAccount custAccount);
	List<SupplierAccount> findAll(CompanyDetails company);

}
