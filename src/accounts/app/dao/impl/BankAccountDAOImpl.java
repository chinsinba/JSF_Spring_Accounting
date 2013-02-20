package accounts.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.BankAccountDAO;
import accounts.model.entity.BankAccount;

/**
 * 
 * @author syed
 *
 */
@Repository
@Component
public class BankAccountDAOImpl extends GenericDAOImpl<BankAccount> implements BankAccountDAO{

	@Override
	public List<BankAccount> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
