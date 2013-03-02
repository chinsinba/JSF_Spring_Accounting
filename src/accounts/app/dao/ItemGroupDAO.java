package accounts.app.dao;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.item.ItemCategory;

public interface ItemGroupDAO  extends GenericDao<ItemCategory>{

	List<ItemCategory> getAllGroups(CompanyDetails company);

}
