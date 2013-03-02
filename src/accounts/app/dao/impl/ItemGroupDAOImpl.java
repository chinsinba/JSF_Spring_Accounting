package accounts.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.ItemGroupDAO;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.LedgerGroup;
import accounts.model.entity.item.ItemCategory;

@Repository
@Component
public class ItemGroupDAOImpl extends GenericDAOImpl<ItemCategory> implements ItemGroupDAO{

	@Override
	public List<ItemCategory> getAllGroups(CompanyDetails company) {
		Query query = em.createNamedQuery("ItemCategory.findAll");
		query.setParameter("comp", company);
		try{
			return (List<ItemCategory>) query.getResultList();
		}catch (Exception e) {
			return new ArrayList<ItemCategory>();		
		}
	}

}
