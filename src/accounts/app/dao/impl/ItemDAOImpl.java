package accounts.app.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import accounts.app.dao.ItemDAO;
import accounts.model.entity.item.Item;

@Repository
@Component
public class ItemDAOImpl extends GenericDAOImpl<Item> implements ItemDAO {

}
