package accounts.app.dao;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerGroup;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
public interface LedgerGroupDAO extends GenericDao<LedgerGroup>{

	List<LedgerGroup> getAllGroups(CompanyDetails company);
}
