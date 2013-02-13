package accounts.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.CompanyDAO;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.StakeHolder;

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

	@Override
	public List<StakeHolder> getStakeHolders(CompanyDetails company) {

		Query query = em.createNamedQuery("stakeHolder.findall");
//		query.setParameter("companyId", company.getId());
		try{
			return query.getResultList();
		}catch (Exception e) {
			return new ArrayList<StakeHolder>();
		}
	}

	@Override
	public CompanyDetails getCompany() {

		Query query = em.createNamedQuery("comp.getCompForUser");
		try{
			return (CompanyDetails) query.getSingleResult();
		}catch (Exception e) {
			return null;		
		}
	}

}
