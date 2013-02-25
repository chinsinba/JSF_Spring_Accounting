package accounts.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.CustomerAccountDAO;
import accounts.model.entity.BankAccount;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;

@Repository
@Component
public class CustomerAccountDAOImpl extends GenericDAOImpl<CustomerAccount> implements
		CustomerAccountDAO {

	@Override
	public List<CustomerAccount> findAll(CompanyDetails company) {
		Query query = em.createNamedQuery("CustomerAccount.findAll");
		query.setParameter("comp", company);
		try{
			return query.getResultList();
		}catch (Exception e) {
			return new ArrayList<CustomerAccount>();
		}
	}

}
