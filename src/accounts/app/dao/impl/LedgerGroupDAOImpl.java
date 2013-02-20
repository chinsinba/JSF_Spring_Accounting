package accounts.app.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.LedgerGroupDAO;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerGroup;


/**
 * 
 * @author syed
 *
 */
@Component
@Repository
public class LedgerGroupDAOImpl extends GenericDAOImpl<LedgerGroup> implements LedgerGroupDAO{

	@Override
	public List<LedgerGroup> getAllGroups(CompanyDetails company) {
		Query query = em.createNamedQuery("LedgerGroup.findAll");
//		query.setParameter("comp", company);
		try{
			return (List<LedgerGroup>) query.getResultList();
		}catch (Exception e) {
			return null;		
		}
	}
}
