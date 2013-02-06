package accounts.app.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.CompanyDAO;
import accounts.model.entity.CompanyDetails;

/**
 * 
 * @author syed
 *
 */
@Repository
@Component
public class CompanyDAOImpl extends GenericDAOImpl<CompanyDetails> implements CompanyDAO{

	@Override
	public List<CompanyDetails> getCompanies() {
		/*final StringBuffer queryString = new StringBuffer(
				"SELECT * from ");

		queryString.append(" COMPANYDETAILS ");	 */  
		Query query = em.createNamedQuery("comp.findall");

		return query.getResultList();
	}

}
