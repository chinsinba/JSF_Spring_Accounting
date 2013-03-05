package accounts.model.entity.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import accounts.model.entity.CompanyDetails;
import accounts.model.entity.user.User;

@Entity
@Table(name="ITEMCATEGORY")
@NamedQuery(name="ItemCategory.findAll",query="SELECT ite FROM ItemCategory ite WHERE ite.company=:comp")
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

	
	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToOne
	private CompanyDetails company;

	private String categoryName;

	@OneToOne
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

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ItemCategory && ((ItemCategory) obj).getId()==this.getId())
			return true;

		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return  this.getClass().hashCode() + String.valueOf(getId()).hashCode();
	}
}

