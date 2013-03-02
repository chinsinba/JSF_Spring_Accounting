package accounts.app.service;

import java.util.List;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.item.ItemCategory;

public interface ItemGroupService {

	ItemCategory create(ItemCategory group);

	List<ItemCategory> getSubGroups(CompanyDetails company);

	ItemCategory find(long id);

}
