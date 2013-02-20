package accounts.app.dao;

import java.util.List;

import accounts.model.entity.BankAccount;

/**
 * 
 * @author syed
 *
 */
public interface BankAccountDAO extends GenericDao<BankAccount> {

	List<BankAccount> findAll();
}
