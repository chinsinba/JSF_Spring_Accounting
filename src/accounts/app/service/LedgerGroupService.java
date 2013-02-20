package accounts.app.service;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerGroup;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
public interface LedgerGroupService {
	LedgerGroup create(LedgerGroup group);

	List<LedgerGroup> getSubGroups(CompanyDetails company);
	
	LedgerGroup find(long id);
	
}
