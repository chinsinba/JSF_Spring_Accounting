package accounts.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.CustomerAccountDAO;
import accounts.app.dao.SupplierAccountDAO;
import accounts.model.entity.BankAccount;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.account.CustomerAccount;
import accounts.model.entity.account.SupplierAccount;

@Repository
@Component
public class SupplierAccountDAOImpl extends GenericDAOImpl<SupplierAccount> implements
		SupplierAccountDAO {

	@Override
	public List<SupplierAccount> findAll(CompanyDetails company) {
		Query query = em.createNamedQuery("SupplierAccount.findAll");
		query.setParameter("comp", company);
		try{
			return query.getResultList();
		}catch (Exception e) {
			return new ArrayList<SupplierAccount>();
		}
	}

}
