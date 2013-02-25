package accounts.app.service;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;
import accounts.model.entity.account.OtherAccount;
import accounts.model.entity.account.SupplierAccount;

public interface OtherAccountService {

	OtherAccount create(OtherAccount custAccount);
	List<OtherAccount> findAll(CompanyDetails company);

}
