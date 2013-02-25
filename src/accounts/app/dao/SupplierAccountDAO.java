package accounts.app.dao;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;
import accounts.model.entity.account.SupplierAccount;

public interface SupplierAccountDAO extends GenericDao<SupplierAccount>{

	List<SupplierAccount> findAll(CompanyDetails company);
}
