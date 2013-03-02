package accounts.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accounts.app.dao.ItemGroupDAO;
import accounts.app.service.ItemGroupService;
import accounts.model.entity.CompanyDetails;
import accounts.model.entity.item.ItemCategory;

@Service
public class ItemGroupServiceImpl implements ItemGroupService {

	private final ItemGroupDAO itemGroupDAO;

	@Inject
	public ItemGroupServiceImpl(ItemGroupDAO ledgerGroupDAO)
	{
		this.itemGroupDAO = ledgerGroupDAO;
	}

	@Override
	@Transactional
	public ItemCategory create(ItemCategory group) {
		return itemGroupDAO.create(group);
	}

	@Override
	public List<ItemCategory> getSubGroups(CompanyDetails company) {
		// TODO Auto-generated method stub
		return itemGroupDAO.getAllGroups(company);
	}

	@Override
	public ItemCategory find(long id) {
		// TODO Auto-generated method stub
		return itemGroupDAO.find(id);
	}

}
