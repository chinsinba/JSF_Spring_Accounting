package accounts.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.BankAccountDAO;
import accounts.model.entity.BankAccount;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerAccount;

/**
 * 
 * @author syed
 *
 */
@Repository
@Component
public class BankAccountDAOImpl extends GenericDAOImpl<BankAccount> implements BankAccountDAO{

	@Override
	public List<BankAccount> findAll(CompanyDetails compDetails) {
		Query query = em.createNamedQuery("BankAccount.findAll");
		query.setParameter("comp", compDetails);
		try{
			return query.getResultList();
		}catch (Exception e) {
			return new ArrayList<BankAccount>();
		}
	}

}
