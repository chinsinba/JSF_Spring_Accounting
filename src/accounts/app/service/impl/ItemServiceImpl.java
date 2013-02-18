package accounts.app.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import accounts.app.dao.ItemDAO;
import accounts.app.service.ItemService;
import accounts.model.entity.item.Item;

@Service
public class ItemServiceImpl implements ItemService {

	private ItemDAO itemDao;

	@Inject
	public ItemServiceImpl(ItemDAO itemDao){
		this.itemDao = itemDao;
	}

	public Item create(Item itemObj)
	{
		return itemDao.create(itemObj);
	}

	public void delete(Item itemObj){
		itemDao.delete(itemObj.getId());
	}

	public Item update(Item itemObj)
	{
		return itemDao.update(itemObj);
	}
}
