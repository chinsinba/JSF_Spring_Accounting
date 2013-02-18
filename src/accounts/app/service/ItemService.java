package accounts.app.service;

import accounts.model.entity.item.Item;

public interface ItemService {

	Item create(Item itemObj);
	void delete(Item itemObj);
	Item update(Item itemObj);
}
