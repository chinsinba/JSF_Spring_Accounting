package accounts.app.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */

public interface LedgerAccountDAO extends GenericDao<LedgerAccount>{
	List<LedgerAccount> findAll(CompanyDetails compaDetails);
}
