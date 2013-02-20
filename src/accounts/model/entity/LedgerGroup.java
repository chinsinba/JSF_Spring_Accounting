package accounts.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@NamedQuery(name="LedgerGroup.findAll" , query="SELECT grp FROM LedgerGroup grp")
@Table(name="LEDGERGROUP")
public class LedgerGroup {
	
	@Id
	@TableGenerator(name = "LedgerGroup_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator = "LedgerGroup_GEN")
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@OneToOne
	private CompanyDetails company;
	
	private String groupName;
	
	@OneToOne
	private LedgerGroup subgroup;
	
	private String code;
	
	private String internalCode;

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

	public LedgerGroup getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(LedgerGroup subgroup) {
		this.subgroup = subgroup;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof LedgerGroup && ((LedgerGroup)obj).id==this.getId());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return  this.getClass().hashCode() + String.valueOf(getId()).hashCode();
	}

}
