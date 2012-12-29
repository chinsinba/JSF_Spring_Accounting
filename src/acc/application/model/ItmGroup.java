package acc.application.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the itm_group database table.
 * 
 */
@Entity
@Table(name="itm_group")
public class ItmGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name = "ItmGroup_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(generator = "ItmGroup_GEN")
	private long itemGroupId;

	@Column(name="Company_Name")
	private String company_Name;

	@Column(name="itm_category")
	private String itmCategory;

	@Column(name="itm_group_name")
	private String itmGroupName;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="itmGroup")
	private Set<Item> items;

    public ItmGroup() {
    }

	public long getItemGroupId() {
		return this.itemGroupId;
	}

	public void setItemGroupId(long itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public String getCompany_Name() {
		return this.company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	public String getItmCategory() {
		return this.itmCategory;
	}

	public void setItmCategory(String itmCategory) {
		this.itmCategory = itmCategory;
	}

	public String getItmGroupName() {
		return this.itmGroupName;
	}

	public void setItmGroupName(String itmGroupName) {
		this.itmGroupName = itmGroupName;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
}