package accounts.model.entity.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

import accounts.model.entity.CompanyDetails;

@Entity
public class ItemCategory {

	@Id
	@TableGenerator(name = "ItemCategory_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "ItemCategory_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne
	private CompanyDetails company;

	private String categoryName;

	@ManyToOne
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

