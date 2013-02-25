package accounts.app.dao;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;
import accounts.model.entity.account.OtherAccount;
import accounts.model.entity.account.SupplierAccount;

public interface OtherAccountDAO extends GenericDao<OtherAccount>{

	List<OtherAccount> findAll(CompanyDetails company);
}
