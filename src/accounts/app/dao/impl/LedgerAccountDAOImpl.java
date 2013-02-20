package accounts.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.LedgerAccountDAO;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerAccount;
import accounts.model.entity.StakeHolder;
import accounts.model.entity.user.User;


/**
 * 
 * @author syed
 *
 */
@Component
@Repository
public class LedgerAccountDAOImpl extends GenericDAOImpl<LedgerAccount> implements LedgerAccountDAO{

	@Override
	public List<LedgerAccount> findAll(CompanyDetails compaDetails) {

		Query query = em.createNamedQuery("LedgerAccount.findAll");
		query.setParameter("comp", compaDetails);
		try{
			return query.getResultList();
		}catch (Exception e) {
			return new ArrayList<LedgerAccount>();
		}
	}
}
