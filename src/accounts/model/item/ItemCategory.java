package accounts.model.item;

import accounts.model.CompanyDetails;

public class ItemCategory {

	private CompanyDetails company;

	private String categoryName;

	private ItemCategory belongsToCategory;
	
	private String internalCode;

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public ItemCategory getBelongsToCategory() {
		return belongsToCategory;
	}

	public void setBelongsToCategory(ItemCategory belongsToCategory) {
		this.belongsToCategory = belongsToCategory;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}
	
	

}

