package accounts.app.service;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerAccount;



/**
 * 
 * @author syed
 *
 */
public interface LedgerAccountService {
	
	LedgerAccount find(long id);
	
	LedgerAccount create(LedgerAccount ledAcc);
	
	List<LedgerAccount> findAll(CompanyDetails company);
}
